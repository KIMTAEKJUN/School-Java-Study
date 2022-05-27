package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChangeBackground extends JFrame {
    private JButton btn1;
    private JButton btn2;
    private JButton btn3;
    private JPanel panel;
    MyListener listener = new MyListener();

    public ChangeBackground() {
        this.setSize(600, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("이벤트 예제");

        panel = new JPanel();
        panel.setLayout(new GridBagLayout());

        btn1 = new JButton("Click, Change Pink!");
        btn1.addActionListener(listener);
        panel.add(btn1);

        btn2 = new JButton("Click, Change Light_Gray!");
        btn2.addActionListener(listener);
        panel.add(btn2);

        btn3 = new JButton("Click, Change Orange!");
        btn3.addActionListener(listener);
        panel.add(btn3);

        this.add(panel);
        this.setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private class MyListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == btn1) {
                panel.setBackground(Color.PINK);
            } else if (e.getSource() == btn2) {
                panel.setBackground(Color.LIGHT_GRAY);
            } else if (e.getSource() == btn3) {
                panel.setBackground(Color.ORANGE);
            }
        }
    }

    public static void main(String[] args) {
        new ChangeBackground();
    }
}
