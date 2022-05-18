package gui;

import javax.swing.*;
import java.awt.*;

public class JFramePanel extends JFrame {
    public JFramePanel() {
        JPanel panel = new JPanel();
        panel.setBackground(Color.pink);

        JButton btn1 = new JButton("Btn1");
        btn1.setBackground(Color.LIGHT_GRAY);

        JButton btn2 = new JButton("Btn2");
        btn2.setBackground(Color.GRAY);

        panel.add(btn1); // 버튼을 패널에 추가
        panel.add(btn2);
        add(panel); // 패널을 프레임에 추가

        setSize(300, 150);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new JFramePanel();
    }
}
