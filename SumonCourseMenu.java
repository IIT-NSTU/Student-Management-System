
package projectsms;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.JFileChooser;

public class SumonCourseMenu extends CourseMenu{
     int option;
    SumonCourseMenu(){
        
        newitem.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
             File file;
             filename1=null;
            //JOptionPane.showMessageDialog(null, "why");
            if(filename1==null){
                int option = jc.showSaveDialog(SumonCourseMenu.this);
            if(option==JFileChooser.APPROVE_OPTION){
                file=jc.getSelectedFile();
                filename1 = file.getPath();
                frame.dispose();
                AddPresent addPresent= new AddPresent();
                addPresent.filename=filename1;
               addPresent.back.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
               if(ae.getSource()==addPresent.back)
               {
                 addPresent.frame.dispose();
                 SumonCourseMenu dmf = new SumonCourseMenu();
                  
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
                  SumonModule dtm = new SumonModule();
            
                  
               }
            }
            
        });
        
    }
    
}
