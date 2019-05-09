
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


public class DeleteFaculty extends TeacherInformtion{
    
     JButton delete,back;     
   public  DeleteFaculty() throws FileNotFoundException{
        
        
        delete=new JButton("Delete");
        delete.setBounds(1100,540,150,50);
        //home.setFont(f);
        delete.setBackground(Color.BLACK);
        delete.setForeground(Color.WHITE);
        c.add(delete);
        
        back=new JButton("Back");
        back.setBounds(700,600,150,50);
        //home.setFont(f);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        c.add(back);
        
        delete.addActionListener(new ActionListener(){
        
  
        @Override
        public void actionPerformed(ActionEvent e){
            
  
                int numRow =table.getSelectedRow();
                model.removeRow(numRow);
                
                JOptionPane.showMessageDialog(null,"Delete SuccessFully\n");
                File file  = new File("teachersInformation.txt");
            try{
           FileWriter  fr = new FileWriter(file);
           BufferedWriter bw = new BufferedWriter(fr); 
           
           //Object[] lines = bw.lines().toArray();
        
               
            for(int i=0;i<table.getRowCount();i++) 
            {
                 for(int j=0;j<table.getColumnCount();j++)
                 {
                  bw.write(table.getValueAt(i, j).toString()+" "+"#");
                    
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
                Logger.getLogger(UpdateStudentInformation.class.getName()).log(Level.SEVERE, null, ex);
            }
         
        }
      
        
        });
        back.addActionListener(new ActionListener(){
        
  
        @Override
        public void actionPerformed(ActionEvent e){
            
  
                frame.dispose();
                AdminstratorDemo admin = new AdminstratorDemo();
        }
        
        });
    }
    
}
