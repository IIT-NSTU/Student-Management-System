
package projectsms;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JOptionPane;


public class Updatefaculty extends AddMemberFaculty{
    
     JButton update;
      int row;
    
    Updatefaculty(){
        
        update=new JButton("Update");
        update.setBounds(520,510,150,50);
        update.setFont(f);
        update.setBackground(Color.BLACK);
        update.setForeground(Color.WHITE);
        c.add(update);
        
        update.addActionListener(new ActionListener(){
        
  
        @Override
        public void actionPerformed(ActionEvent e){
            
         if(e.getSource()==update)
            {
                
            String tname =name.getText();
            
            String  thometown = hometown.getText();
            String  temail = email.getText();
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
                        JOptionPane.showMessageDialog(null,"Updated Succesfully");
                    
                try {
                    
                    frame.dispose();
                    TeacherInformtion stu  = new TeacherInformtion();
                    stu.model.setValueAt(tname, row, 0);
                    
                    stu.model.setValueAt(thometown, row, 1);
                    stu.model.setValueAt(temail, row, 2);
                    stu.model.setValueAt(tcontact, row, 3);
                    stu.model.setValueAt(tblood, row, 4);
               
                           File file  = new File("teachersInformation.txt");
                           try{
                                FileWriter  fr = new FileWriter(file);
                                BufferedWriter bw = new BufferedWriter(fr); 
           
         
        
               
                                for(int i=0;i<stu.table.getRowCount();i++) 
                                {
                                   for(int j=0;j<stu.table.getColumnCount();j++)
                                   {
                                     bw.write(stu.table.getValueAt(i, j).toString()+" "+"#");
                    
                                   }
                                     bw.write(System.getProperty("line.separator")); 
                
                               }
           
                                bw.close(); 
                               fr.close();        
            
                           }
                          catch(FileNotFoundException ea)
                          {
                           ea.printStackTrace();
                          }     catch (IOException ex) {
                          Logger.getLogger(UpdateFacultyInformation.class.getName()).log(Level.SEVERE, null, ex);
                          }
                         } catch (FileNotFoundException ex) {
                         Logger.getLogger(Updatefaculty.class.getName()).log(Level.SEVERE, null, ex);
                         }
                   
                   
                    
                }
                
               
                
            }
        }
           
            
        
        
        });
    }
    
}
