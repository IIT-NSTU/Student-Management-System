
package projectsms;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;


public class SumonLogin extends Login{
    
    SumonLogin(){
        
        submit.addActionListener(new ActionListener(){
        
  
        @Override
        public void actionPerformed(ActionEvent e){
 
            String name=usernameField.getText();
            String pass= passField.getText();
 
                if(name.equals("Md. Auhidur Rahman") && pass.equals("1234")){
                    JOptionPane.showMessageDialog(null,"Welcome");
                    frame.dispose();
                    SumonModule director = new SumonModule();
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

