
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
import java.text.DecimalFormat;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;


public class ShowA extends JFrame{
   Container c;
      JLabel l1,l2,l3,total,label;
      Font f;
      JTextField tf1,tf2,tf3;
      JButton b1,show,home;
      JComboBox cb1,cb2;
      private static DecimalFormat df2 = new DecimalFormat("#.##");
       JTable table;
     DefaultTableModel model;
      JScrollPane scroll;
      String[] coloum1 = {"Course Name","Course Code","Class Held","Class Attendence","Course Percentage"};
      
      ShowA()
      {
          
        
         c= this.getContentPane();
        c.setLayout(null);
        c.setBackground(new Color(0,230,230));
        
        f = new Font("Arial",Font.BOLD,18);
        
        l1 = new JLabel("Roll NO: ");
        l1.setBounds(10,10,80,50);
        l1.setForeground(Color.BLACK);
        l1.setFont(f);
        c.add(l1);
        
        l2 = new JLabel("Semester  ");
        l2.setBounds(260,10,120,50);
        l2.setForeground(Color.BLACK);
        l2.setFont(f);
        c.add(l2);
        
        l3 = new JLabel("Session  ");
        l3.setBounds(600,10,120,50);
        l3.setForeground(Color.BLACK);
        l3.setFont(f);
        c.add(l3);
        
        tf1= new JTextField();
        tf1.setBounds(90,10,150,50);
        tf1.setBackground(Color.WHITE);
        tf1.setFont(f);
        c.add(tf1);
        
         tf2= new JTextField();
        tf2.setBounds(380,10,200,50);
        tf2.setBackground(Color.WHITE);
        tf2.setFont(f);
        c.add(tf2);
        
        tf3= new JTextField();
        tf3.setBounds(725,10,200,50);
        tf3.setBackground(Color.WHITE);
        tf3.setFont(f);
        c.add(tf3);
        
        show=new JButton("Show");
        show.setBounds(1000,10,150,50);
        show.setFont(f);
        show.setBackground(Color.BLACK);
        show.setForeground(Color.WHITE);
        c.add(show);
        
        total = new JLabel("Average Attendence :");
        total.setBounds(40,640,200,50);
        total.setForeground(Color.BLACK);
        total.setFont(f);
        c.add(total);
        
        label = new JLabel("No data");
        label.setBounds(250,640,200,50);
        label.setForeground(Color.BLACK);
        label.setFont(f);
        c.add(label);
        
        home=new JButton("Home");
        home.setBounds(700,640,100,50);
        home.setFont(f);
        home.setBackground(Color.BLACK);
        home.setForeground(Color.WHITE);
        c.add(home);
        
        
        
        
        JFrame frame=new JFrame();
      
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setExtendedState(MAXIMIZED_BOTH);
        frame.setVisible(true);
        frame.setTitle("Attendence ");
        frame.add(c);
        
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
       show.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            
            if(e.getSource()==show)
            {
                //frame.dispose();
        
        table = new JTable();
        model = new DefaultTableModel();
        
        model.setColumnIdentifiers(coloum1);
        table.setModel(model);
        table.setFont(f);
        table.setSelectionBackground(Color.BLACK);
        table.setBackground(Color.WHITE);
        table.setRowHeight(30);
        
        scroll = new JScrollPane(table);
        scroll.setBounds(10,80,1300,450);
        c.add(scroll);
               String rollno =tf1.getText();
               String semister =tf2.getText();
               String session = tf3.getText();
               String filename = rollno+semister;
               
                if(rollno.equals("")){
                    JOptionPane.showMessageDialog(null,"Please Insert Roll No");
                }
               else if(semister.equals("")){
                    JOptionPane.showMessageDialog(null,"Please Insert Semister");
                }
                else if(semister.equals("")){
                    JOptionPane.showMessageDialog(null,"Please Insert Session");
                }
                else{
                    File file  = new File(filename);
                    if(file.isFile()){
                        
                        
                        try{
                         FileReader  fr = new FileReader(file);
                        BufferedReader br = new BufferedReader(fr); 
           
                        Object[] lines = br.lines().toArray();
           
                       for(int i=0;i<lines.length;i++)
                      {
                           String[] row = lines[i].toString().split("#");
                           model.addRow(row);
                           String per = model.getValueAt(i, 4).toString();
                           double per1 =Double.parseDouble(per);
                           per1++;
                           if(i==lines.length-1){
                               double per2 =per1/i+1;
                              String parcent = df2.format(per1); 
                              String parcent2 =new Double(parcent).toString();
                              label.setText(parcent2+"%");
                           }
                           
                          
                           
                      }
           
      }
      catch(FileNotFoundException ae)
      {
          ae.printStackTrace();
      }
                        
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "There are no file");
                    }
                    
                }
                
               
               
                 
            }
            }
        
        });
        
      }
      public static void main(String[] args) {
        ShowA d=new ShowA();
        
    }
}

