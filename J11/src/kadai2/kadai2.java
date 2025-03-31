package kadai2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class kadai2 extends JFrame implements ActionListener
{
    JLabel label = new JLabel("0.0");
    JTextField ans = new JTextField(16);
    JRadioButton radio1;
    JRadioButton radio2;
    JRadioButton radio3;

    kadai2 (String title) {
        super(title);

        JPanel p = (JPanel)getContentPane();
        JButton button = new JButton("Compute");
        button.addActionListener(this);

        radio1 = new JRadioButton("Sin", true); //default
        radio2 = new JRadioButton("Cos", false);
        radio3 = new JRadioButton("Tan", false);
        ButtonGroup group = new ButtonGroup();
        group.add(radio1);
        group.add(radio2);
        group.add(radio3);

        ans.setHorizontalAlignment(JTextField.CENTER);

        p.setLayout(new FlowLayout());
        p.add(label);
        p.add(ans);
        p.add(radio1);
        p.add(radio2);
        p.add(radio3);
        p.add(button);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(200,200);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        boolean status1 = radio1.isSelected();
        boolean status2 = radio2.isSelected();
        boolean status3 = radio3.isSelected();
        label.setText(trig(status1, status2, status3, Double.parseDouble(ans.getText())));
    }

    public static String trig(boolean status1, boolean status2, boolean status3, double degree)
    {
        double rad = degree * (Math.PI / 180.0);
        String str;
        if (status1)
            str = Double.toString(Math.sin(rad));
        else if (status2)
            str = Double.toString(Math.cos(rad));
        else //status3
            str = Double.toString(Math.tan(rad));
        return str;
    }

    public static void main(String[] args){
        new kadai2("JTextField");
    }
}
