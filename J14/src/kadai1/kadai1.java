package kadai1;

import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;

public class kadai1 extends JFrame implements ChangeListener
{
    JLabel labelS;
    JLabel labelR;
    JLabel none = new JLabel("  ");
    JSlider sliderS;
    JSlider sliderR;
    NewCanvasDB myCanvas;

    ActionListener taskPerformer = new ActionListener() {
        public void actionPerformed(ActionEvent evt) {
            myCanvas.repaint();
        }
    };

    Timer timer = new Timer(10, taskPerformer); //100 FPS

    kadai1(String title) {
        super(title);

        RepaintManager currentManager = RepaintManager.currentManager(this);
        currentManager.setDoubleBufferingEnabled(true);

        myCanvas = new NewCanvasDB();
        myCanvas.setSize(200,200);

        sliderS = new JSlider(JSlider.HORIZONTAL, 1, 100, 50);
        sliderR = new JSlider(JSlider.HORIZONTAL, 1, 100, 50);
        labelS = new JLabel();
        labelR = new JLabel();
        labelS.setText("Speed: " + sliderS.getValue());
        labelS.setAlignmentX(Component.CENTER_ALIGNMENT);
        labelR.setText("Radius: " + sliderR.getValue());
        labelR.setAlignmentX(Component.CENTER_ALIGNMENT);

        sliderS.addChangeListener(this);
        sliderR.addChangeListener(this);

        JPanel p = (JPanel)getContentPane();
        p.setLayout(new FlowLayout());
        p.add(myCanvas);
        p.add(sliderS);
        p.add(labelS);
        p.add(sliderR);
        p.add(labelR);
        p.add(none);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(220,350);
        setVisible(true);

        myCanvas.init();
        timer.start();
    }

    public void stateChanged(ChangeEvent e)
    {
        labelS.setText("Speed: " + sliderS.getValue());
        labelS.setAlignmentX(Component.CENTER_ALIGNMENT);
        labelR.setText("Radius: " + sliderR.getValue());
        labelR.setAlignmentX(Component.CENTER_ALIGNMENT);
        myCanvas.setSpeed(sliderS.getValue());
        myCanvas.setRadius(sliderR.getValue());
        myCanvas.setTime();
    }

    public static void main(String[] args)
    {
        new kadai1("Circular Motion");
    }
}
