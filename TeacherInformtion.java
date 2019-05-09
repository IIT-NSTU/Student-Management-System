
package projectsms;


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
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;



public class TeacherInformtion extends JFrame{
    
    Container c;
    JTable table;
    DefaultTableModel model;
    JScrollPane scroll;
    String[] coloum = {"Name","Home town","Email","Contact","Blood group"};
      JFrame frame;      
    //String[] rows = new String[6];
    JButton home;
    
    public TeacherInformtion() throws FileNotFoundException {
    
         
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(new java.awt.Color(0, 230, 230));
        
       
        
         Font hf=new Font("Arial",Font.BOLD,16);
        
        
        table = new JTable();
        
        model = new DefaultTableModel();
        model.setColumnIdentifiers(coloum);
        table.setModel(model);
        table.setFont(hf);
        table.setSelectionBackground(Color.BLACK);
        table.setBackground(Color.WHITE);
        table.setRowHeight(30);
        
        scroll = new JScrollPane(table);
        scroll.setBounds(10,30,1300,500);
        c.add(scroll);
        
        
        home=new JButton("Home");
        home.setBounds(1100,600,150,50);
        //home.setFont(f);
        home.setBackground(Color.BLACK);
        home.setForeground(Color.WHITE);
        c.add(home);
        
        
        
        
        frame=new JFrame();
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200,50,800,650);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setTitle("Teacher Information");
        frame.setVisible(true);
        frame.add(c);
        
        //String arr[]= {"dsfs","dhgfh","fgdh","hggfh","fgh","fghf"};
        //model.addRow(arr);
       
        
        File file  = new File("teachersInformation.txt");
         
      try{
           FileReader  tfr = new FileReader(file);
           BufferedReader tbr = new BufferedReader(tfr); 
           
           Object[] lines = tbr.lines().toArray();
           
            for (Object line : lines) {
                String[] row = line.toString().split("#");
                model.addRow(row);
            }
           
      }
      catch(FileNotFoundException e)
      {
          e.printStackTrace();
      }
        
        
        home.addActionListener(new ActionListener(){
        
  
        @Override
        public void actionPerformed(ActionEvent e){
            
  
                frame.dispose();
                Home hom = new Home();           
        }
        
        });
        
        
       
        
       
    }
    
    
}
