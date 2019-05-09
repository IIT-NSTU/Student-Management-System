
package project;


import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import static java.text.NumberFormat.Field.INTEGER;
import static javax.management.openmbean.SimpleType.INTEGER;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.block.BlockBorder;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.chart.title.TextTitle;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;


public class GraphDemo extends JFrame{
    Container c;
    JPanel panel2;
    JButton addbtn;
    JLabel semestername,gpa;
    JTextField semestertf,gpatf;
    Font f;
    JComboBox semestercb;
    String se;
     String       gp;
     ChartPanel chartPanel;
     public String[] cb={"1","2","3","4","5","6","7","8"};
    GraphDemo()
    {
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(new java.awt.Color(0, 230, 230));
        
        f=new Font("Arial",Font.BOLD,24);
        
         
          
        XYDataset dataset = createDataset();
        JFreeChart chart = createChart(dataset);
        chartPanel = new ChartPanel(chart);
        chartPanel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
        chartPanel.setBackground(Color.white);
        chartPanel.setBounds(70,20,750,500);
        chartPanel.setVisible(false);
        c.add(chartPanel);
        pack();
        setTitle("Line chart");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        semestername=new JLabel("Semester Name :");
        semestername.setBounds(70,550,220,50);
        semestername.setFont(f);
        c.add(semestername);
        
        semestercb=new JComboBox(cb);
        semestercb.setBounds(295,550,150,45);
        semestercb.setFont(f);
        c.add(semestercb);
        
        gpa=new JLabel("Semister Gpa :");
        gpa.setBounds(70,600,220,50);
        gpa.setFont(f);
        
        c.add(gpa);
        
        gpatf=new JTextField();
        gpatf.setBounds(295,600,150,45);
        gpatf.setFont(f);
        c.add(gpatf);
        
        addbtn=new JButton("Add");
        addbtn.setBounds(1100,640,120,50);
         addbtn.setFont(f);
        c.add(addbtn);
        
       
          gp= gpatf.getText();
        
        JFrame frame=new JFrame();
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200,50,800,650);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setTitle("Home ");
        frame.setVisible(true);
        frame.add(c);
        
        addbtn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
            
             if(e.getSource()==addbtn){
                
                  String gp=gpatf.getText();
                
                resultshow(gp); 
                chartPanel.setVisible(true);
                }
                
        
                
            }
            
        });
        
    }
    
   //  int tf=Integer.parseInt(se);
    // double value = Double.parseDouble(gp);
    
    
     private XYDataset createDataset() {

        XYSeries series = new XYSeries("Saifur Rahman");
       /* if(tf==1)
        {
          series.add(tf,value);
        }
        else if(tf==2)
        {
         series.add(tf, value);   
        }
        else if(tf==3)
        {
         series.add(tf, value);   
        }
        else if(tf==4)
        {
         series.add(tf, value);   
        }
       */
      
      
        series.add(1, 3.40);
        series.add(2, 3.52);
        series.add(3, 3.90);
        series.add(4, 3.50);
        series.add(5, 3.89);
        series.add(6, 4.00);
        series.add(7, 3.98);
        series.add(8, 4.00);  
      

        XYSeriesCollection dataset = new XYSeriesCollection();
        dataset.addSeries(series);

        return dataset;
    }

    private JFreeChart createChart(XYDataset dataset) {

        JFreeChart chart = ChartFactory.createXYLineChart(
                "Result sheet", 
                "Semester", 
                "GPA", 
                dataset, 
                PlotOrientation.VERTICAL,
                true, 
                true, 
                false 
        );

        XYPlot plot = chart.getXYPlot();

        XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer();
        renderer.setSeriesPaint(0, Color.RED);
        renderer.setSeriesStroke(0, new BasicStroke(2.0f));

        plot.setRenderer(renderer);
        plot.setBackgroundPaint(Color.white);

        plot.setRangeGridlinesVisible(true);
        plot.setRangeGridlinePaint(Color.BLACK);

        plot.setDomainGridlinesVisible(true);
        plot.setDomainGridlinePaint(Color.BLACK);

        chart.getLegend().setFrame(BlockBorder.NONE);

        chart.setTitle(new TextTitle("Result Sheet",
                        new Font("Serif", java.awt.Font.BOLD, 18)
                )
        );

        return chart;

    }
     public void resultshow(String gp)
        {
        //File folder=new File("C:/Users/ASUS/Desktop/ResultSheet");
       // folder.mkdir();
       // String path=folder.getAbsolutePath();
        //File result=new File(path+"/result.txt");
        try{
           // result.createNewFile();
            FileWriter fn=new FileWriter("result.txt",true);
           
            fn.write(gp+" "+"");
            fn.write(System.getProperty("line.separator"));
            
            fn.close();   
            
        }
        catch(Exception e)
        {
          e.printStackTrace();
        }
            System.out.println("success");  
    }  
    
    
    
    public static void main(String[] args) {
        GraphDemo graph=new GraphDemo();
    }
}

