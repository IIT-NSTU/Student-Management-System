
package projectsms;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class AddCourses extends JFrame{
    
     Container c;
     JLabel cName,cCode,cDescription;
     JTextField tname,tcode,desArea;
     // JTextArea desArea;
      JButton back,Add,home;
      Font F;
      JScrollPane desAreascroll;
      JFrame frame;
    
    
    AddCourses(){
        initComponents();
        
    }
    public void initComponents(){
        
        
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(new Color(0, 230, 230));
        
        F = new Font("Arial",Font.BOLD,30);
        
        cName = new JLabel("Course Name          :");
        cName.setBounds(220, 50, 300,60);
        cName.setFont(F);
        c.add(cName);
        
        tname = new JTextField();
        tname.setBounds(520, 50, 400,60);
        tname.setFont(F);
        c.add(tname);
        
        cCode = new JLabel("Course Code           :");
        cCode.setBounds(220, 130, 300,60);
        cCode.setFont(F);
        c.add(cCode);
        
       
        tcode = new JTextField();
        tcode.setBounds(520, 130, 400,60);
        tcode.setFont(F);
        c.add(tcode);
        
        
        cDescription = new JLabel("Course Description:");
        cDescription.setBounds(220, 200, 320,60);
        cDescription.setFont(F);
        c.add(cDescription);
        
        desArea = new JTextField();
        desArea.setBounds(520, 200, 400, 60);
        desArea.setFont(F);
        c.add(desArea);
         
        
       
         
         
        Add = new JButton("Add");
        Add.setBounds(780,500,130,50);
        Add.setBackground(Color.BLACK);
        Add.setForeground(Color.WHITE);
        Add.setFont(F);
        c.add(Add);
        
        
        
        
        home = new JButton("Home");
        home.setBounds(780, 560, 130, 50);
        home.setBackground(Color.BLACK);
        home.setForeground(Color.WHITE);
        home.setFont(F);
        c.add(home);
        
        
         frame = new JFrame();
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200,50,800,650);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setTitle("Add Course");
        frame.setVisible(true);
        frame.add(c);
        
        
        
    }
    
    
    
}
