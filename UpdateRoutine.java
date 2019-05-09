
package projectsms;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.FileNotFoundException;
import javax.swing.JButton;


public class UpdateRoutine extends RoutineDemo{
    
    public JButton update,back;
    
    
    UpdateRoutine() throws FileNotFoundException{
        
        back=new JButton("Back");
        back.setBounds(700,570,150,50);
        back.setFont(f);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        c.add(back);
        
         table.addMouseListener(new MouseAdapter(){
            
            @Override
            public void mouseClicked(MouseEvent ae){
                
                int numRow = table.getSelectedRow();
                String day =model.getValueAt(numRow, 0).toString();
               String fc= model.getValueAt(numRow, 1).toString();
                String sc  = model.getValueAt(numRow, 2).toString();
                String thc = model.getValueAt(numRow, 3).toString();
                String fhc = model.getValueAt(numRow, 4).toString();
                String ffc = model.getValueAt(numRow, 5).toString();
                String stc = model.getValueAt(numRow, 6).toString();
               // model.removeRow(numRow);
                
                  
        
                
                frame.dispose();
                UpdateRoutines adm = new UpdateRoutines();
                adm.daytf.setText(day);
                adm.firsttf.setText(fc);
                adm.secondtf.setText(sc);
                adm.thirdtf.setText(thc);
                adm.fourthtf.setText(fhc);
                adm.fifthtf.setText(ffc);
                adm.sixthtf.setText(stc);
                adm.row=numRow;
                
                
            }
        });
         
          back.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            
            if(e.getSource()==back)
            {
                frame.dispose();
                AdminstratorDemo home=new AdminstratorDemo();  
            }
            }
        
        });
        
    }
    
    public static void main(String[] args) throws FileNotFoundException {
        UpdateRoutine r = new UpdateRoutine();
    }
    
}
