
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class sign extends JFrame implements ActionListener{
    
    private Container c;
    private Font f;
    private JLabel l1;
    private JButton b1,b2,b3,b4,b5,b6,b7,b8;
    
    sign()
    {
        components();
    }
    
    public void components()
    {
          c= this.getContentPane();
        c.setLayout(null);
        c.setBackground(new Color(25,45,45));
        
        f = new Font("Candara",Font.BOLD,18);
        
        l1 = new JLabel("Course Plan");
        l1.setBounds(250,20,200,50);
        l1.setForeground(Color.WHITE);
        l1.setFont(f);
        c.add(l1);
        
        
        b1 = new JButton("1st Semester");
        b1.setBounds(220,70, 150, 50);
        b1.setBackground(new Color(25,45,45));
        b1.setForeground(Color.WHITE);
        b1.setBorderPainted(false);
        b1.setFont(f);
        c.add(b1);
        b1.addActionListener(this);
        
        
        b2 = new JButton("2nd Semester");
        b2.setBounds(220,120, 150, 50);
        b2.setBackground(new Color(25,45,45));
        b2.setForeground(Color.WHITE);
        b2.setBorderPainted(false);
        b2.setFont(f);
        c.add(b2);
        b2.addActionListener(this);
        
        b3 = new JButton("3rd Semester");
        b3.setBounds(220,170, 150, 50);
        b3.setBackground(new Color(25,45,45));
        b3.setForeground(Color.WHITE);
        b3.setBorderPainted(false);
        b3.setFont(f);
        c.add(b3);
        b3.addActionListener(this);
        
        b4 = new JButton("4th Semester");
        b4.setBounds(220,220, 150, 50);
        b4.setBackground(new Color(25,45,45));
        b4.setForeground(Color.WHITE);
        b4.setBorderPainted(false);
        b4.setFont(f);
        c.add(b4);
        b4.addActionListener(this);
        
        b5 = new JButton("5th Semester");
        b5.setBounds(220,270, 150, 50);
        b5.setBackground(new Color(25,45,45));
        b5.setForeground(Color.WHITE);
        b5.setBorderPainted(false);
        b5.setFont(f);
        c.add(b5);
        b5.addActionListener(this);
        
        b6 = new JButton("6th Semester");
        b6.setBounds(220,320, 150, 50);
        b6.setBackground(new Color(25,45,45));
        b6.setForeground(Color.WHITE);
        b6.setBorderPainted(false);
        b6.setFont(f);
        c.add(b6);
        b6.addActionListener(this);
        
        
        b7 = new JButton("7th Semester");
        b7.setBounds(220,370, 150, 50);
        b7.setBackground(new Color(25,45,45));
        b7.setForeground(Color.WHITE);
        b7.setBorderPainted(false);
        b7.setFont(f);
        c.add(b7);
        b7.addActionListener(this);
        
        b8 = new JButton("8th Semester");
        b8.setBounds(220,420, 150, 50);
        b8.setBackground(new Color(25,45,45));
        b8.setForeground(Color.WHITE);
        b8.setBorderPainted(false);
        b8.setFont(f);
        c.add(b8);
        b8.addActionListener(this);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1)
        {
            semester1 s1=new semester1();
            s1.setVisible(true);
            this.dispose();
        }      
             if(e.getSource()==b2)
        {
            semester2 s2=new semester2();
            s2.setVisible(true);
            this.dispose();
            
        }
              if(e.getSource()==b3)
        {
            semester3 s3=new semester3();
            s3.setVisible(true);
            this.dispose();
        }   
           if(e.getSource()==b4)
        {
            semester4 s4=new semester4();
            s4.setVisible(true);
            this.dispose();
        }       
           
            if(e.getSource()==b5)
        {
            semester5 s5=new semester5();
            s5.setVisible(true);
            this.dispose();
        }   
            
             if(e.getSource()==b6)
        {
            semester6 s6=new semester6();
            s6.setVisible(true);
            this.dispose();
        }   
             
              if(e.getSource()==b7)
        {
            semester7 s7=new semester7();
            s7.setVisible(true);
            this.dispose();
        }   
              
               if(e.getSource()==b8)
        {
            semester8 s8=new semester8();
            s8.setVisible(true);
            this.dispose();
        }   
               
                if(e.getSource()==b3)
        {
            semester3 s3=new semester3();
            s3.setVisible(true);
            this.dispose();
        }   
    
 }
    public static void main(String[] args) {
       sign frame = new sign();
       frame.setVisible(true);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
       frame.setExtendedState(MAXIMIZED_BOTH);
        
    }

 
}
