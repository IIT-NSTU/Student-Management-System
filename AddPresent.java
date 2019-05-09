
package projectsms;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.text.DecimalFormat;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class AddPresent extends JFrame{
    
     Container c;
     JLabel namelbl,rolllbl,heldlbl,presentlbl;
     JTextField name,roll,held,present;
      JButton back,home,add;
     final Font f;
     JFrame frame;
     private static DecimalFormat df2 = new DecimalFormat("#.##");
     
     String filename;
    
  
    AddPresent(){
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(new java.awt.Color(0, 230, 230));
        
        f=new Font("Arial",Font.BOLD,24);
        
        
        namelbl=new JLabel("Name");      
        namelbl.setFont(f);
        namelbl.setBounds(140,100,200,50);
        c.add(namelbl);
        
        name=new JTextField();      
        name.setFont(f);
        name.setBounds(500,100,300,40);
        c.add(name);
        
        
        rolllbl=new JLabel("Roll no");      
        rolllbl.setFont(f);
        rolllbl.setBounds(140,160,200,50);
        c.add(rolllbl);
       
        roll=new JTextField();      
        roll.setFont(f);
        roll.setBounds(500,160,300,40);
        c.add(roll);
        
        heldlbl=new JLabel("Class Held(H)");      
        heldlbl.setFont(f);
        heldlbl.setBounds(140,220,200,50);
        c.add(heldlbl);
        
        held=new JTextField();      
        held.setFont(f);
        held.setBounds(500,220,300,40);
        c.add(held);
        
        presentlbl=new JLabel("Present In Class(H)");      
        presentlbl.setFont(f); 
        presentlbl.setBounds(140,280,250,50);
        c.add(presentlbl);
        
        present=new JTextField();      
        present.setFont(f);
        present.setBounds(500,280,300,40);
        c.add(present);
             
      
        add=new JButton("Add");
        add.setBounds(650,510,150,50);
        add.setFont(f);
        add.setBackground(Color.BLACK);
        add.setForeground(Color.WHITE);
        c.add(add);
        
        
        back=new JButton("Back");
        back.setBounds(180,570,150,50);
        back.setFont(f);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        c.add(back);
        
        home=new JButton("Home");
        home.setBounds(650,570,150,50);
        home.setFont(f);
        home.setBackground(Color.BLACK);
        home.setForeground(Color.WHITE);
        c.add(home);
        
        
         frame=new JFrame();
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200,50,800,650);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setTitle("Course Attendence");
        frame.setVisible(true);
        frame.add(c);
        
        add.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            
            if(e.getSource()==add)
            {
                String sname =name.getText();
                String sroll = roll.getText();
                String sheld = held.getText();
                String spresent = present.getText();
                
                
                
                
                
                if(sname.equals("")){
                    JOptionPane.showMessageDialog(null,"Please Insert name");
                }
                else if(sroll.equals("")){
                    JOptionPane.showMessageDialog(null,"Please Insert roll");
                }
                else if(sheld.equals("")){
                    JOptionPane.showMessageDialog(null,"Please Insert Held classes(H)");
                }
                
                else{
                     double intheld =Double.parseDouble(sheld);
                     double intpresent =Double.parseDouble(spresent);
                     double percent = (intpresent/intheld)*100;
                     String percent1 = df2.format(percent);
                     
                     String parcent2 =new Double(percent1).toString();
                     filewriter(sname,sroll,sheld,spresent,parcent2);
                     JOptionPane.showMessageDialog(null, "Added Successfully");
                     name.setText("");
                     roll.setText("");
                     held.setText("");
                     present.setText("");
                
                   
                    
                    
                    
                } 
                
                
            }
            
            }
        private void filewriter(String sname, String sroll, String sheld, String spresent, String spercent) {
                try{
                    FileWriter wr = new FileWriter(filename,true);
                    wr.write(sname+" "+"#");
                    wr.write(sroll+" "+"#");
                    wr.write(sheld+" "+"#");
                    wr.write(spresent+" "+"#");
                    wr.write(spercent+" "+"#");
                    
                    
                    
                    
                       
                    wr.write(System.getProperty("line.separator"));
                    wr.close();
                }
                catch(Exception ae)
                {
                    System.out.println(ae);
                }
            }
        
        });
        
         home.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
               if(ae.getSource()==home)
               {
                  frame.dispose();
                  Home menuFile = new Home();
                  
               }
            }
            
        });
    }
    
    public static void main(String[] args) {
        
        AddPresent a =  new AddPresent();
        
    }
    
    
    
}
