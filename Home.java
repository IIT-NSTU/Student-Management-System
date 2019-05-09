
package projectsms;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JButton;
 

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;



public class Home extends JFrame{
    private Container c;
    private JLabel homelabel,label1,label2,label3,label4,label5,label6;
    private JButton studentbtn,teacherbtn,coursebtn,routinebtn,adminbtn,facultybtn,atndbtn,graphbtn;
    private Font f,hf;
    private Cursor cursor;
    
     Home()
    {
    
        
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(new java.awt.Color(0, 230, 230));
        
        hf=new Font("Arial",Font.BOLD,28);
        
        cursor =new Cursor(Cursor.HAND_CURSOR);
        
        
        homelabel=new JLabel("Home");
        homelabel.setFont(hf);
        homelabel.setBounds(380,60,100,70);
        c.add(homelabel);
        
        f=new Font("Arial",Font.BOLD,24);
        
        label1=new JLabel("1.");
        label1.setFont(f);
        label1.setBounds(180,140,20,50);
        c.add(label1);
        
        studentbtn=new JButton("Student Information");
        studentbtn.setBounds(200,140,260,50);
        studentbtn.setFont(f);
        studentbtn.setCursor(cursor);
        studentbtn.setBackground(new java.awt.Color(0,230,230));
        c.add(studentbtn);
        
        label2=new JLabel("2.");
        label2.setFont(f);
        label2.setBounds(180,200,20,50);
        c.add(label2);
        
        teacherbtn=new JButton("Teacher Information");
        teacherbtn.setBounds(200,200,260,50);
        teacherbtn.setFont(f);
        teacherbtn.setCursor(cursor);
        teacherbtn.setBackground(new java.awt.Color(0,230,230));
        c.add(teacherbtn);
        
        label3=new JLabel("3.");
        label3.setFont(f);
        label3.setBounds(180,260,20,50);
        c.add(label3);
        
        coursebtn=new JButton("Course Plan");
        coursebtn.setBounds(200,260,170,50);
        coursebtn.setFont(f);
        coursebtn.setCursor(cursor);
        coursebtn.setBackground(new java.awt.Color(0,230,230));
        c.add(coursebtn);
        
        label4=new JLabel("4.");
        label4.setFont(f);
        label4.setBounds(180,320,20,50);
        c.add(label4);
        
        routinebtn=new JButton("Routine");
        routinebtn.setBounds(200,320,130,50);
        routinebtn.setFont(f);
        routinebtn.setCursor(cursor);
        routinebtn.setBackground(new java.awt.Color(0,230,230));
        c.add(routinebtn);
        
        label5=new JLabel("5.");
        label5.setFont(f);
        label5.setBounds(180,380,20,50);
        c.add(label5);
        
        atndbtn=new JButton("Attendence Percentage");
        atndbtn.setBounds(200,380,310,50);
        atndbtn.setFont(f);
        atndbtn.setCursor(cursor);
        atndbtn.setBackground(new java.awt.Color(0,230,230));
        c.add(atndbtn);
        
        label6=new JLabel("6.");
        label6.setFont(f);
        label6.setBounds(180,440,20,50);
        c.add(label6);
        
        graphbtn=new JButton("Result Graph");
        graphbtn.setBounds(200,440,210,50);
        graphbtn.setFont(f);
        graphbtn.setCursor(cursor);
        graphbtn.setBackground(new java.awt.Color(0,230,230));
        c.add(graphbtn);
        
        adminbtn=new JButton("Administrator");
        adminbtn.setBounds(100,500,200,50);
        adminbtn.setFont(f);
        adminbtn.setBackground(Color.BLACK);
        adminbtn.setForeground(Color.WHITE);
        adminbtn.setCursor(cursor);
        c.add(adminbtn);
        
        facultybtn=new JButton("Faculty");
        facultybtn.setBounds(500,500,150,50);
        facultybtn.setFont(f);
        facultybtn.setBackground(Color.BLACK);
        facultybtn.setForeground(Color.WHITE);
        facultybtn.setCursor(cursor);
        c.add(facultybtn);
        
        
        
        
        Border emptyBorder = BorderFactory.createEmptyBorder();
        studentbtn.setBorder(emptyBorder);
        teacherbtn.setBorder(emptyBorder);
        coursebtn.setBorder(emptyBorder);
        routinebtn.setBorder(emptyBorder);
        adminbtn.setBorder(emptyBorder);
        atndbtn.setBorder(emptyBorder);
        graphbtn.setBorder(emptyBorder);
        
        
        
        JFrame frame=new JFrame();
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200,50,800,650);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setTitle("Home ");
        frame.setVisible(true);
        frame.add(c);
        
        
        
        graphbtn.addActionListener(new ActionListener(){
        
  
        @Override
        public void actionPerformed(ActionEvent e){
            
  
                frame.dispose();
               // TeacherNameDemo teacher = new TeacherNameDemo();    
               graph1 g =new graph1();
               
        }
        
        });
        facultybtn.addActionListener(new ActionListener(){
        
  
        @Override
        public void actionPerformed(ActionEvent e){
            
  
                frame.dispose();
               TeacherNameDemo teacher = new TeacherNameDemo();    
               //graph1 g =new graph1();
               
        }
        
        });
        
        studentbtn.addActionListener(new ActionListener(){
        
  
        @Override
        public void actionPerformed(ActionEvent e){
            
  
                frame.dispose();
            try {
                StudentInformation stdInfo = new StudentInformation();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        });
        
        teacherbtn.addActionListener(new ActionListener(){
        
  
        @Override
        public void actionPerformed(ActionEvent e){
            
  
                frame.dispose();
            try {
                TeacherInformtion teaher = new TeacherInformtion();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        });
        adminbtn.addActionListener(new ActionListener(){
        
  
        @Override
        public void actionPerformed(ActionEvent e){
            
  
                frame.dispose();
                AdministratorLogin admin =new AdministratorLogin();
        }
        
        });
       atndbtn.addActionListener(new ActionListener(){
        
  
        @Override
        public void actionPerformed(ActionEvent e){
            
  
                frame.dispose();
                ShowA showA = new ShowA();
        }
        
        });
       
       routinebtn.addActionListener(new ActionListener(){
        
  
        @Override
        public void actionPerformed(ActionEvent e){
            
  
                frame.dispose();
            try {
                RoutineDemo routineDemo = new RoutineDemo();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        });
       
       coursebtn.addActionListener(new ActionListener(){
        
  
        @Override
        public void actionPerformed(ActionEvent e){
            
  
                frame.dispose();
                sign a = new sign();
        }
        
        });
    }
 
}