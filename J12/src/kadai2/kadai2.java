package kadai2;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class kadai2 extends JFrame implements ActionListener
{
    StringBuffer number;
    boolean isInit = true;
    JLabel Lnum = new JLabel(" ");
    kadai2(String title)
    {
        super(title);

        setLayout(new BorderLayout());

        JPanel p1 = new JPanel();
        Lnum.setHorizontalAlignment(JTextField.CENTER);

        JPanel p2 = new JPanel();
        for (int i = 0; i < 10; i++)
        {
            JButton b = new JButton(Integer.toString(i));
            b.addActionListener(this);
            p2.add(b);
        }
        JButton bp = new JButton("+");
        bp.addActionListener(this);
        JButton be = new JButton("=");
        be.addActionListener(this);

        p1.setLayout(new FlowLayout());
        p1.add(Lnum);
        add(p1, BorderLayout.NORTH);

        p2.setLayout(new GridLayout(4, 3));
        p2.add(bp);
        p2.add(be);
        add(p2, BorderLayout.CENTER);


        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(200, 200);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        number = new StringBuffer(Lnum.getText());
        if(isInit && !e.getActionCommand().equals("+"))
        {
            number.replace(0, number.length(), e.getActionCommand());
            Lnum.setText(number.toString());
            isInit = false;
        }
        else if(e.getActionCommand().equals("+"))
        {
            number.append(e.getActionCommand());
            Lnum.setText(number.toString());
            isInit = false;
        }
        else if(e.getActionCommand().equals("="))
        {
            String[] numbers = number.toString().split("\\+");
            int sum = 0;
            for (String number : numbers)
            {
                sum += Integer.parseInt(number);
            }
            Lnum.setText(Integer.toString(sum));
            isInit = true;
        }
        else
        {
            number.append(e.getActionCommand());
            Lnum.setText(number.toString());
        }
    }

    public static void main(String[] args)
    {
        new kadai2("Kadai2");
    }
}