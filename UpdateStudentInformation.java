
package projectsms;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;


public class UpdateStudentInformation extends StudentInformation{
    public JButton update,back,edit;
  
    
    public UpdateStudentInformation() throws FileNotFoundException
    {
       
      
        
        back=new JButton("Back");
        back.setBounds(700,600,150,50);
        //home.setFont(f);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        c.add(back);
        
        
        table.addMouseListener(new MouseAdapter(){
            
            public void mouseClicked(MouseEvent ae){
                
                int numRow = table.getSelectedRow();
                String name =model.getValueAt(numRow, 0).toString();
                String roll_no = model.getValueAt(numRow, 1).toString();
                String s_session = model.getValueAt(numRow, 2).toString();
                String home = model.getValueAt(numRow, 3).toString();
                String email_name  = model.getValueAt(numRow, 4).toString();
                String contact_no = model.getValueAt(numRow, 5).toString();
                String blood_grp = model.getValueAt(numRow, 6).toString();
               // model.removeRow(numRow);
                
                  
        
                
                frame.dispose();
                UpdateStudent adm = new UpdateStudent();
                adm.name.setText(name);
                adm.roll.setText(roll_no);
                adm.session.setText(s_session);
                adm.hometown.setText(home);
                adm.eemail.setText(email_name);
                adm.contact.setText(contact_no);
                adm.blood.setText(blood_grp);
                adm.row=numRow;
                
                
            }
        });
        back.addActionListener(new ActionListener(){
        
  
        @Override
        public void actionPerformed(ActionEvent e){
            
  
                frame.dispose();
                AdminstratorDemo admin =new AdminstratorDemo();
        }
        
        });
    }
    
    
}
