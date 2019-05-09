
package Demo;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;


public class graph1 extends JFrame {
       Container c;
      JLabel l1,l2,l3,header;
      Font f;
      JTextField tf1,tf2,tf3;
      JButton b1,b2,add,clear,show;
      
    graph1()
    {
          c= this.getContentPane();
        c.setLayout(null);
        c.setBackground(new Color(0,230,230));
        
        f = new Font("Arial",Font.BOLD,18);
        
        header = new JLabel("Add Student GPA in File ");
        header.setBounds(600,5,300,80);
        header.setForeground(Color.BLACK);
        header.setFont(f);
        c.add(header);
        
         l1 = new JLabel("Name: ");
        l1.setBounds(100,60,200,50);
        l1.setForeground(Color.BLACK);
        l1.setFont(f);
        c.add(l1);
        
        l2 = new JLabel("Roll:  ");
        l2.setBounds(100,170,200,50);
        l2.setForeground(Color.BLACK);
        l2.setFont(f);
        c.add(l2);
        
        l3 = new JLabel("GPA:  ");
        l3.setBounds(100,280,200,50);
        l3.setForeground(Color.BLACK);
        l3.setFont(f);
        c.add(l3);
        
        tf1= new JTextField();
        tf1.setBounds(320,60,200,50);
        tf1.setBackground(Color.WHITE);
        c.add(tf1);
        
          tf2= new JTextField();
        tf2.setBounds(320,170,200,50);
        tf2.setBackground(Color.WHITE);
        c.add(tf2);
        
          tf3= new JTextField();
        tf3.setBounds(320,280,200,50);
        tf3.setBackground(Color.WHITE);
        c.add(tf3);
        
        add=new JButton("Add");
        add.setBounds(380,400,150,50);
        add.setFont(f);
        add.setBackground(Color.BLACK);
        add.setForeground(Color.WHITE);
        c.add(add);
        
        clear=new JButton("Clear");
        clear.setBounds(100,400,150,50);
        clear.setFont(f);
        clear.setBackground(Color.BLACK);
        clear.setForeground(Color.WHITE);
        c.add(clear);
        
        show=new JButton("Show");
        show.setBounds(100,600,150,50);
        show.setFont(f);
        show.setBackground(Color.BLACK);
        show.setForeground(Color.WHITE);
        c.add(show);
        
        show.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
           if(e.getSource()==show)
           {
               graph2 g= new graph2();
           }
            
            }
             });
        
        clear.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
            tf1.setText("");
            tf2.setText("");
            tf3.setText("");
            
            }
             });
        
        add.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                
                if(e.getSource()==add){
         String stf=tf1.getText();
         String idtf=tf2.getText();
         String gpatf=tf3.getText();
         
       
         filewriter(stf,idtf,gpatf); 
                }
             }
             });
        
        JFrame frame=new JFrame();
      
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setExtendedState(MAXIMIZED_BOTH);
        frame.setVisible(true);
        frame.setTitle("Add Student GPA in File ");
        frame.add(c);
        
    }
    
     public void filewriter(String stf,String idtf,String gpatf)
        {
        try{
            FileWriter fn=new FileWriter("graph.txt",true);
            fn.write(stf+" "+"");
            fn.write(idtf+" "+"");
            fn.write(gpatf+" "+"");
            
            fn.write(System.getProperty("line.separator"));
            fn.close();   
         }
        catch(Exception e)
        {
          e.printStackTrace();
        }
         
        }
    
    public static void main(String[] args) {
        graph1 frame = new graph1();
    }
}
