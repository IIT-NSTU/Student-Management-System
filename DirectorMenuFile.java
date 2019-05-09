
package projectsms;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.JFileChooser;


public class DirectorMenuFile extends MenuFile{
    //int option;
    DirectorMenuFile(){
             
              newitem.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
             File file;
             filename1=null;
            //JOptionPane.showMessageDialog(null, "why");
            if(filename1==null){
                int option = jc.showSaveDialog(DirectorMenuFile.this);
            if(option==JFileChooser.APPROVE_OPTION){
                file=jc.getSelectedFile();
                filename1 = file.getPath();
                frame.dispose();
                AddStudentMarks addStudentMarks = new AddStudentMarks();
                addStudentMarks.filename=filename1;
               addStudentMarks.back.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
               if(ae.getSource()==addStudentMarks.back)
               {
                 addStudentMarks.frame.dispose();
                 DirectorMenuFile dmf = new DirectorMenuFile();
                  
               }
            }
            
        });
                
            }
            }
            
            
            
            
        }
        
        });
              back.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
               if(ae.getSource()==back)
               {
                  frame.dispose();
                  DirecTorModule dtm = new DirecTorModule();
            
                  
               }
            }
            
        });
              
              
    }
    
}
