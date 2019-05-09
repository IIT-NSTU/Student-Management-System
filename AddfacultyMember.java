package projectsms;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class AddfacultyMember extends AddMemberFaculty{
    
    AddfacultyMember()
    {
        add=new JButton("Add");
        add.setBounds(520,510,150,50);
        add.setFont(f);
        add.setBackground(Color.BLACK);
        add.setForeground(Color.WHITE);
        c.add(add);
        
        
        add.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            String tname =name.getText();
            String thometown = hometown.getText();
            String temail = email.getText();
            String tcontact = contact.getText();
            String tblood = blood.getText();
            
                           
                    if(tname.equals(""))
                    {
                        JOptionPane.showMessageDialog(null,"Please Enter name");
                    }
                    else if(thometown.equals("")){
                            JOptionPane.showMessageDialog(null, "Please Enter hometown");
                        }
                   else if(temail.equals("")){
                                JOptionPane.showMessageDialog(null, "Please Enter Email");
                            }
                    else if(tcontact.equals("")){
                                    JOptionPane.showMessageDialog(null,"Please Enter contact");
                                }
                    else if(tblood.equals("")){
                                        JOptionPane.showMessageDialog(null,"Please Enter Blood");
                                    }
                
                else{
                    
                    filewriter(tname,thometown,temail,tcontact,tblood);
                   JOptionPane.showMessageDialog(null,"Added Succesfully");
                   name.setText("");
                   hometown.setText("");
                   email.setText("");
                   contact.setText("");
                   blood.setText("");
                    
                }
                
            
  
        }
            private void filewriter(String tname, String thometown,String temail, String tcontact, String tblood) {
                
                try{
                    FileWriter wr = new FileWriter("teachersInformation.txt",true);
                    wr.write(tname+" "+"#");
                    wr.write(thometown+" "+"#");
                    wr.write(temail+" "+"#");
                    wr.write(tcontact+" "+"#");
                    wr.write(tblood+" "+"#");
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
