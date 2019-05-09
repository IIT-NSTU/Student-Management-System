
package projectsms;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Teacher4Module extends TeacherModuleDemo{
    
    Teacher4Module(){
        
       
        
        addbtn.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            
            if(e.getSource()==addbtn)
            {
                 frame.dispose();
                Teacher4AddCourse course=new Teacher4AddCourse();  
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
                    Teacher4Courses course=new Teacher4Courses();
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
                  Teacher4MenuFile menuFile = new Teacher4MenuFile();
            
                  
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
                  Teacher4Module dtm = new Teacher4Module();
                  
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
                  Teacher4CourseMenu menuFile = new Teacher4CourseMenu();
            
                  
               }
            }
            
       
      
            
        });  
        
        
        
    }
    
}
