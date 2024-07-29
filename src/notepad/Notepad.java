package notepad;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Notepad extends JFrame {
    
    Notepad(){
        
        setTitle("Notepad");
        
       ImageIcon notepadIcon = new ImageIcon(ClassLoader.getSystemResource("notepad/Icons/note.png"));
       Image icon = notepadIcon.getImage();
       setIconImage(icon);
       
       JMenuBar menubar = new JMenuBar();
       menubar.setBackground(Color.WHITE);
       
       JMenu File = new JMenu("File");
       File.setFont(new Font("AERIAL",Font.PLAIN,14)); 
       
       JMenuItem newdoc = new JMenuItem("New");
       newdoc.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N,ActionEvent.CTRL_MASK));
       
       JMenuItem open = new JMenuItem("Open");
       open.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O,ActionEvent.CTRL_MASK));
       
       JMenuItem save = new JMenuItem("Save");
       save.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S,ActionEvent.CTRL_MASK));
       
       JMenuItem print = new JMenuItem("Print");
       print.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P,ActionEvent.CTRL_MASK));
       
       JMenuItem exit = new JMenuItem("Exit");
       exit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE,ActionEvent.CTRL_MASK));
       
       menubar.add(File);
       File.add(newdoc);
       File.add(open);
       File.add(save);
       File.add(print);
       File.add(exit);

       
       JMenu edit = new JMenu("Edit");
       edit.setFont(new Font("AERIAL",Font.PLAIN,14)); 
       
       JMenuItem copy = new JMenuItem("Copy");
       copy.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C,ActionEvent.CTRL_MASK));
       
       JMenuItem paste = new JMenuItem("Paste");
       paste.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V,ActionEvent.CTRL_MASK));
       
       JMenuItem cut = new JMenuItem("Cut");
       cut.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X,ActionEvent.CTRL_MASK));
       
       JMenuItem select_all = new JMenuItem("Select All");
       select_all.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A,ActionEvent.CTRL_MASK));
       
       menubar.add(edit);
       edit.add(copy);
       edit.add(paste);
       edit.add(cut);
       edit.add(select_all);
       
       JMenu helpmenu = new JMenu("Help");
       helpmenu.setFont(new Font("AERIAL",Font.PLAIN,14)); 
       
       JMenuItem help = new JMenuItem("Help");
       help.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_H,ActionEvent.CTRL_MASK));
       
       menubar.add(helpmenu);
       helpmenu.add(help);
       
       setJMenuBar(menubar);
       
       JTextArea area = new JTextArea();
       area.setFont(new Font("SAN_SERIF",Font.PLAIN,18));
       area.setLineWrap(true);
       area.setWrapStyleWord(true);
       add(area);
       
       JScrollPane pane = new JScrollPane(area);
       pane.setBorder(BorderFactory.createEmptyBorder());
       add(pane);
       
       setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

   
    public static void main(String[] args) {
        new Notepad();
  
    }
    
}
