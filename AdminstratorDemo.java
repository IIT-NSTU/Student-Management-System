
package projectsms;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class AdminstratorDemo extends JFrame{
    
    private Container c;
    private JLabel adminlabel,label1,label2,label3,label4,label5;
    private JButton homebtn,addfacultybtn,addstubtn,updatebtn,deletestubtn,routinebtn;
    private final Font f;
    private final Font hf;
    private final Cursor cursor; 
    
    AdminstratorDemo(){
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(new java.awt.Color(0, 230, 230));
        
        
        hf=new Font("Arial",Font.BOLD,28);
        f=new Font("Arial",Font.BOLD,24);
        cursor =new Cursor(Cursor.HAND_CURSOR);
        
        adminlabel=new JLabel("Administrator");
        adminlabel.setFont(hf);
        adminlabel.setBounds(380,60,200,70);
        c.add(adminlabel);
        
        label1=new JLabel("1.");
        label1.setFont(f);
        label1.setBounds(180,140,20,50);
        c.add(label1);
        
        updatebtn=new JButton("Update Student Information");
        updatebtn.setBounds(200,140,400,50);
        updatebtn.setFont(f);
        updatebtn.setCursor(cursor);
        updatebtn.setBackground(new java.awt.Color(0,230,230));
        c.add(updatebtn);
        
        label2=new JLabel("2.");
        label2.setFont(f);
        label2.setBounds(180,200,20,50);
        c.add(label2);
        
        addstubtn=new JButton("Add Student");
        addstubtn.setBounds(200,200,190,50);
        addstubtn.setFont(f);
        addstubtn.setCursor(cursor);
        addstubtn.setBackground(new java.awt.Color(0,230,230));
        c.add(addstubtn);
        
        label3=new JLabel("3.");
        label3.setFont(f);
        label3.setBounds(180,260,20,50);
        c.add(label3);
        
        deletestubtn=new JButton("Delete Student");
        deletestubtn.setBounds(200,260,210,50);
        deletestubtn.setFont(f);
        deletestubtn.setCursor(cursor);
        deletestubtn.setBackground(new java.awt.Color(0,230,230));
        c.add(deletestubtn);
        
        label4=new JLabel("4.");
        label4.setFont(f);
        label4.setBounds(180,320,20,50);
        c.add(label4);
        
        addfacultybtn=new JButton("Add a Faculty member");
        addfacultybtn.setBounds(200,320,300,50);
        addfacultybtn.setFont(f);
        addfacultybtn.setCursor(cursor);
        addfacultybtn.setBackground(new java.awt.Color(0,230,230));
        c.add(addfacultybtn);
        
        label5=new JLabel("5.");
        label5.setFont(f);
        label5.setBounds(180,380,20,50);
        c.add(label5);
        
        routinebtn=new JButton("Update Routine");
        routinebtn.setBounds(200,380,235,50);
        routinebtn.setFont(f);
        routinebtn.setCursor(cursor);
        routinebtn.setBackground(new java.awt.Color(0,230,230));
        c.add(routinebtn);
        
        homebtn=new JButton("Home");
        homebtn.setBounds(300,500,150,50);
        homebtn.setFont(f);
        homebtn.setBackground(Color.BLACK);
        homebtn.setForeground(Color.WHITE);
        homebtn.setCursor(cursor);
        c.add(homebtn);
        
        JFrame frame=new JFrame();
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200,50,800,650);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setTitle("Administrator");
        frame.setVisible(true);
        frame.add(c);   
        
        
        homebtn.addActionListener(new ActionListener(){
        
  
        @Override
        public void actionPerformed(ActionEvent e){
            
  
                frame.dispose();
                Home admin =new Home();
        }
        
        });
        
        addfacultybtn.addActionListener(new ActionListener(){
        
  
        @Override
        public void actionPerformed(ActionEvent e){
            
  
                if(e.getSource()==addfacultybtn){
                 
                    frame.dispose();
                    AddfacultyMember addmember = new AddfacultyMember();
                    
                }
        }
        
        });
        
        addstubtn.addActionListener(new ActionListener(){
        
  
        @Override
        public void actionPerformed(ActionEvent e){
            
  
                if(e.getSource()==addstubtn){
                 
                    frame.dispose();
                    AddStudentMember addmember = new AddStudentMember();
                    
                }
        }
        
        });
    }
    //public static void main(String[] args) {
      //  AdminstratorDemo adminDemo = new AdminstratorDemo();
   // }
}
