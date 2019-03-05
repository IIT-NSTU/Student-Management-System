
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
     JLabel namelbl,motherslbl,Fatherslbl,hometownlbl,emaillbl,contactlbl,bloodlbl;
     JTextField name,mother,Father,hometown,email,contact,blood;
      JButton add,back,home;
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
        
        
        motherslbl=new JLabel("Mother's Name  :");      
        motherslbl.setFont(f);
        motherslbl.setBounds(180,160,200,50);
        c.add(motherslbl);
        
        mother=new JTextField();      
        mother.setFont(f);
        mother.setBounds(400,160,300,40);
        c.add(mother);
        
        Fatherslbl=new JLabel("Father's Name   :");      
        Fatherslbl.setFont(f);
        Fatherslbl.setBounds(180,220,200,50);
        c.add(Fatherslbl);
        
        Father=new JTextField();      
        Father.setFont(f);
        Father.setBounds(400,220,300,40);
        c.add(Father);
        
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
        
        email=new JTextField();      
        email.setFont(f);
        email.setBounds(400,340,300,40);
        c.add(email);
        
        contactlbl=new JLabel("Contact             :");      
        contactlbl.setFont(f);
        contactlbl.setBounds(180,400,200,50);
        c.add(contactlbl);
        
        contact=new JTextField();      
        contact.setFont(f);
        contact.setBounds(400,400,300,40);
        c.add(contact);
        
        bloodlbl=new JLabel("Blood Group    :");      
        bloodlbl.setFont(f);
        bloodlbl.setBounds(180,460,200,50);
        c.add(bloodlbl);
        
        blood=new JTextField();      
        blood.setFont(f);
        blood.setBounds(400,460,300,40);
        c.add(blood);
        
        add=new JButton("Add");
        add.setBounds(520,510,150,50);
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