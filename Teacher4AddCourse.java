
package projectsms;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import javax.swing.JButton;
import javax.swing.JOptionPane;


public class Teacher4AddCourse extends AddCourses{
    
    Teacher4AddCourse(){
        
        back = new JButton("Back");
        back.setBounds(290, 560, 130, 50);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.setFont(F);
        c.add(back);
        
         
         
         Add.addActionListener(new ActionListener(){
        
  
        @Override
        public void actionPerformed(ActionEvent e){
            
  
               if(e.getSource()==Add)
            {
                
                String name =tname.getText();
                String code =tcode.getText();
                String  description = desArea.getText();
                if(name.equals("")){
                    JOptionPane.showMessageDialog(null, "Pelase Enter  Coursename");
                }
                else if(code.equals("")){
                    JOptionPane.showMessageDialog(null, "Pelase Enter  Course Code");
                }
                else if(desArea.equals("")){
                    JOptionPane.showMessageDialog(null, "Pelase Say something About Course");
                }
                else{
                    filewriter(name,code,description);
                    JOptionPane.showMessageDialog(null,"added Successfully");
                    tname.setText("");
                    tcode.setText("");
                   desArea.setText("");
                    
                }
                
                
                
                
                
                
            }
        }
            private void filewriter(String tname, String tcode, String desArea) {
                try{
                    FileWriter wr = new FileWriter("teacherCourse.txt",true);
                    wr.write(tname+" "+"#");
                    wr.write(tcode+" "+"#");
                    wr.write(desArea+" "+"#");   
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
            
  
                frame.dispose();
                Teacher4Module admin =new Teacher4Module();
        }
        
        });
        
    }
    
}
