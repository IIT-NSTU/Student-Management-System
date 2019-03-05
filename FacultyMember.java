
package project;


import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/*
 that class shows Fuculty member oF IIT.

*/
public class FacultyMember extends JFrame{
    
    private Container c;
    private Font F;
    private JButton t1,t2,t3,t4,t5;
    private JLabel l1,l2,l3,l4,l5;
    
    
    FacultyMember(){
        
        initComponent();
    }
    public void initComponent(){
        
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Faculty Member");
        this.setLayout(null);
        this.setBounds(300,100, 650, 550);
        this.setBackground(Color.yellow);
        this.setResizable(false);
        c = this.getContentPane();
        c.setBackground(Color.pink);
        
        F = new Font("Arial",Font.BOLD,20);
        
        t1 = new JButton("1");
        t1.setBounds(100,30,50,40);
        t1.setFont(F);
        c.add(t1);
        
        
        t2 = new JButton("2");
        t2.setBounds(100,100,50,40);
        t2.setFont(F);
        c.add(t2);
        
        t3 = new JButton("3");
        t3.setBounds(100,170,50,40);
        t3.setFont(F);
        c.add(t3);
        
        t4 = new JButton("4");
        t4.setBounds(100,240,50,40);
        t4.setFont(F);
        c.add(t4);
        
        t5 = new JButton("5");
        t5.setBounds(100,310,50,40);
        t5.setFont(F);
        c.add(t5);
        
        
        
        
    }
    
    
    
    public static void main(String[] args) {
        
        
        FacultyMember Frame = new FacultyMember();
        
    }
    
}
