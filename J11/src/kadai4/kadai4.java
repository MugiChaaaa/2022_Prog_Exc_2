package kadai4;

import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import javax.swing.*;

public class kadai4 extends JFrame  {
    JLabel label = new JLabel("Guess!");
    JPasswordField question = new JPasswordField(setNum(),16);
    JTextField ans = new JTextField(16);

    kadai4 (String title)
    {
        super(title);

        JPanel p = (JPanel)getContentPane();
        JButton button = new JButton("Guess");
        button.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                String str = ans.getText();
                if (str.equals(question.getText()))
                {
                    label.setText("Correct!");
                    question = new JPasswordField(setNum(),16);
                }
                else
                {
                    label.setText(judge(question, ans));
                }
            }
        });

        label.setHorizontalAlignment(JLabel.CENTER);
        question.setHorizontalAlignment(JPasswordField.CENTER);
        ans.setHorizontalAlignment(JTextField.CENTER);

        p.setLayout(new FlowLayout());
        p.add(label);
        p.add(question);
        p.add(ans);
        p.add(button);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(243,243);
        setVisible(true);
    }

    public static String judge(JPasswordField question, JTextField ans) {
        String str1 = ans.getText();
        String str2 = question.getText();
        int eat = 0;
        int bite = 0;
        for (int i = 0; i < 4; i++) {
            if (str1.charAt(i) == str2.charAt(i)) {
                eat++;
            } else if (str1.indexOf(str2.charAt(i)) != -1) {
                bite++;
            }
        }
        return eat + " EAT " + bite + " BITE";
    }

    public static String setNum()
    {
        Random random = new Random();
        int[] num = new int[4];
        for(int i = 0; i < 4; i++)
        {
            num[i] = random.nextInt(10);
            for(int j = 0; j < i; j++)
            {
                if(num[i] == num[j])
                {
                    i--;
                    break;
                }
            }
        }
        System.out.println(num[0] + "" + num[1] + "" + num[2] + "" + num[3]);
        return num[0] + "" + num[1] + "" + num[2] + "" + num[3];
    }

    public static void main(String[] args){
        new kadai4("NumerOn");
    }
}