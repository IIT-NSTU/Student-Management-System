

package projectsms;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;


public class DipanitaLogin extends Login{
    
    DipanitaLogin(){
        
        submit.addActionListener(new ActionListener(){
        
  
        @Override
        public void actionPerformed(ActionEvent e){
 
            String name=usernameField.getText();
            String pass= passField.getText();
 
                if(name.equals("Dipanita") && pass.equals("1234")){
                        JOptionPane.showMessageDialog(null,"Welcome");
                    frame.dispose();
                    DipanitaModule director = new DipanitaModule();
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

