
package project;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class Changepass extends JFrame{
             Container c;
            JLabel password;
            JTextField passtf;
            JButton add;
            Font F;
    
    Changepass()
    {
         c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(new java.awt.Color(0, 230, 230));
        
         F = new Font("Arial",Font.BOLD,30);
        
        password = new JLabel("Password   :");
        password.setBounds(270, 200, 250,60);
        password.setFont(F);
        c.add(password);
        
       passtf = new JTextField();
       passtf.setBounds(520, 200, 400,60);
       passtf.setFont(F);
        c.add(passtf);
        
        add=new JButton("Add");
        add.setBounds(520, 300, 100,60);
        add.setFont(F);
        add.setBackground(Color.BLACK);
        add.setForeground(Color.WHITE);
        c.add(add);
        
        add.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                       if(e.getSource()==add){
         String changetf=passtf.getText();
       
        
                    
                     
                    try {
                     File file  = new File("password.txt");
                     FileWriter    fw = new FileWriter(file);
                        fw.write(changetf);
                        fw.write(System.getProperty("line.separator"));
                        fw.close();
                    } catch (IOException ex) {
                        Logger.getLogger(Changepass.class.getName()).log(Level.SEVERE, null, ex);
                    }
                     
              
                }
            }
        });
                
                
       
        
        JFrame frame = new JFrame();
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200,50,800,650);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setVisible(true);
        frame.setTitle("Change password");
        frame.add(c);
        
    }
    
            
    
    
    public static void main(String[] args) {
      Changepass c= new Changepass();
      
    }
    
}
