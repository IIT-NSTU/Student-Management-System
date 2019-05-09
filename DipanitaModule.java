
package projectsms;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class DipanitaModule extends TeacherModuleDemo{
    
    DipanitaModule(){
        
       
        
        addbtn.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            
            if(e.getSource()==addbtn)
            {
                 frame.dispose();
                DipanitaAddCourses course=new DipanitaAddCourses();  
            }
                        
        }
        
        });
        coursebtn.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            
            if(e.getSource()==coursebtn)
            {
                 frame.dispose();
                try {  
                    DipanitaCourses course=new DipanitaCourses();
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(DipanitaModule.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
                        
        }
        
        });
        
        coursemarkbtn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
               if(ae.getSource()==coursemarkbtn)
               {
                  frame.dispose();
                  DipanitaMenuFile menuFile = new DipanitaMenuFile();
            
                  
               }
            }
            
        }); 
        
            courseattend.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
               if(ae.getSource()==courseattend)
               {
                  frame.dispose();
                  AddCoursePresent addc = new AddCoursePresent();
                      addc.back.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent aee) {
               if(aee.getSource()==addc.back )
               {
                  addc.frame.dispose();
                  DipanitaModule dtm = new DipanitaModule();
                  
               }
            }
            
        });
                  
                  
               }
            }
            
        });
        coursepresent.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
               if(ae.getSource()==coursepresent)
               {
                  frame.dispose();
                  DipanitaCourseMenu menuFile = new DipanitaCourseMenu();
            
                  
               }
            }
            
       
      
            
        });  
        
        
    }
    
}
