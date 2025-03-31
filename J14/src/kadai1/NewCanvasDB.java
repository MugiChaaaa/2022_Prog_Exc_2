package kadai1;

import java.awt.*;

class NewCanvasDB extends Canvas {
    Dimension size;
    Image back;
    Graphics buffer;
    int c = 0, c_temp, radius = 50, speed = 50, x, y;
    double time = 0, angleRad = 0, anglePlus = 0;

    public void init()
    {
        size = getSize();
        back =  createImage(size.width, size.height);
        buffer = back.getGraphics();
    }

    public void update(Graphics g){
        paint(g);
    }

    public void paint(Graphics g) {
        angleRad = getAngle();
        x = (int)(radius * Math.cos(angleRad) + size.width/2);
        y = (int)(radius * (-Math.sin(angleRad)) + size.height/2);
        getColor();
        buffer.setColor(new Color(c, c, c));
        for (int i=0; i< size.width; i++) {
            buffer.drawLine(i, 0, i, size.height-1);
        }

        buffer.setColor(Color.RED);
        buffer.drawOval(size.width/2-radius, size.height/2-radius, radius*2, radius*2);

        buffer.setColor(Color.BLUE);
        buffer.fillOval(x-10, y-10, 20, 20);

        buffer.drawString("x=" + x + "  y=" + y, 5, size.height - 5);
        g.drawImage(back, 0, 0, this);
    }

    public double getAngle()
    {
        double angle = (double)speed/radius * (time/1000) + anglePlus;
        angle = angle % (2*Math.PI);
        time += 10;
        return angle;
    }
    public void setRadius(int r)
    {
        radius = r;
    }
    public void setSpeed(int s)
    {
        speed = s;
    }
    public void setTime()
    {
        anglePlus = getAngle();
        time = 0;
    }
    public void getColor()
    {
        c_temp = (int)(angleRad*255/Math.PI);
        if(c_temp < 510 && c_temp > 255)
            c = -c_temp + 510;
        else if(c_temp <= 255 && c_temp >= 0)
            c = c_temp;
        else if(c_temp >= 510)
            c = 255;
        else //c_temp < 0
            c = 0;
    }
}