package kadai1;

import java.awt.*;

public class NewCanvas extends Canvas
{
    String command;
    String color;
    int posX, posY;

    NewCanvas() {
        this.command = "Center";
        this.color = "Blue";
    }

    public void paint(Graphics g)
    {
        int height = this.getHeight();
        int width = this.getWidth();

        Color myColor = new Color(255, 176, 193);

        g.setColor(myColor);
        g.fillRect(0, 0, width - 1, height - 1);

        if(color.equals("Blue"))
            g.setColor(Color.blue);
        else if(color.equals("Red"))
            g.setColor(Color.red);

        if(command.equals("↑"))
            posY -= 5;
        else if(command.equals("↓"))
            posY += 5;
        else if(command.equals("→"))
            posX += 5;
        else if(command.equals("←"))
            posX -= 5;
        else if(command.equals("Center"))
        {
            posX = width / 2 - 10;
            posY = height / 2 - 10;
        }
        command = " ";
        g.fillOval(posX, posY, 20, 20);
    }
}
