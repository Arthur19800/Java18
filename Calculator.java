package homework.lesson_8.task8_1;

import javax.swing.*;
import java.awt.*;

public class Calculator extends JFrame {

    public Calculator() {
        setTitle("MyCalculator");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(100, 100, 300, 500);
        setLayout(new BorderLayout());


        TopFrame top = new TopFrame();
        add(top.getPanel(), BorderLayout.NORTH);


        BottomFrame bottom = new BottomFrame(top.getInputField());
        add(bottom.getPanel(), BorderLayout.CENTER);

        setVisible(true);
    }
}
