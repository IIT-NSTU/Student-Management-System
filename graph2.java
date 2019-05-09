
package Demo;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;


public class graph2 extends JFrame{
      Container c;
      JLabel l1,l2,l3;
      Font f;
      JTextField tf1,tf2;
      JButton b1,home;
      JComboBox cb1;
      JPanel panel;
     
    graph2()
    {
        c= this.getContentPane();
        c.setLayout(null);
        c.setBackground(new Color(0,230,230));
        
        f = new Font("Candara",Font.BOLD,25);
        
         l1 = new JLabel("Semester: ");
        l1.setBounds(100,60,200,50);
        l1.setForeground(Color.BLACK);
        l1.setFont(f);
        c.add(l1);
        
        l2 = new JLabel("Name:  ");
        l2.setBounds(100,170,200,50);
        l2.setForeground(Color.BLACK);
        l2.setFont(f);
        c.add(l2);
        
        l3 = new JLabel("Id:  ");
        l3.setBounds(100,260,200,50);
        l3.setForeground(Color.BLACK);
        l3.setFont(f);
        c.add(l3);
        
        tf1= new JTextField();
        tf1.setBounds(320,60,200,50);
        tf1.setBackground(Color.WHITE);
        c.add(tf1);
        
         tf2= new JTextField();
        tf2.setBounds(320, 260, 200, 50);
        tf2.setBackground(Color.WHITE);
        c.add(tf2);
        
        String student[]={"Abdullah An Noor","Imran Hossain","Mahbub Alam","Fazle Rabbi","Abrar Hossain Asif","Nishat Tasnim","Md Mynuddin","Al Adnan Sami","Shuvro Aditya","Gazi MoinuddinRobi","Tahrim Kabir","Azad Hossain","Faysal Ahammed","Al Shahriar Priyo","Rahat Uddin Azad","Moonmoon Das","Mahfuzur Rahman","Al Jaber Nishad","Saifur Rahman","Suvo Islam","Faizul Karim Pathan","Nadim Bhuiyan","Kamruzzaman Shekh","Akash Chandra Debnath","Khair Ahmad","Anwar Kabir","Nowal Binte Bashar"};
        cb1 = new JComboBox(student);
        cb1.setBounds(320, 170, 200, 50);
        cb1.setBackground(Color.WHITE);
        c.add(cb1);
        
       
          JFreeChart barChart = ChartFactory.createBarChart(
         "Result Graph",           
         "Semester",            
         "GPA",            
         createDataset(),          
         PlotOrientation.VERTICAL,           
         true, true, false);
         
      ChartPanel chartPanel = new ChartPanel( barChart );        
      chartPanel.setPreferredSize(new java.awt.Dimension( 400 , 300 ) ); 
      chartPanel.setBounds(600,20,500,500);
      chartPanel.setVisible(false);
      c.add(chartPanel);
       
       
        b1= new JButton("Enter");
        b1.setForeground(Color.WHITE);
        b1.setBackground(Color.BLACK);
        b1.setBounds(320, 330, 100, 50);
        b1.setFont(f);
        c.add(b1);
        
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
              //  HomeDemo home=new HomeDemo();  
            }
            }
        
        });
        
        
       b1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
               if(ae.getSource()==b1)
               {
                   chartPanel.setVisible(true);
                   
               }
            }
           
       });
       
       
        
       JFrame frame=new JFrame();
      
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setExtendedState(MAXIMIZED_BOTH);
        frame.setVisible(true);
        frame.setTitle("CGPA graph");
        frame.add(c);
        
    }
    
    private CategoryDataset createDataset( ) {
       String fiat = "1st";        
       String audi = "2nd";        
       String ford = "3rd";
       String marcity = "";
       String nissan = "5rd";
       String first = "1st Semister";        
       String second = "2nd Semister";        
       String third = "3rd Semister";        
       String fourth = "4th Semister"; 
       String safe = "5th Semister"; 
       DefaultCategoryDataset dataset = 
      new DefaultCategoryDataset( );  
      
       File file  = new File("routine.txt");
         
      try{
           FileReader  fr = new FileReader(file);
           BufferedReader br = new BufferedReader(fr); 
           
           Object[] lines = br.lines().toArray();
           
           for(int i=0;i<lines.length;i++)
           {
               String[] row = lines[i].toString().split("#");
               
               
           }
           
      }
      catch(Exception e)
      {
          e.printStackTrace();
      }
       
      dataset.addValue( 3.40 , marcity , first);        
      // dataset.addValue( 3.0 , fiat , userrating );        
     //  dataset.addValue( 5.0 , fiat , millage ); 
     //  dataset.addValue( 5.0 , fiat , safety );           

     // dataset.addValue( 5.0 , audi , speed );        
      //dataset.addValue( 6.0 , audi , userrating );       
      dataset.addValue( 3.52 , marcity , second );        
    //  dataset.addValue( 4.0 , audi , safety );

    //  dataset.addValue( 4.0 , ford , speed );        
    //  dataset.addValue( 3.90 , marcity , third );  //      
     // dataset.addValue( 3.0 , ford , millage );        
   //   dataset.addValue( 3.99 , marcity , fourth );    //
     // dataset.addValue( 5.0 , fiat , millage );
     
     // dataset.addValue( 5.0 , fiat , safety );     
    //  dataset.addValue( 3.99 , marcity , safe ); 

      return dataset; 
   }
   
    
    public static void main(String[] args) {
        graph2 frame = new graph2();
    }
}


