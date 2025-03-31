package kadai3;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class kadai3 extends JFrame implements ChangeListener {
    JLabel labelR;
    JLabel labelG;
    JLabel labelB;
    JLabel none = new JLabel("  ");
    JSlider sliderR;
    JSlider sliderG;
    JSlider sliderB;
    NewCanvas myCanvas;

    kadai3(String title) {
        super(title);

        myCanvas = new NewCanvas();
        myCanvas.setSize(256,256);

        sliderR = new JSlider(JSlider.HORIZONTAL, 0, 255, 127);
        sliderG = new JSlider(JSlider.HORIZONTAL, 0, 255, 127);
        sliderB = new JSlider(JSlider.HORIZONTAL, 0, 255, 127);
        labelR = new JLabel();
        labelG = new JLabel();
        labelB = new JLabel();
        labelR.setText("R " + sliderR.getValue());
        labelR.setAlignmentX(Component.CENTER_ALIGNMENT);
        labelG.setText("G " + sliderG.getValue());
        labelG.setAlignmentX(Component.CENTER_ALIGNMENT);
        labelB.setText("B " + sliderB.getValue());
        labelB.setAlignmentX(Component.CENTER_ALIGNMENT);

        sliderR.addChangeListener(this);
        sliderG.addChangeListener(this);
        sliderB.addChangeListener(this);

        JPanel p = (JPanel)getContentPane();
        p.setLayout(new BoxLayout(p, BoxLayout.PAGE_AXIS));
        p.add(myCanvas);
        p.add(sliderR);
        p.add(labelR);
        p.add(sliderG);
        p.add(labelG);
        p.add(sliderB);
        p.add(labelB);
        p.add(none);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(280,450);
        setVisible(true);
    }

    public void stateChanged(ChangeEvent e)
    {
        labelR.setText("R " + sliderR.getValue());
        labelR.setAlignmentX(Component.CENTER_ALIGNMENT);
        labelG.setText("G " + sliderG.getValue());
        labelG.setAlignmentX(Component.CENTER_ALIGNMENT);
        labelB.setText("B " + sliderB.getValue());
        labelB.setAlignmentX(Component.CENTER_ALIGNMENT);
        myCanvas.Red = sliderR.getValue();
        myCanvas.Green = sliderG.getValue();
        myCanvas.Blue = sliderB.getValue();
        myCanvas.repaint();
    }

    public static void main(String[] args)
    {
        new kadai3("Color Palette");
    }
}