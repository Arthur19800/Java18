package homework.lesson_8.task8_1;

import javax.swing.*;
import java.awt.*;

public class TopFrame extends JFrame {
    private final JPanel panel;
    private final JTextField inputField;

    private double result;
    private String lastCommand;

    public TopFrame() {
        this.result = 0;

        this.lastCommand = "=";
        panel = new JPanel();
        panel.setLayout(new BorderLayout());
        inputField = new JTextField();
        inputField.setEditable(false);
        panel.add(inputField, BorderLayout.CENTER);

    }

    public JPanel getPanel() {     // зачем здесь именно getter
        return panel;
    }

    public JTextField getInputField() {
        return inputField;
    }



    public double getResult() {
        return result;
    }



    public String getLastCommand() {
        return lastCommand;
    }

    
}
