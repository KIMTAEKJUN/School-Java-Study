package gui;

import javax.swing.*;
import java.awt.*;

public class JFrameButton extends JFrame {
    public JFrameButton() {
        setTitle("JFrameButton");
        setSize(500, 300);
        setLocation(200, 300);
        setLayout(new FlowLayout());
        getContentPane().setBackground(Color.pink);
        JButton btn1 = new JButton("11111");
        JButton btn2 = new JButton("22222");
        add(btn1);
        add(btn2);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new JFrameButton();
    }
}
