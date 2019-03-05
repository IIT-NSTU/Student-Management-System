
package projectsms;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class AddfacultyMember extends AddMember{
    
    AddfacultyMember()
    {
        add.addActionListener(new ActionListener(){
        
  
        @Override
        public void actionPerformed(ActionEvent e){
            String tname =name.getText();
            String tfather =Father.getText();
            String  tmother = mother.getText();
            String  thometown = hometown.getText();
            String  temail = email.getText();
            String tcontact = contact.getText();
            String tblood = blood.getText();
            
            if(e.getSource()==add)
            {
                filewriter(tname,tfather,tmother,thometown,temail,tcontact,tblood);
            }
  
        }

            private void filewriter(String tname, String tfather, String tmother, String thometown, String temail, String tcontact, String tblood) {
                
                try{
                    FileWriter wr = new FileWriter("teachersInformation.txt",true);
                    wr.write(tname+" "+" ");
                    wr.write(tfather+" "+" ");
                    wr.write(tmother+" "+" ");
                    wr.write(thometown+" "+" ");
                    wr.write(temail+" "+" ");
                    wr.write(tcontact+" "+" ");
                    wr.write(tblood+" "+" ");
                    
                    wr.write(System.getProperty("line.separator"));
                    wr.close();
                }
                catch(Exception ae)
                {
                    System.out.println(ae);
                }
            }
        
        });
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
