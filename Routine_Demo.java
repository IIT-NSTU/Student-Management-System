
package project;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;


public class Routine_Demo extends JFrame{
    
    public Container c;
    public JTable table;
    public JLabel label;
    public JTextField tf;
    public JScrollPane scroll;
     Font f;   
    public JButton back,home;
     String cols[]={"Days","09.00am-10.00am","10.00am-11.00am","11.00am-12.00pm","01.00pm-02.00pm","02.00pm-03.00pm","3.00pm-4.00pm"};
     String rows[][] = new String[7][7] ;
     DefaultTableModel model;
     JFrame frame;
    Routine_Demo()throws FileNotFoundException
    {
        c=this.getContentPane();
        c.setBackground(new java.awt.Color(0, 230, 230));
        c.setLayout(null);
        
        f=new Font("Arial",Font.BOLD,18);
        
        label= new JLabel("Semester :");
        label.setBounds(10,10,150,50);
        label.setFont(f);
        c.add(label);
        
        tf =new JTextField();
        tf.setFont(f);
        tf.setBounds(150,10,150,50);
        c.add(tf);
      /*  
        rows[0][0]="Sunday";
        rows[0][1]="";
        rows[0][2]="";
        rows[0][3]="";
        rows[0][4]="";
        rows[0][5]="";
        rows[0][6]="";
        rows[1][0]="Monday";
        rows[1][1]="";
        rows[1][2]="";
        rows[1][3]="";
        rows[1][4]="";
        rows[1][5]="";
        rows[1][6]="";
        rows[2][0]="Tuesday";
        rows[2][1]="";
        rows[2][2]="";
        rows[2][3]="";
        rows[2][4]="";
        rows[2][5]="";
        rows[2][6]="";
        rows[3][0]="Wednesday";
        rows[3][1]="";
        rows[3][2]="";
        rows[3][3]="";
        rows[3][4]="";
        rows[3][5]="";
        rows[3][6]="";
        rows[4][0]="Thusday";
        rows[4][1]="";
        rows[4][2]="";
        rows[4][3]="";
        rows[4][4]="";
        rows[4][5]="";
        rows[4][6]="";
        rows[5][0]="Friday";
        rows[5][1]="";
        rows[5][2]="";
        rows[5][3]="";
        rows[5][4]="";
        rows[5][5]="";
        rows[5][6]="";
        rows[6][0]="Saturday";
        rows[6][1]="";
        rows[6][2]="";
        rows[6][3]="";
        rows[6][4]="";
        rows[6][5]="";
        rows[6][6]="";
        */
        Font hf=new Font("Arial",Font.BOLD,16);
        
        table =new JTable(rows,cols);
        table.setSelectionBackground(Color.GREEN);
        table.setRowHeight(60); 
        
        model=new DefaultTableModel();
        model.setColumnIdentifiers(cols);
        table.setModel(model);
        table.setFont(hf);
        table.setBackground(Color.WHITE);
    
        scroll=new JScrollPane(table);
        scroll.setBounds(5,90,1350,450);
        c.add(scroll);
        
        String filepath = "";
        
        File file  = new File("routine.txt");
         
      try{
           FileReader  fr = new FileReader(file);
           BufferedReader br = new BufferedReader(fr); 
           
           Object[] lines = br.lines().toArray();
           
           for(int i=0;i<lines.length;i++)
           {
               String[] row = lines[i].toString().split("#");
               
               model.addRow(row);
           }
           
      }
      catch(Exception e)
      {
          e.printStackTrace();
      }
        
        
        
        home=new JButton("Home");
        home.setBounds(520,570,150,50);
        home.setFont(f);
        home.setBackground(Color.BLACK);
        home.setForeground(Color.WHITE);
        c.add(home);
        
        home.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            
            if(e.getSource()==home)
            {
                dispose();
                HomeDemo home=new HomeDemo();  
            }
            }
        
        });
           frame=new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200,50,800,650);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setTitle("Routine");
        frame.setVisible(true);
        frame.add(c);
    }
    
    
   /* public static void main(String[] args) {
        Routine_Demo f= new Routine_Demo();
        
        
        
    }*/
}
