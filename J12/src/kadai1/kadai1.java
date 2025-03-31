package kadai1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class kadai1 extends JFrame implements ActionListener {
    NewCanvas myCanvas;

    kadai1(String title) {
        super(title);

        setLayout(new BorderLayout());

        myCanvas = new NewCanvas();
        myCanvas.setSize(300, 300);

        JPanel p1 = new JPanel();
        JButton b1 = new JButton("↑");
        b1.addActionListener(this);
        JButton b2 = new JButton("↓");
        b2.addActionListener(this);
        JButton b3 = new JButton("→");
        b3.addActionListener(this);
        JButton b4 = new JButton("←");
        b4.addActionListener(this);
        JButton b5 = new JButton("Center");
        b5.addActionListener(this);

        JPanel p2 = new JPanel();
        JButton bColor1 = new JButton("Blue");
        bColor1.addActionListener(this);
        JButton bColor2 = new JButton("Red");
        bColor2.addActionListener(this);

        p1.setLayout(new BorderLayout());
        p1.add(b1, BorderLayout.NORTH);
        p1.add(b2, BorderLayout.SOUTH);
        p1.add(b3, BorderLayout.EAST);
        p1.add(b4, BorderLayout.WEST);
        p1.add(b5, BorderLayout.CENTER);

        p2.setLayout(new GridLayout(1, 2));
        p2.add(bColor1);
        p2.add(bColor2);

        add(myCanvas, BorderLayout.NORTH);
        add(p1, BorderLayout.CENTER);
        add(p2, BorderLayout.SOUTH);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 600);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("Red") || e.getActionCommand().equals("Blue"))
            myCanvas.color = e.getActionCommand();
        else
            myCanvas.command = e.getActionCommand();
        myCanvas.repaint();
    }

    public static void main(String[] args) {
        new kadai1("Kadai1");
    }
}
