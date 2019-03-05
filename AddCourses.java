
package project;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class AddCourses extends JFrame{
    
    private Container c;
      private JLabel cName,cCode,cDescription;
      private JTextField tname,tcode;
      private JTextArea desArea;
      private JButton back,Add,home;
      private Font F;
      private JScrollPane desAreascroll;
    
    
    AddCourses(){
        initComponents();
        
    }
    public void initComponents(){
        
        
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(new java.awt.Color(0, 230, 230));
        
        F = new Font("Arial",Font.BOLD,30);
        
        cName = new JLabel("Course Name   :");
        cName.setBounds(270, 50, 250,60);
        cName.setFont(F);
        c.add(cName);
        
        tname = new JTextField();
        tname.setBounds(520, 50, 400,60);
        tname.setFont(F);
        c.add(tname);
        
        cCode = new JLabel("Course Code   :");
        cCode.setBounds(270, 130, 250,60);
        cCode.setFont(F);
        c.add(cCode);
        
       
        tcode = new JTextField();
        tcode.setBounds(520, 130, 400,60);
        tcode.setFont(F);
        c.add(tcode);
        
        
        cDescription = new JLabel("Course Description  :");
        cDescription.setBounds(270, 200, 320,60);
        cDescription.setFont(F);
        c.add(cDescription);
        
        desArea = new JTextArea();
        desArea.setBounds(290, 280, 625, 200);
        desArea.setFont(F);
        desArea.setLineWrap(true);
        desArea.setWrapStyleWord(true);
         
        
        desAreascroll = new JScrollPane(desArea);
        desAreascroll.setBounds(290, 280, 625, 200);
        c.add(desAreascroll);
         
         
        Add = new JButton("Add");
        Add.setBounds(780,500,130,50);
        Add.setFont(F);
        c.add(Add);
        
        
        back = new JButton("Back");
        back.setBounds(290, 560, 130, 50);
        back.setFont(F);
        c.add(back);
        
        home = new JButton("Home");
        home.setBounds(780, 560, 130, 50);
        home.setFont(F);
        c.add(home);
        
        
        
        
        
        
        
        JFrame frame = new JFrame();
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200,50,800,650);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setTitle("Add Course");
        frame.setVisible(true);
        frame.add(c);
    }
    
    public static void main(String[] args) {
        
        AddCourses addcourse = new AddCourses();
    }
    
}

