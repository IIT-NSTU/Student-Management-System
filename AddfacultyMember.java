
package projectsms;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class AddfacultyMember extends AddMember{
    
    AddfacultyMember()
    {
        home.addActionListener(new ActionListener(){
        
  
        @Override
        public void actionPerformed(ActionEvent e){
            
  
                frame.dispose();
                Home home =new Home();
        }
        
        });
        back.addActionListener(new ActionListener(){
        
  
        @Override
        public void actionPerformed(ActionEvent e){
            
  
               if(e.getSource()==back){
                 
                    frame.dispose();
                    AdminstratorDemo admin = new AdminstratorDemo();
                    
                }
        }
   
        
        });
    
        
        
    }
    
}
