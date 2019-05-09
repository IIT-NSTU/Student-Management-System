
package Demo;


import javax.swing.JButton;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel; 
import org.jfree.chart.JFreeChart; 
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset; 
import org.jfree.data.category.DefaultCategoryDataset; 
import org.jfree.ui.ApplicationFrame; 
import org.jfree.ui.RefineryUtilities; 

public class BarChart_AWT extends ApplicationFrame {
   
   
   public BarChart_AWT( String applicationTitle , String chartTitle ) {
      super( applicationTitle );
      
      JFreeChart barChart = ChartFactory.createBarChart(
         chartTitle,           
         "Category",            
         "GPA",            
         createDataset(),          
         PlotOrientation.VERTICAL,           
         true, true, false);
         
      ChartPanel chartPanel = new ChartPanel( barChart );        
      chartPanel.setPreferredSize(new java.awt.Dimension( 400 , 300 ) );        
      setContentPane( chartPanel ); 
   }
   
   private CategoryDataset createDataset( ) {
      final String fiat = "1st";        
      final String audi = "2nd";        
      final String ford = "3rd";
      final String marcity = "4rd";
      final String nissan = "5rd";
      final String first = "1st Semister";        
      final String second = "2nd Semister";        
      final String third = "3rd Semister";        
      final String fourth = "4th Semister"; 
      final String safe = "5th Semister"; 
      final DefaultCategoryDataset dataset = 
      new DefaultCategoryDataset( );  

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
   
   public static void main( String[ ] args ) {
     //  JButton btn =new JButton("show");
     //  btn.setBounds(0,0,100,50);
       
      BarChart_AWT chart = new BarChart_AWT("Result sheet", 
         "");
      chart.setBounds(100,85,500,500);
     // chart.add(btn);
     // RefineryUtilities.centerFrameOnScreen( chart );        
      chart.setVisible( true ); 
   }
}
