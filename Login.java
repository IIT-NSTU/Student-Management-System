
package project;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class Login extends JFrame{
    
    
            Container c;
            Font F ;
            JLabel username,password;
            JTextField usernameField;
            JPasswordField passField;
            JButton submit,back,reset;
           
           String user="Admin";
           String pass="1234";
            String newpassw;
           
    Login(){
        
        
        
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(new java.awt.Color(0, 230, 230));
        
        F = new Font("Arial",Font.BOLD,30);
        
        username = new JLabel("Username   :");
        username.setBounds(270, 200, 250,60);
        username.setFont(F);
        c.add(username);
        
        usernameField = new JTextField();
        usernameField.setBounds(520, 200, 400,60);
        usernameField.setFont(F);
        c.add(usernameField);
        
        password = new JLabel("Password   :");
        password.setBounds(270, 330, 250,60);
        password.setFont(F);
        c.add(password);
        
       
        passField = new JPasswordField();
        passField.setBounds(520, 330, 400,60);
        passField.setFont(F);
        c.add(passField);
        
        submit = new JButton("Submit");
        submit.setBounds(750, 440, 165, 50);
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.setFont(F);
        c.add(submit);
        
        back=new JButton("Back");
        back.setBounds(750, 520, 165, 50);
        back.setFont(F);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        c.add(back);
        
        reset=new JButton("Reset");
        reset.setBounds(450, 440, 165, 50);
        reset.setFont(F);
        reset.setBackground(Color.BLACK);
        reset.setForeground(Color.WHITE);
        c.add(reset);
        
        
        
        
       
        
        
        
        File file  = new File("password.txt");
        try{
        FileWriter fw = new FileWriter(file);
        fw.write(pass);
        fw.write(System.getProperty("line.separator"));
        fw.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
         
      
 
         reset.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            
            if(e.getSource()==reset)
            {
                String m = JOptionPane.showInputDialog(null, "Current Password", 
                "Change Password", JOptionPane.INFORMATION_MESSAGE);
                
                if(m.equals(newpassw))
                {
                     
                     File file  = new File("password.txt");
                     file.delete(); 
                   Changepass c = new Changepass(); 
                  // c.setVisible(true);
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Invalid Password");
                }
        
            }
            }
        
        });
        
        
         back.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            
            if(e.getSource()==back)
            {
                dispose();
                Teachers t=new Teachers();  
            }
            }
        
        });
        
        
        
        submit.addActionListener(new ActionListener(){
        
  
        @Override
        public void actionPerformed(ActionEvent e){
            
             
       
           
      
 
            String name=usernameField.getText();
            String password= passField.getText();
             File file  = new File("password.txt");
            try{
           FileReader  fr = new FileReader(file);
           BufferedReader br = new BufferedReader(fr); 
          String newpassw =br.readLine();
           
          System.out.println(newpassw);
           
      }
      catch(IOException ea)
      {
          ea.printStackTrace();
      }
        
             
                if(name.equals(user) && password.equals(newpassw)){
                    JOptionPane.showMessageDialog(null,"Welcome");
                    dispose();
                    TeacherModuleDemo te=new TeacherModuleDemo();
                }
                else{
                    JOptionPane.showMessageDialog(null,"Wrong Password");
                    usernameField.setText("");
                    passField.setText("");
                }
        }
        
        });
        
        JFrame frame = new JFrame();
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200,50,800,650);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setVisible(true);
        frame.setTitle("Faculty");
        frame.add(c);
        
    }
    public static void main(String[] args) {
        Login l=new Login();
    }
   
}

