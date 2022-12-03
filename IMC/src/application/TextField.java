package application;

import javax.swing.*;
import java.awt.*;

public class TextField extends JTextField {

    private JTextField textField;

    public TextField(int x, int y, int width, int height) {
        this.textField = new JTextField();
        setBounds(x, y, width, height);
    }

}
