
package project;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class CourseTitleDemo extends JFrame{
     private Container c;
     private JLabel titlelabel,label1,label2,label3,label4,label5;
     private JButton btn1,btn2,btn3,btn4,btn5,backbtn,homebtn;
     private Font f,hf;
     private Cursor cursor;
     
    CourseTitleDemo()
    {
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(new java.awt.Color(0, 230, 230));
        
        hf=new Font("Arial",Font.BOLD,28);
        
        cursor =new Cursor(Cursor.HAND_CURSOR);
        
        
        titlelabel=new JLabel("Course Title");
        titlelabel.setFont(hf);
        titlelabel.setBounds(350,60,250,70);
        c.add(titlelabel);
        
        f=new Font("Arial",Font.BOLD,24);
        
        label1=new JLabel("1.");
        label1.setFont(f);
        label1.setBounds(180,140,20,50);
        c.add(label1);
        
        btn1=new JButton("Course Description");
        btn1.setBounds(200,140,270,50);
        btn1.setFont(f);
        btn1.setCursor(cursor);
        btn1.setBackground(new java.awt.Color(0,230,230));
        c.add(btn1);
        
        label2=new JLabel("2.");
        label2.setFont(f);
        label2.setBounds(180,200,20,50);
        c.add(label2);
        
        btn2=new JButton("Course Attendence");
        btn2.setBounds(200,200,270,50);
        btn2.setFont(f);
        btn2.setCursor(cursor);
        btn2.setBackground(new java.awt.Color(0,230,230));
        c.add(btn2);
        
        label3=new JLabel("3.");
        label3.setFont(f);
        label3.setBounds(180,260,20,50);
        c.add(label3);
        
        btn3=new JButton("Course CT and Final Mark");
        btn3.setBounds(200,260,340,50);
        btn3.setFont(f);
        btn3.setCursor(cursor);
        btn3.setBackground(new java.awt.Color(0,230,230));
        c.add(btn3);
        
        label4=new JLabel("4.");
        label4.setFont(f);
        label4.setBounds(180,320,20,50);
        c.add(label4);
        
        btn4=new JButton("Add a Student");
        btn4.setBounds(200,320,210,50);
        btn4.setFont(f);
        btn4.setCursor(cursor);
        btn4.setBackground(new java.awt.Color(0,230,230));
        c.add(btn4);
        
        label5=new JLabel("5.");
        label5.setFont(f);
        label5.setBounds(180,380,20,50);
        c.add(label5);
        
        btn5=new JButton("Remove a Student");
        btn5.setBounds(200,380,260,50);
        btn5.setFont(f);
        btn5.setCursor(cursor);
        btn5.setBackground(new java.awt.Color(0,230,230));
        c.add(btn5);
        
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
        btn1.setBorder(emptyBorder);
        btn2.setBorder(emptyBorder);
        btn3.setBorder(emptyBorder);
        btn4.setBorder(emptyBorder);
        btn5.setBorder(emptyBorder);
        
        JFrame frame=new JFrame();
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200,50,800,650);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setTitle("Courses Title");
        frame.setVisible(true);
        frame.add(c);
        
    }
    public static void main(String[] args) {
        
        CourseTitleDemo title =new CourseTitleDemo();
        
    }
    
}
