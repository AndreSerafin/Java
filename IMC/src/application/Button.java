package application;

import javax.swing.*;
import java.awt.*;

public class Button extends JButton {

    public Button(int x, int y, int width, int height, String text, Font font) {
        setText(text);
        setBounds(x, y, width, height);
        setForeground(new Color(248, 242, 242));
        setBackground(new Color(43, 159, 83));
        setFocusable(false);
        setFont(font);

    }
}
