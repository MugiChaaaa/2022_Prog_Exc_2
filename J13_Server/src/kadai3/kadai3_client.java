package kadai3;

import java.io.*;
import java.net.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class kadai3_client extends JFrame implements ActionListener
{
    String server;
    int port;

    JTextField txt1 = new JTextField(16);
    JTextField txt2 = new JTextField(16);
    kadai3_client(String title, String server, int port)
    {
        super(title);

        this.server = server;
        this.port = port;

        JPanel p1 = (JPanel)getContentPane();
        JPanel p2 = new JPanel();

        txt1.setHorizontalAlignment(JTextField.CENTER);
        txt2.setHorizontalAlignment(JTextField.CENTER);

        JButton bs = new JButton("Send");
        bs.addActionListener(this);

        p1.setLayout(new BorderLayout(20, 0));

        p2.setLayout(new FlowLayout());
        p2.add(txt1);
        p2.add(txt2);

        p1.add(p2, BorderLayout.CENTER);
        p1.add(bs, BorderLayout.SOUTH);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(200, 200);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
    {
        try
        {
            Socket s = new Socket(server, port);

            InputStream is = s.getInputStream();
            ObjectInputStream ois = new ObjectInputStream(is);
            OutputStream os = s.getOutputStream();
            DataOutputStream dos = new DataOutputStream(os);
            dos.writeUTF(txt1.getText());
            Prefecture p = (Prefecture)ois.readObject();
            txt2.setText(p.toString());

            s.close();
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
    }

    public static void main(String args[])
    {
        new kadai3_client("Kadai3", args[0], Integer.parseInt(args[1]));
    }
}
