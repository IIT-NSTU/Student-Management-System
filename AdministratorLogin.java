
package projectsms;

import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class AdministratorLogin extends JFrame{
    
    
           private Container c;
           private Font F ;
           private JLabel username,password;
           private JTextField usernameField;
           private JPasswordField passField;
           private JButton submit;
    
    AdministratorLogin(){
        
        
        
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
        submit.setBounds(750, 415, 165, 50);
        submit.setFont(F);
        c.add(submit);
        
        
        
        JFrame frame = new JFrame();
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200,50,800,650);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setTitle("Administrator");
        frame.setVisible(true);
        frame.add(c);
        
        
        submit.addActionListener(new ActionListener(){
        
  
        @Override
        public void actionPerformed(ActionEvent e){
 
            String name=usernameField.getText();
            String pass= passField.getText();
 
                if(name.equals("Admin") && pass.equals("1234")){
                    JOptionPane.showMessageDialog(null,"Welcome");
                    frame.dispose();
                    AdminstratorDemo admin = new AdminstratorDemo();
                }
                else{
                    JOptionPane.showMessageDialog(null,"Wrong Password");
                    usernameField.setText("");
                    passField.setText("");
                }
        }
        
        });
    }
    
}
