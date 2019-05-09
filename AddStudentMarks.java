
package projectsms;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class AddStudentMarks extends  StudentMarks{
    
      JButton add;
      JTextField filenam;
      JLabel filenamelbl;
      String filename;
    
    AddStudentMarks(){
        
        filenamelbl=new JLabel("File Name");      
        filenamelbl.setFont(f);
       filenamelbl.setBounds(140,460,350,50);
       c.add(filenamelbl);
        
        filenam=new JTextField();      
        filenam.setFont(f);
        filenam.setBounds(500,460,300,40);
        c.add(filenam);
        
        add=new JButton("Add");
        add.setBounds(650,510,150,50);
        add.setFont(f);
        add.setBackground(Color.BLACK);
        add.setForeground(Color.WHITE);
        c.add(add);
        
        add.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            
            if(e.getSource()==add)
            {
                String sname =name.getText();
                String sroll = roll.getText();
                String sct1 = ct1.getText();
                String sct2 = ct2.getText();
                String sassign =assign.getText();
                String sattendence = attendence.getText();
                filenam.setText(filename);
                String sfilename = filenam.getText();
                
                
                
                
                if(sname.equals("")){
                    JOptionPane.showMessageDialog(null,"Please Insert name");
                }
                else if(sroll.equals("")){
                    JOptionPane.showMessageDialog(null,"Please Insert roll");
                }
                else if(sct1.equals("")){
                    JOptionPane.showMessageDialog(null,"Please Insert CT1 Mark");
                }
                else if(sct2.equals("")){
                    JOptionPane.showMessageDialog(null,"Please Insert CT2 Mark");
                }
               else if(sassign.equals("")){
                    JOptionPane.showMessageDialog(null,"Please Insert Assgignment Mark");
                }
               else if(sattendence.equals("")){
                    JOptionPane.showMessageDialog(null,"Please Insert Attentence Mark");
                }
               else if(!sfilename.equals(filename)){
                    JOptionPane.showMessageDialog(null,"You Modify the Filenme");
                }
                else{
                     double intct1 =Double.parseDouble(sct1);
                double intct2 =Double.parseDouble(sct2);
                double intassign =Double.parseDouble(sassign);
               double intattend =Double.parseDouble(sattendence);
                if(intct1>=intassign && intct2>=intassign){
                                 
                      double sum = (intct1+intct2)/2+intattend;
                              
                         String sum1=new Double(sum).toString();
                         filewriter(sname,sroll,sct1,sct2,sassign,sattendence,sum1);
                         JOptionPane.showMessageDialog(null, "Insert Successfully");
                           name.setText("");
                          roll.setText("");
                         ct1.setText("");
                          ct2.setText("");
                         assign.setText("");
                         attendence.setText("");
                            }
                             else if(intct1>=intct2 && intct2<=intassign){
                                 double sum = (intct1+intassign)/2+intattend;
                                  String sum1=new Double(sum).toString(); 
                                  filewriter(sname,sroll,sct1,sct2,sassign,sattendence,sum1);
                                  JOptionPane.showMessageDialog(null, "Insert Successfully");
                                 name.setText("");
                                 roll.setText("");
                                 ct1.setText("");
                                  ct2.setText("");
                                 assign.setText("");
                                 attendence.setText("");
                             }
                             else if(intct1<=intct2 && intct1<=intassign){
                                 
                                 double sum = (intct2+intassign)/2+intattend;
                                  String sum1=new Double(sum).toString(); 
                                  filewriter(sname,sroll,sct1,sct2,sassign,sattendence,sum1);
                                 JOptionPane.showMessageDialog(null, "Insert Successfully");
                                 name.setText("");
                                 roll.setText("");
                                 ct1.setText("");
                                 ct2.setText("");
                                 assign.setText("");
                                 attendence.setText("");
                              
                                 
                                 
                             }
                   
                    
                    
                    
                } 
                
                
            }
            
            }
        private void filewriter(String sname, String sroll, String sct1, String sct2, String sassign, String sattendence,String sum1) {
                try{
                    FileWriter wr = new FileWriter(filename,true);
                    wr.write(sname+" "+"#");
                    wr.write(sroll+" "+"#");
                    wr.write(sct1+" "+"#");
                    wr.write(sct2+" "+"#");
                    wr.write(sassign+" "+"#");
                    wr.write(sattendence+" "+"#");
                    wr.write(sum1+" "+"#");
                    
                    
                    
                       
                    wr.write(System.getProperty("line.separator"));
                    wr.close();
                }
                catch(Exception ae)
                {
                    System.out.println(ae);
                }
            }
        
        });
        
        

        
        
    }
    
   // public static void main(String[] args) {
       // AddStudentMarks addStudentMarks = new AddStudentMarks();
   // }
    
    
}
