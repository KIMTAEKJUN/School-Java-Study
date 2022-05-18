package gui;

import javax.swing.*;
import java.awt.*;

public class JFrameGrid extends JFrame {
    public JFrameGrid() {
        setSize(600, 250);
        setLayout(new GridLayout(2, 3, 2, 3));

        add(new Button("Btn1"));
        add(new Button("Btn2"));
        add(new Button("Btn3"));
        add(new Button("Btn4"));
        add(new Button("Btn5"));
        add(new Button("Btn6"));

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new JFrameGrid();
    }
}

//    public class Main extends JFrame {
//
//    public JPanel panel;
//    public JTextField tField;
//    public JButton[] buttons;
//    public String[] labels = {
//            "Backspace", "", "", "CE", "C",
//            "7", "8", "9", "/", "sqrt",
//            "4", "5", "6", "x", "%",
//            "1", "2", "3", "-", "1/x",
//            "0", "+/-", ".", "+", "=",
//    };
//
//
//    public Main() {
//        tField = new JTextField(35);
//        panel = new JPanel();
//        tField.setText("0.");
//        tField.setEnabled(false);
//
//        panel.setLayout(new GridLayout(0, 5, 3, 3));
//        buttons = new JButton[25];
//        int index = 0;
//        for (int rows = 0; rows < 5; rows++) {
//            for (int cols = 0; cols < 5; cols++) {
//                buttons[index] = new JButton(labels[index]);
//                if( cols >= 3 )
//                    buttons[index].setForeground(Color.red);
//                else
//                    buttons[index].setForeground(Color.blue);
//                buttons[index].setBackground(Color.yellow);
//                panel.add(buttons[index]);
//                index++;
//            }
//        }
//        add(tField, BorderLayout.NORTH);
//        add(panel, BorderLayout.CENTER);
//        setVisible(true);
//        pack();
//    }
//
//    public static void main(String args[]) {
//        Main s = new Main();
//    }
//}