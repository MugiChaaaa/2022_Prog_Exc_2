package kadai3;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;

class kadai3 extends JFrame implements ActionListener
{
    TextArea ta = new TextArea(40, 80);

    String menuOpen="Open";
    String menuSave="Save";
    String menuEnd="Exit";

    kadai3(String title)
    {
        super(title);

        JPanel p = (JPanel) getContentPane();
        p.setLayout(new FlowLayout());
        ta.setText("");
        p.add(ta);

        JMenuBar menubar = new JMenuBar();
        setJMenuBar(menubar);
        JMenu fileMenu = new JMenu("File");
        JMenuItem open = new JMenuItem(menuOpen);
        JMenuItem close = new JMenuItem(menuSave);
        JMenuItem end = new JMenuItem(menuEnd);
        menubar.add(fileMenu);
        fileMenu.add(open);
        fileMenu.add(close);
        fileMenu.add(end);
        open.addActionListener(this);
        close.addActionListener(this);
        end.addActionListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(10, 10, 800, 800);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
        String cmd = ae.getActionCommand();
        String FileDirectory;
        String FileName;
        if(cmd.equals(menuOpen)){
            FileDialog fileDialog =
                    new FileDialog(this,"Opening file",FileDialog.LOAD);
            fileDialog.setFile("*.txt");
            fileDialog.setVisible(true);
            FileDirectory = fileDialog.getDirectory();
            FileName = fileDialog.getFile();
            try
            {
                BufferedReader br = new BufferedReader(new FileReader(FileDirectory + FileName));
                ta.setText(br.readLine() + "\r\n");
                String temp;
                while((temp = br.readLine()) != null)
                {
                    ta.append(temp + "\r\n");
                }
                br.close();
            }
            catch (FileNotFoundException e)
            {
                throw new RuntimeException(e);
            }
            catch (IOException e)
            {
                throw new RuntimeException(e);
            }
        }
        else if(cmd.equals(menuSave)) {
            FileDialog fileDialog =
                    new FileDialog(this,"Save the text file",FileDialog.SAVE);
            fileDialog.setFile("*.txt");
            fileDialog.setVisible(true);
            FileDirectory = fileDialog.getDirectory();
            FileName = fileDialog.getFile();
            try
            {
                BufferedWriter bw = new BufferedWriter(new FileWriter(FileDirectory + FileName));
                bw.write(ta.getText());
                bw.close();
            }
            catch (IOException e)
            {
                throw new RuntimeException(e);
            }
        }
        else if(cmd.equals(menuEnd)) {
            System.exit(0);
        }
    }

    public static void main(String[] args){
        new kadai3("Kadai3");
    }
}