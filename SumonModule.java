
package projectsms;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class SumonModule extends TeacherModuleDemo{
    
    SumonModule(){
        
       
        
        addbtn.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            
            if(e.getSource()==addbtn)
            {
                 frame.dispose();
                SumonAddCourse course=new SumonAddCourse();  
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
                    SumonCourses course=new SumonCourses();
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(SumonModule.class.getName()).log(Level.SEVERE, null, ex);
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
                  SumonMenuFile menuFile = new SumonMenuFile();
            
                  
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
                  SumonModule dtm = new SumonModule();
                  
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
                  SumonCourseMenu menuFile = new SumonCourseMenu();
            
                  
               }
            }
            
       
      
            
        }); 
        
        
        
    }
    public static void main(String[] args) {
        DirecTorModule d = new DirecTorModule();
    }
    
}
