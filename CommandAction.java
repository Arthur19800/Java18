package homework.lesson_8.task8_1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CommandAction implements ActionListener {
    private final JTextField inputField;

    private double getResult;
    private String getLastCommand;
    private final StringBuilder sb;

     CommandAction(JTextField inputField) {
        this.inputField = inputField;
        sb = new StringBuilder();

    }

    public void actionPerformed(ActionEvent e) {
        sb.append(inputField.getText());
        sb.append(((JButton) e.getSource()).getText());
        inputField.setText(sb.toString());
        sb.setLength(0);

            calculate(Double.parseDouble(inputField.getText()));
            getLastCommand = inputField.getText();



    }

    public void calculate(double x) {
        if (getLastCommand.equals("+")) getResult += x;
        else if (getLastCommand.equals("-")) getResult -= x;
        else if (getLastCommand.equals("*")) getResult *= x;
        else if (getLastCommand.equals("/")) getResult /= x;
        else if (getLastCommand.equals("SQRT")) getResult = Math.sqrt(x);
        else if (getLastCommand.equals("=")) getResult = x;
        inputField.setText("" + getResult);

    }
}
