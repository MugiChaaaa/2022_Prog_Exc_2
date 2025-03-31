package kadai1;

import java.awt.*;

public class NewCanvas extends Canvas
{
    String name;
    NewCanvas() {
        this.name = "Sin";
    }

    public void paint(Graphics g)
    {
        int height = this.getHeight();
        int width = this.getWidth();
        double n1 = 0, n2 = 0;

        g.setColor(Color.GREEN);
        g.fillRect(0, 0, width - 1, height - 1);

        g.setColor(Color.BLACK);
        Font f = new Font("test", Font.BOLD, 30);
        g.setFont(f);
        g.drawString(name, width/2 - 35, height/4);

        for (int i = 0; i <= 360-1; i++)
        {
            double rad1 = i * (Math.PI / 180.0);
            double rad2 = (i + 1) * (Math.PI / 180.0);
            if (name.equals("Sin"))
            {
                n1 = Math.sin(rad1);
                n2 = Math.sin(rad2);
            }
            else if (name.equals("Cos"))
            {
                n1 = Math.cos(rad1);
                n2 = Math.cos(rad2);
            }
            int y1 = height/2 - (int)(n1 * height/2);
            int y2 = height/2  - (int)(n2 * height/2);
            g.drawLine(i, y1, i+1, y2);
        }
    }
}
