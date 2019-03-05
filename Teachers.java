
package project;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class Teachers extends JFrame{
    
    Container c;
    private JButton back;
    private Font F;
    private JButton btn1,btn2,btn3,btn4,btn5;
    private JLabel l1,l2,l3,l4,l5;
    
    
    Teachers(){
        
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(new java.awt.Color(0, 230, 230));
        
         F = new Font("Arial",Font.BOLD,20);
        
        l1 = new JLabel("1 .");
        l1.setBounds(100,30,50,40);
        l1.setFont(F);
        c.add(l1);
        
        btn1 = new JButton("Mohammad Nuruzzaman Bhuiyan");
        btn1.setBounds(160,30,350,40);
        btn1.setBackground(new java.awt.Color(0,230,230));
        btn1.setFont(F);
        c.add(btn1);
        
        l2 = new JLabel("2 .");
        l2.setBounds(100,100,50,40);
        l2.setFont(F);
        c.add(l2);
        
        btn2=new JButton("Md. Auhidur Rahman");
         btn2.setBounds(160,100,250,40);
        btn2.setBackground(new java.awt.Color(0,230,230));
        btn2.setFont(F);
        c.add(btn2);
        
        l3 = new JLabel("3 .");
        l3.setBounds(100,170,50,40);
        l3.setFont(F);
        c.add(l3);
        
        btn3=new JButton("Dipanita Saha");
         btn3.setBounds(160,170,250,40);
        btn3.setBackground(new java.awt.Color(0,230,230));
        btn3.setFont(F);
        c.add(btn3);
        
        l4 = new JLabel("4 .");
        l4.setBounds(100,240,50,40);
        l4.setFont(F);
        c.add(l4);
        
        btn4=new JButton("Falguni Roy");
         btn4.setBounds(160,240,250,40);
        btn4.setBackground(new java.awt.Color(0,230,230));
        btn4.setFont(F);
        c.add(btn4);
        
        l5 = new JLabel("5 .");
        l5.setBounds(100,310,50,40);
        l5.setFont(F);
        c.add(l5);
        
        back=new JButton("Back");
        back.setBounds(180,570,150,50);
        back.setFont(F);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        c.add(back);
        
        JFrame frame=new JFrame();
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200,50,800,650);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setTitle("Teacher");
        frame.setVisible(true);
        frame.add(c);
        
        
        back.addActionListener(new ActionListener(){
        
  
        @Override
        public void actionPerformed(ActionEvent e){
            
            if(e.getSource()==back)
            {
                 frame.dispose();
                HomeDemo home=new HomeDemo();  
            }
                        
        }
        
        });
        
        btn1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
               if(ae.getSource()==btn1)
               {
                  frame.dispose();
                  Login login=new Login();
               }
            }
            
        });
        btn2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
               if(ae.getSource()==btn2)
               {
                  frame.dispose();
                  Login login=new Login();
               }
            }
            
        });
        btn3.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
               if(ae.getSource()==btn3)
               {
                  frame.dispose();
                  Login login=new Login();
               }
            }
            
        });
        btn4.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
               if(ae.getSource()==btn4)
               {
                  frame.dispose();
                  Login login=new Login();
               }
            }
            
        });
        
    }
    
    
    
    
}

