
package projectsms;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class AddStudentMember extends AddMember{
    
    AddStudentMember(){
        
        add.addActionListener(new ActionListener(){
        
  
        @Override
        public void actionPerformed(ActionEvent e){
            String sname =name.getText();
            String sfather =Father.getText();
            String  smother = mother.getText();
            String  shometown = hometown.getText();
            String  semail = email.getText();
            String scontact = contact.getText();
            String sblood = blood.getText();
            
            if(e.getSource()==add)
            {
                filewriter(sname,sfather,smother,shometown,semail,scontact,sblood);
            }
  
        }

            private void filewriter(String sname, String sfather, String smother, String shometown, String semail, String scontact, String sblood) {
                
                try{
                    FileWriter wr = new FileWriter("student.txt",true);
                    wr.write(sname+" "+" ");
                    wr.write(sfather+" "+" ");
                    wr.write(smother+" "+" ");
                    wr.write(shometown+" "+" ");
                    wr.write(semail+" "+" ");
                    wr.write(scontact+" "+" ");
                    wr.write(sblood+" "+" ");
                    
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
                Home admin =new Home();
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
