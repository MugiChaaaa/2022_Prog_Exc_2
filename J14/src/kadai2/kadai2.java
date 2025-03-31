package kadai2;

import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import javax.swing.*;


public class kadai2 extends JFrame implements ActionListener
{
    JButton b0 = new JButton("stop0");
    JButton b1 = new JButton("stop1");
    JButton b2 = new JButton("stop2");
    JButton bs = new JButton("start");
    JTextField t0 = new JTextField("0");
    JTextField t1 = new JTextField("0");
    JTextField t2 = new JTextField("0");
    JLabel label = new JLabel();
    Random rand = new Random();

    ActionListener task0 = new ActionListener()
    {
        public void actionPerformed(ActionEvent evt)
        {
            t0.setText(random());
        }
    };
    ActionListener task1 = new ActionListener()
    {
        public void actionPerformed(ActionEvent evt)
        {
            t1.setText(random());
        }
    };
    ActionListener task2 = new ActionListener()
    {
        public void actionPerformed(ActionEvent evt)
        {
            t2.setText(random());
        }
    };

    Timer timer0 = new Timer(10, task0);
    Timer timer1 = new Timer(10, task1);
    Timer timer2 = new Timer(10, task2);

    kadai2 ()
    {
        b0.setEnabled(false);
        b1.setEnabled(false);
        b2.setEnabled(false);
        bs.setEnabled(true);
        bs.setPreferredSize(new Dimension(200, 27));

        t0.setEditable(false);
        t1.setEditable(false);
        t2.setEditable(false);
        t0.setHorizontalAlignment(JTextField.CENTER);
        t1.setHorizontalAlignment(JTextField.CENTER);
        t2.setHorizontalAlignment(JTextField.CENTER);
        t0.setFont(new Font("SanSerif",Font.ITALIC,75));
        t1.setFont(new Font("SanSerif",Font.ITALIC,75));
        t2.setFont(new Font("SanSerif",Font.ITALIC,75));

        b0.addActionListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);
        bs.addActionListener(this);

        JPanel p = new JPanel();
        JPanel pp = new JPanel();
        JPanel ppp0 = new JPanel();
        JPanel ppp1 = new JPanel();
        JPanel ppp2 = new JPanel();

        setLayout(new BorderLayout(0, 5));
        p.setLayout(new FlowLayout());
        pp.setLayout(new GridLayout(1, 3, 5, 5));
        ppp0.setLayout(new BorderLayout(0, 5));
        ppp1.setLayout(new BorderLayout(0, 5));
        ppp2.setLayout(new BorderLayout(0, 5));

        add(label, BorderLayout.NORTH);
        add(pp, BorderLayout.CENTER);
        add(p, BorderLayout.SOUTH);
        p.add(bs);

        pp.add(ppp0);
        pp.add(ppp1);
        pp.add(ppp2);

        ppp0.add(t0, BorderLayout.CENTER);
        ppp0.add(b0, BorderLayout.SOUTH);
        ppp1.add(t1, BorderLayout.CENTER);
        ppp1.add(b1, BorderLayout.SOUTH);
        ppp2.add(t2, BorderLayout.CENTER);
        ppp2.add(b2, BorderLayout.SOUTH);
    }

    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource()==bs)
        {
            label.setText("");
            b0.setEnabled(true);
            b1.setEnabled(true);
            b2.setEnabled(true);
            bs.setEnabled(false);
            timer0.start();
            timer1.start();
            timer2.start();
        }
        else if (e.getSource()==b0)
        {
            b0.setEnabled(false);
            timer0.stop();
        }
        else if (e.getSource()==b1)
        {
            b1.setEnabled(false);
            timer1.stop();
        }
        else if (e.getSource()==b2)
        {
            b2.setEnabled(false);
            timer2.stop();
        }
        if(isAllDisabled())
        {
            bs.setEnabled(true);
            if(isSame() && !isAllSeven())
                label.setText("Congrats!");
            else if(isSame() && isAllSeven())
                label.setText("★☆★ Lucky 777 ★☆★");
            label.setHorizontalAlignment(JLabel.CENTER);
        }
    }

    public String random()
    {
        return String.valueOf(rand.nextInt(10));
    }

    public boolean isSame()
    {
        return t0.getText().equals(t1.getText()) && t1.getText().equals(t2.getText());
    }

    public boolean isAllSeven()
    {
        return t0.getText().equals("7");
    }

    public boolean isAllDisabled()
    {
        return !b0.isEnabled() && !b1.isEnabled() && !b2.isEnabled() && !bs.isEnabled();
    }

    public static void main(String[] args)
    {
        kadai2 frame = new kadai2();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds((1920-240)/2, (1080-220)/2, 240, 220);
        frame.setTitle("Slot Machine");
        frame.setVisible(true);
    }
}