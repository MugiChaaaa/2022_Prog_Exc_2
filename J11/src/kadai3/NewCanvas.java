package kadai3;

import java.awt.*;

public class NewCanvas extends Canvas
{
    int Red = 127, Green = 127, Blue = 127;
    public void paint(Graphics g)
    {
        int height = this.getHeight();
        int width = this.getWidth();
        g.setColor(new Color(Red, Green, Blue));
        g.fillRect(4, 4, 256, 256);
    }
}
