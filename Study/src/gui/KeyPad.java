package gui;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class KeyPad extends JFrame implements ActionListener {
    private JTextField text;
    private JPanel panel;

    public KeyPad() {
        text = new JTextField(20);
        add(text, BorderLayout.NORTH);

        panel = new JPanel();
        panel.setLayout(new GridLayout(3, 3));
        add(panel, BorderLayout.CENTER);

        for (int i=1; i<=9; i++) {
            JButton btn = new JButton("" + i);
            btn.addActionListener(this);
            btn.setPreferredSize(new Dimension(100, 30));
            panel.add(btn);
        }

        pack();
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String actionCommand = e.getActionCommand();
        text.setText(text.getText() + actionCommand);
    }

    public static void main(String[] args) {
        new KeyPad();
    }
}
