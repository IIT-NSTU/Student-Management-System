
package projectsms;





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
     Container c;
     JLabel contentlabel,label1,label2,label3,label4,label5,label6;
     JButton coursebtn,addbtn,updatebtn,backbtn,homebtn,coursemarkbtn,courseattend,coursepresent,back;
     Font hf,f;
     Cursor cursor;
     JFrame frame;
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
        
        coursemarkbtn=new JButton("Courses CT and attendence");
        coursemarkbtn.setBounds(200,260,360,50);
        coursemarkbtn.setFont(f);
        coursemarkbtn.setCursor(cursor);
        coursemarkbtn.setBackground(new java.awt.Color(0,230,230));
        c.add(coursemarkbtn);
        
        label4=new JLabel("4.");
        label4.setFont(f);
        label4.setBounds(180,320,20,50);
        c.add(label4);
        
        courseattend=new JButton("Courses Attendence");
        courseattend.setBounds(200,320,260,50);
        courseattend.setFont(f);
        courseattend.setCursor(cursor);
        courseattend.setBackground(new java.awt.Color(0,230,230));
        c.add(courseattend);
        
        label5=new JLabel("5.");
        label5.setFont(f);
        label5.setBounds(180,380,20,50);
        c.add(label5);
        
        coursepresent=new JButton("Course Percentage");
        coursepresent.setBounds(200,380,260,50);
        coursepresent.setFont(f);
        coursepresent.setCursor(cursor);
        coursepresent.setBackground(new java.awt.Color(0,230,230));
        c.add(coursepresent);
        
        
        
        
        homebtn=new JButton("Home");
        homebtn.setBounds(500,500,150,50);
        homebtn.setFont(f);
        homebtn.setBackground(Color.BLACK);
        homebtn.setForeground(Color.WHITE);
        homebtn.setCursor(cursor);
        c.add(homebtn);
        
        back=new JButton("Back");
        back.setBounds(200,500,150,50);
        back.setFont(f);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
       back.setCursor(cursor);
        c.add(back);
        
        Border emptyBorder = BorderFactory.createEmptyBorder();
        coursebtn.setBorder(emptyBorder);
        addbtn.setBorder(emptyBorder);
        coursemarkbtn.setBorder(emptyBorder);
        courseattend.setBorder(emptyBorder);
        coursepresent.setBorder(emptyBorder);
        
        
        frame=new JFrame();
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200,50,800,650);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setTitle("Teacher Module");
        frame.setVisible(true);
        frame.add(c);
        
        
        
           
            back.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
               if(ae.getSource()==back)
               {
                  frame.dispose();
                  TeacherNameDemo n = new TeacherNameDemo();
                  
               }
            }
            
        });
        
         
         
        
        
       
        
        
        
    }
    
    public static void main(String[] args) {
        TeacherModuleDemo t = new TeacherModuleDemo();
    }
   
    
}

