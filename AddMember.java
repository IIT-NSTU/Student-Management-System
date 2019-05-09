
package projectsms;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;




public class AddMember extends JFrame{
    
     Container c;
     JLabel namelbl,rolllbl,sessionlbl,hometownlbl,emaillbl,contactlbl,bloodlbl;
     JTextField name,roll,session,hometown,eemail,contact,blood;
      JButton back,home;
     final Font f;
     JFrame frame;
    
  
    AddMember(){
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(new java.awt.Color(0, 230, 230));
        
        f=new Font("Arial",Font.BOLD,24);
        
        
        namelbl=new JLabel("Name                 :");      
        namelbl.setFont(f);
        namelbl.setBounds(180,100,200,50);
        c.add(namelbl);
        
        name=new JTextField();      
        name.setFont(f);
        name.setBounds(400,100,300,40);
        c.add(name);
        
        
        rolllbl=new JLabel("Roll No              :");      
        rolllbl.setFont(f);
        rolllbl.setBounds(180,160,200,50);
        c.add(rolllbl);
       
        roll=new JTextField();      
        roll.setFont(f);
        roll.setBounds(400,160,300,40);
        c.add(roll);
        
        sessionlbl=new JLabel("Session             :");      
        sessionlbl.setFont(f);
        sessionlbl.setBounds(180,220,200,50);
        c.add(sessionlbl);
        
        session=new JTextField();      
        session.setFont(f);
        session.setBounds(400,220,300,40);
        c.add(session);
        
        hometownlbl=new JLabel("Home town        :");      
        hometownlbl.setFont(f); 
        hometownlbl.setBounds(180,280,200,50);
        c.add(hometownlbl);
        
        hometown=new JTextField();      
        hometown.setFont(f);
        hometown.setBounds(400,280,300,40);
        c.add(hometown);
        
        emaillbl=new JLabel("Email                 :");      
        emaillbl.setFont(f); 
        emaillbl.setBounds(180,340,200,50);
        c.add(emaillbl);
        
        eemail=new JTextField();      
        eemail.setFont(f);
        eemail.setBounds(400,340,300,40);
        c.add(eemail);
        
        contactlbl=new JLabel("Contact              :");      
        contactlbl.setFont(f);
        contactlbl.setBounds(180,400,200,50);
        c.add(contactlbl);
        
        contact=new JTextField();      
        contact.setFont(f);
        contact.setBounds(400,400,300,40);
        c.add(contact);
        
        bloodlbl=new JLabel("Blood Group      :");      
        bloodlbl.setFont(f);
        bloodlbl.setBounds(180,460,200,50);
        c.add(bloodlbl);
        
        blood=new JTextField();      
        blood.setFont(f);
        blood.setBounds(400,460,300,40);
        c.add(blood);
        
        
        
        back=new JButton("Back");
        back.setBounds(180,570,150,50);
        back.setFont(f);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        c.add(back);
        
        home=new JButton("Home");
        home.setBounds(520,570,150,50);
        home.setFont(f);
        home.setBackground(Color.BLACK);
        home.setForeground(Color.WHITE);
        c.add(home);
        
        
         frame=new JFrame();
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200,50,800,650);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setTitle("Add member");
        frame.setVisible(true);
        frame.add(c);
       
       
         
    
        
       }
    
    //public static void main(String[] args) {
        
        //AddMember home=new AddMember();
    //}
}