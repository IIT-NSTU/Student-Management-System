
package projectsms;


import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
public class AddRoutine extends JFrame{
    
    public Container c;
    public JLabel daylbl,firstlbl,secondlbl,thirdlbl,fourthlbl,fifthlbl,sixthlbl;
    public JTextField daytf,firsttf,secondtf,thirdtf,fourthtf,fifthtf,sixthtf;
    public JButton add,back,home;
    public Font f;
   
    
    AddRoutine()
    {
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(new java.awt.Color(0, 230, 230));
        
        f=new Font("Arial",Font.BOLD,24);
        
        
        daylbl=new JLabel("Day name      :");      
        daylbl.setFont(f);
        daylbl.setBounds(140,100,220,50);
        c.add(daylbl);
        
        daytf=new JTextField();      
        daytf.setFont(f);
        daytf.setBounds(400,100,300,40);
        c.add(daytf);
        
        
        firstlbl=new JLabel("09.00am-10.00am:");      
        firstlbl.setFont(f);
       firstlbl.setBounds(140,160,220,50);
        c.add(firstlbl);
        
       firsttf=new JTextField();      
        firsttf.setFont(f);
        firsttf.setBounds(400,160,300,40);
        c.add(firsttf);
        
        secondlbl=new JLabel("10.00am-11.00am:");      
        secondlbl.setFont(f);
        secondlbl.setBounds(140,220,220,50);
        c.add(secondlbl);
        
        secondtf=new JTextField();      
        secondtf.setFont(f);
        secondtf.setBounds(400,220,300,40);
        c.add(secondtf);
        
        thirdlbl=new JLabel("11.00am-12.00pm:");      
        thirdlbl.setFont(f); 
        thirdlbl.setBounds(140,280,220,50);
        c.add(thirdlbl);
        
        thirdtf=new JTextField();      
        thirdtf.setFont(f);
        thirdtf.setBounds(400,280,300,40);
        c.add(thirdtf);
        
        fourthlbl=new JLabel("12.00pm-01.00pm:");      
        fourthlbl.setFont(f); 
        fourthlbl.setBounds(140,340,220,50);
        c.add(fourthlbl);
        
        fourthtf=new JTextField();      
        fourthtf.setFont(f);
        fourthtf.setBounds(400,340,300,40);
        c.add(fourthtf);
        
        fifthlbl=new JLabel("02.00pm-03.00pm:");      
        fifthlbl.setFont(f);
        fifthlbl.setBounds(140,400,220,50);
        c.add(fifthlbl);
        
        fifthtf=new JTextField();      
        fifthtf.setFont(f);
        fifthtf.setBounds(400,400,300,40);
        c.add(fifthtf);
        
        sixthlbl=new JLabel("03.00pm-04.00pm:");      
        sixthlbl.setFont(f);
        sixthlbl.setBounds(140,460,220,50);
        c.add(sixthlbl);
        
        sixthtf=new JTextField();      
        sixthtf.setFont(f);
        sixthtf.setBounds(400,460,300,40);
        c.add(sixthtf);
        
        add=new JButton("Add");
        add.setBounds(520,510,150,50);
        add.setFont(f);
        add.setBackground(Color.BLACK);
        add.setForeground(Color.WHITE);
        c.add(add);
        
        back=new JButton("Back");
        back.setBounds(180,600,150,50);
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
        frame.setTitle("Update Routine data");
        frame.setVisible(true);
        frame.add(c);
        
        back.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
            frame.dispose();
            AdminstratorDemo a = new AdminstratorDemo();
            }
             });
        
        home.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            
            if(e.getSource()==home)
            {
                frame.dispose();
                Home home=new Home();  
            }
            }
        
        });

        
        add.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                
                if(e.getSource()==add){
         String sntf=daytf.getText();
         String mntf=firsttf.getText();
         String fntf=secondtf.getText();
         String httf=thirdtf.getText();
         String etf=fourthtf.getText();
         String ctf=fifthtf.getText();
         String btf=sixthtf.getText();
         
             JOptionPane.showMessageDialog(null,"Added successfully");
              filewriter(sntf,mntf,fntf,httf,etf,ctf,btf); 
                }
             }
             });
               
        
        
    }
    
        public void filewriter(String sntf,String mntf,String fntf,String httf,String etf,String ctf,String btf)
        {
        try{
            FileWriter fn=new FileWriter("routine.txt",true);
            fn.write(sntf+" "+"#");
            fn.write(mntf+" "+"#");
            fn.write(fntf+" "+"#");
            fn.write(httf+" "+"#");
            fn.write(etf+" "+"#");
            fn.write(ctf+" "+"#");
            fn.write(btf+" "+"#");
            fn.write(System.getProperty("line.separator"));

           fn.close();   
         }
        catch(Exception e)
        {
          e.printStackTrace();
        }
         
        }
               
        
        
    }
        
        
    

    


