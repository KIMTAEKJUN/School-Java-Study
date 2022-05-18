package gui;

import javax.swing.*;

//public class JFrameTest extends JFrame {
//    public static void main(String[] args) {
//        JFrameTest f = new JFrameTest();
//        f.setTitle("JFrameTest");
//        f.setSize(300, 200);
//        f.setVisible(true);
//        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//    }
//}

public class JFrameTest extends JFrame {
    public JFrameTest() {
        setTitle("JFrameTest");
        setSize(300, 200);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        JFrameTest f = new JFrameTest();
    }
}