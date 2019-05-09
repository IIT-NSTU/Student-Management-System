
package projectsms;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Teacher5Module extends TeacherModuleDemo{
    
    Teacher5Module(){
        
       
        
        addbtn.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            
            if(e.getSource()==addbtn)
            {
                 frame.dispose();
                Teacher5AddCourse course=new Teacher5AddCourse();  
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
                    Teacher5Courses course1=new Teacher5Courses();
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(Teacher5Module.class.getName()).log(Level.SEVERE, null, ex);
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
                  Teacher5MenuFile menuFile = new Teacher5MenuFile();
            
                  
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
                  Teacher5Module dtm = new Teacher5Module();
                  
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
                  Teacher5CourseMenu menuFile = new Teacher5CourseMenu();
            
                  
               }
            }
            
       
      
            
        }); 
        
        
        
    }
    
}
