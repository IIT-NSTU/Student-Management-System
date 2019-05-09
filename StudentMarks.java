
package projectsms;

  

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class StudentMarks extends JFrame{
    
    
     Container c;
     JLabel namelbl,rolllbl,ct1lbl,ct2lbl,assignlbl,attendencelbl;
     JTextField name,roll,ct1,ct2,assign,attendence;
      JButton back,home;
     final Font f;
     JFrame frame;
    
  
    StudentMarks(){
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(new java.awt.Color(0, 230, 230));
        
        f=new Font("Arial",Font.BOLD,24);
        
        
        namelbl=new JLabel("Name                 ");      
        namelbl.setFont(f);
        namelbl.setBounds(140,100,200,50);
        c.add(namelbl);
        
        name=new JTextField();      
        name.setFont(f);
        name.setBounds(500,100,300,40);
        c.add(name);
        
        
        rolllbl=new JLabel("Roll No              ");      
        rolllbl.setFont(f);
        rolllbl.setBounds(140,160,200,50);
        c.add(rolllbl);
       
        roll=new JTextField();      
        roll.setFont(f);
        roll.setBounds(500,160,300,40);
        c.add(roll);
        
        ct1lbl=new JLabel("Class Test 1  ");      
        ct1lbl.setFont(f);
        ct1lbl.setBounds(140,220,200,50);
        c.add(ct1lbl);
        
        ct1=new JTextField();      
        ct1.setFont(f);
        ct1.setBounds(500,220,300,40);
        c.add(ct1);
        
        ct2lbl=new JLabel("Class Test 2    ");      
        ct2lbl.setFont(f); 
        ct2lbl.setBounds(140,280,200,50);
        c.add(ct2lbl);
        
        ct2=new JTextField();      
        ct2.setFont(f);
        ct2.setBounds(500,280,300,40);
        c.add(ct2);
        
        assignlbl=new JLabel("Assignment Mark");      
        assignlbl.setFont(f); 
        assignlbl.setBounds(140,340,350,50);
        c.add(assignlbl);
        
        assign=new JTextField();      
        assign.setFont(f);
        assign.setBounds(500,340,300,40);
        c.add(assign);
        
        attendencelbl=new JLabel("Attendence  Mark");      
        attendencelbl.setFont(f);
        attendencelbl.setBounds(140,400,350,50);
        c.add(attendencelbl);
        
        attendence=new JTextField();      
        attendence.setFont(f);
        attendence.setBounds(500,400,300,40);
        c.add(attendence);
        
      
        
        
        
        back=new JButton("Back");
        back.setBounds(180,570,150,50);
        back.setFont(f);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        c.add(back);
        
        home=new JButton("Home");
        home.setBounds(650,570,150,50);
        home.setFont(f);
        home.setBackground(Color.BLACK);
        home.setForeground(Color.WHITE);
        c.add(home);
        
        
         frame=new JFrame();
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200,50,800,650);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setTitle("Student Marks");
        frame.setVisible(true);
        frame.add(c);
    }
    
   // public static void main(String[] args) {
      //  StudentMarks sm = new StudentMarks();
   // }
    
}
