
package project;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;


public class TeacherModuleDemo extends JFrame{
    private Container c;
    private JLabel contentlabel,label1,label2,label3;
    private JButton coursebtn,addbtn,updatebtn,backbtn,homebtn;
    private Font hf,f;
    private Cursor cursor;
    TeacherModuleDemo()
    {
         c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(new java.awt.Color(0, 230, 230));
        
        hf=new Font("Arial",Font.BOLD,28);
        
        cursor =new Cursor(Cursor.HAND_CURSOR);
        
        
        contentlabel=new JLabel("Teacher Module");
        contentlabel.setFont(hf);
        contentlabel.setBounds(350,60,250,70);
        c.add(contentlabel);
        
        f=new Font("Arial",Font.BOLD,24);
        
        label1=new JLabel("1.");
        label1.setFont(f);
        label1.setBounds(180,140,20,50);
        c.add(label1);
        
        coursebtn=new JButton("Courses");
        coursebtn.setBounds(200,140,130,50);
        coursebtn.setFont(f);
        coursebtn.setCursor(cursor);
        coursebtn.setBackground(new java.awt.Color(0,230,230));
        c.add(coursebtn);
        
        label2=new JLabel("2.");
        label2.setFont(f);
        label2.setBounds(180,200,20,50);
        c.add(label2);
        
        addbtn=new JButton("Add Courses");
        addbtn.setBounds(200,200,170,50);
        addbtn.setFont(f);
        addbtn.setCursor(cursor);
        addbtn.setBackground(new java.awt.Color(0,230,230));
        c.add(addbtn);
        
        label3=new JLabel("3.");
        label3.setFont(f);
        label3.setBounds(180,260,20,50);
        c.add(label3);
        
        updatebtn=new JButton("Update Personal Details");
        updatebtn.setBounds(200,260,300,50);
        updatebtn.setFont(f);
        updatebtn.setCursor(cursor);
        updatebtn.setBackground(new java.awt.Color(0,230,230));
        c.add(updatebtn);
        
        backbtn=new JButton("Back");
        backbtn.setBounds(100,500,150,50);
        backbtn.setFont(f);
        backbtn.setBackground(Color.BLACK);
        backbtn.setForeground(Color.WHITE);
        backbtn.setCursor(cursor);
        c.add(backbtn);
        
        homebtn=new JButton("Home");
        homebtn.setBounds(500,500,150,50);
        homebtn.setFont(f);
        homebtn.setBackground(Color.BLACK);
        homebtn.setForeground(Color.WHITE);
        homebtn.setCursor(cursor);
        c.add(homebtn);
        
        Border emptyBorder = BorderFactory.createEmptyBorder();
        coursebtn.setBorder(emptyBorder);
        addbtn.setBorder(emptyBorder);
        updatebtn.setBorder(emptyBorder);
        
        JFrame frame=new JFrame();
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200,50,800,650);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setTitle("Teacher Module");
        frame.setVisible(true);
        frame.add(c);
        
         backbtn.addActionListener(new ActionListener(){
        
  
        @Override
        public void actionPerformed(ActionEvent e){
            
            if(e.getSource()==backbtn)
            {
                 frame.dispose();
                Login login=new Login();  
            }
                        
        }
        
        });
         
          homebtn.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            
            if(e.getSource()==homebtn)
            {
                 frame.dispose();
                HomeDemo home=new HomeDemo();  
            }
                        
        }
        
        });
        coursebtn.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            
            if(e.getSource()==coursebtn)
            {
                 frame.dispose();
                CoursesDemo course=new CoursesDemo();  
            }
                        
        }
        
        });
        addbtn.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            
            if(e.getSource()==addbtn)
            {
                 frame.dispose();
                AddCourses course=new AddCourses();  
            }
                        
        }
        
        });
        
        
    }
   /* public static void main(String[] args) {
     TeacherModuleDemo teacher=new TeacherModuleDemo();   
        
        
    }*/
    
}
