
package projectsms;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class DirecTorModule extends TeacherModuleDemo{
    
    DirecTorModule(){
        
       
        
        addbtn.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            
            if(e.getSource()==addbtn)
            {
                 frame.dispose();
                DirectorAddCourse course=new DirectorAddCourse();  
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
                    DirectorCourses course=new DirectorCourses();
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(DirecTorModule.class.getName()).log(Level.SEVERE, null, ex);
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
                  DirectorMenuFile menuFile = new DirectorMenuFile();
            
                  
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
                  DirecTorModule dtm = new DirecTorModule();
                  
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
                  DirectorCourseMenu menuFile = new DirectorCourseMenu();
            
                  
               }
            }
            
       
      
            
        });   
        
        
        
    }
    public static void main(String[] args) {
        DirecTorModule d = new DirecTorModule();
    }
    
}
