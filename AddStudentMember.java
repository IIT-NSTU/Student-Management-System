
package projectsms;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import javax.swing.JButton;
import javax.swing.JOptionPane;


public class AddStudentMember extends AddMember{
    
            JButton add;
    
            
            
    AddStudentMember(){
        
        add=new JButton("Add");
        add.setBounds(520,510,150,50);
        add.setFont(f);
        add.setBackground(Color.BLACK);
        add.setForeground(Color.WHITE);
        c.add(add);
        
        add.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            
            if(e.getSource()==add)
            {
                
            String sname =name.getText();
            String sroll =roll.getText();
            String  ssession = session.getText();
            String  shometown = hometown.getText();
            String  semail = eemail.getText();
            String scontact = contact.getText();
            String sblood = blood.getText();
            
            if(sname.equals(""))
                    {
                        JOptionPane.showMessageDialog(null,"Please Enter name");
                    }
            else if(sroll.equals("")){
                            JOptionPane.showMessageDialog(null, "Please Enter hometown");
                        }
            else if(ssession.equals("")){
                            JOptionPane.showMessageDialog(null, "Please Enter Session");
                        }
                    else if(shometown.equals("")){
                            JOptionPane.showMessageDialog(null, "Please Enter hometown");
                        }
                   else if(semail.equals("")){
                                JOptionPane.showMessageDialog(null, "Please Enter Email");
                            }
                    else if(scontact.equals("")){
                                    JOptionPane.showMessageDialog(null,"Please Enter contact");
                                }
                    else if(sblood.equals("")){
                                        JOptionPane.showMessageDialog(null,"Please Enter Blood");
                                    }
                
                else{
                    
                   filewriter(sname,sroll,ssession,shometown,semail,scontact,sblood);
                   JOptionPane.showMessageDialog(null,"Added Succesfully");
                   name.setText("");
                   roll.setText("");
                   session.setText("");
                   hometown.setText("");
                   eemail.setText("");
                   contact.setText("");
                   blood.setText("");
                    
                }
                
               
                
            }
        }
            private void filewriter(String sname, String sroll, String ssession, String shometown, String semail, String scontact, String sblood) {
                try{
                    FileWriter wr = new FileWriter("student.txt",true);
                    wr.write(sname+" "+"#");
                    wr.write(sroll+" "+"#");
                    wr.write(ssession+" "+"#");
                    wr.write(shometown+" "+"#");
                    wr.write(semail+" "+"#");
                    wr.write(scontact+" "+"#");
                    wr.write(sblood+" "+"#");    
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
