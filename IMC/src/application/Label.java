package application;

import javax.swing.*;
import java.awt.*;

public class Label extends JLabel{
    public Label(int x, int y, int width, int height, String text, Font font) {
        setText(text);
        setBounds(x, y, width, height);
        setFont(font);
    }

    public Label(int x, int y, int width, int height ) {
        setBounds(x, y, width, height);
    }
}
