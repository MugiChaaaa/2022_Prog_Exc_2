package kadai1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class kadai1 extends JFrame implements ActionListener {
    JLabel label;
    NewCanvas myCanvas;

    kadai1(String title) {
        super(title);

        myCanvas = new NewCanvas();
        myCanvas.setSize(361,201);

        JPanel p = (JPanel)getContentPane();
        JButton b1 = new JButton("Sin");
        b1.addActionListener(this);
        JButton b2 = new JButton("Cos");
        b2.addActionListener(this);
        label = new JLabel("      ");

        p.setLayout(new FlowLayout());
        p.add(myCanvas);
        p.add(b1);
        p.add(b2);
        p.add(label);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,300);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
    {
        myCanvas.name = e.getActionCommand();
        myCanvas.repaint();
    }

    public static void main(String[] args)
    {
        new kadai1("Trigonometric Functions");
    }
}