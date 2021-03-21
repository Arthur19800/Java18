package homework.lesson_8.task8_1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BottomFrame extends JFrame {

    private final JPanel panel;


    public BottomFrame(JTextField inputField) {


        panel = new JPanel();
        panel.setLayout(new GridLayout(5, 3));
        DigitButtonListener buttonListener = new DigitButtonListener(inputField);
        CommandAction commandListner = new CommandAction(inputField);
        for (int i = 0; i <= 9; i++) {
            JButton btn = new JButton(String.valueOf(i));
            btn.addActionListener(buttonListener);
            panel.add(btn);
        }
        add(panel, BorderLayout.CENTER);

        JButton equal = new JButton("=");
        equal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inputField.setText("=");
            }
        });
        panel.add(equal);

        JButton plus = new JButton("+");
        plus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inputField.setText("+");

            }
        });
        panel.add(plus);


        JButton minus = new JButton("-");
        minus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inputField.setText("-");
            }
        });
        panel.add(minus);


        JButton multiply = new JButton("*");
        multiply.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inputField.setText("*");
            }
        });
        panel.add(multiply);


        JButton divide = new JButton("/");
        divide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inputField.setText("/");
            }
        });
        panel.add(divide);


        JButton sqrt = new JButton("SQRT");
        sqrt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inputField.setText("SQRT");
            }
        });
        panel.add(sqrt);
        JButton clear = new JButton("C");
        clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inputField.setText("");
            }
        });
        panel.add(clear);
        JButton point = new JButton(".");
        point.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inputField.setText(".");
            }
        });
        panel.add(point);
    }



    public JPanel getPanel() {
        return panel;
    }


}
