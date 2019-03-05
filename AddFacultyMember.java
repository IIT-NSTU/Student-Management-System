
package project;


import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;




public class AddFacultyMember extends JFrame{
    
    private Container c;
    private JLabel namelbl,motherslbl,Fatherslbl,hometownlbl,emaillbl,contactlbl,bloodlbl;
    private JTextField name,mother,father,hometown,email,contact,blood;
    private JButton add,back,home;
    private final Font f;
    
    
  
    AddFacultyMember(){
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
        
        father=new JTextField();      
        father.setFont(f);
        father.setBounds(400,220,300,40);
        c.add(father);
        
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
        
                
        
        JFrame frame=new JFrame();
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200,50,800,650);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setTitle("Add a Faculty member");
        frame.setVisible(true);
        frame.add(c);
       
          
    
         add.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                
                if(e.getSource()==add){
                   String sntf=name.getText();
                  String mntf=mother.getText();
         String fntf=father.getText();
         String httf=hometown.getText();
         String etf=email.getText();
         String ctf=contact.getText();
         String btf=blood.getText();
       
         filewriter(sntf,mntf,fntf,httf,etf,ctf,btf); 
                }
            
         
                
           
                   
                   
                   
                
            }
             
         });
          back.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
            
            name.setText("");
            mother.setText("");
            father.setText("");
            hometown.setText("");
            email.setText("");
            contact.setText("");
            blood.setText("");
                

                
            }
             
         });
       
       
    } 
    public void filewriter(String sntf,String mntf,String fntf,String httf,String etf,String ctf,String btf)
        {
        File folder=new File("C:/Users/ASUS/Desktop/myjava");
        folder.mkdir();
        String path=folder.getAbsolutePath();
        File student=new File(path+"/student.txt");
       // File teacher =new File(path+"/teacher.txt");
       
       
        try{
            student.createNewFile();
            //teacher.createNewFile();
            
           // FileOutputStream fn=new FileOutputStream(path+"/student.txt");
           // FileOutputStream fout1=new FileOutputStream(path+"/teacher.txt");
            //FileInputStream fin=new FileInputStream(path+"/student.txt");
            //FileInputStream fin1=new FileInputStream(path+"/teacher.txt");
            
            FileWriter fn=new FileWriter("student.txt",true);
            fn.write(sntf+" "+"");
            fn.write(mntf+" "+"");
            fn.write(fntf+" "+"");
            fn.write(httf+" "+"");
            fn.write(etf+" "+"");
            fn.write(ctf+" "+"");
            fn.write(btf+" "+"");
            fn.write(System.lineSeparator());
            
            
         // fn.append(System.lineSeparator());
           fn.close();   
            
        }
        catch(Exception e)
        {
          e.printStackTrace();
        }
         
    }  
    public static void main(String[] args) {
        
        AddFacultyMember home=new AddFacultyMember();
        
    }
        
    }

