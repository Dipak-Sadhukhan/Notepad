package notepad;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class About extends JFrame implements ActionListener{
    About(){
        
        setBounds(400,100,700,500);
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("notepad/Icons/windows.png"));
        Image i2 = i1.getImage().getScaledInstance(300, 60, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel headerIcon = new JLabel(i3);
        headerIcon.setBounds(70,40,400,80);
        add(headerIcon);
        
        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("notepad/Icons/note.png"));
        Image i5 = i4.getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel icon = new JLabel(i6);
        icon.setBounds(50,180,70,70);
        add(icon);
        
        JLabel text = new JLabel("<html>Copy of a Notepad<br>Java Swing Project<br>"
                + "The Notepad project demonstrates proficiency in Java programming<br>"
                + "particularly in developing desktop applications with AWT and Swing.<br>"
                + "<br>Notepad is a word processing program, <br>"
                + "which allows changing of text in a computer file."
                + "<br>Notepad is a simple text editor for basic text-editing program<br> "
                + "which enables computer users to create documents.</html>");
        text.setBounds(150,130,500,300);
        text.setFont(new Font("SAN SERIF",Font.PLAIN,16));
        add(text);
        
        JButton b1 = new JButton("Okay");
        b1.setBounds(580,500,80,25);
        b1.addActionListener(this);
        add(b1);
        
        setVisible(true);
        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae){
        this.setVisible(false);
    }
    public static void main(String args[]){
        new About().setVisible(true);
        
    }
    
}
