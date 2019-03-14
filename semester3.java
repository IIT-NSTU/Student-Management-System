
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;


public class semester3 extends JFrame {
    
     private Container c;
     private JLabel l1;
     private Font f;
     private JTable table;
     private JScrollPane scroll;
     private JButton b1,b2;
     
     private String[] cols={"Course title","Course Code"};
     
     private String[][] rows={
                           {"Algorithm Analysis","CSE 2101"},
                           {"Algorithm Analysis Lab","CSE 2102"},
                           {"Theory of Computation","SE 2103"},
                           {"Theory of Computation  Lab","SE 2104"},
                           {"Computer Networks","CSE 2105"},
                           {"Computer Networks Lab","CSE 2106"},
                           {"Numerical Analysis for Engineers","MATH 2107"},
                           {"Numerical Analysis for Engineers Lab","MATH 2108"},
                           {"Object Oriented Concepts 2","SE 2109"},
                           {"Object Oriented Concepts 2 Lab","SE 2110"},
                           {"Softwarer Project Lab","SE 2112"},
                           
                           
                           
     };
    
    
    semester3()
    {
        components();
    }
    
    public void components()
    {
         c= this.getContentPane();
        c.setLayout(null);
        c.setBackground(new Color(25,45,45));
        
        f = new Font("Candara",Font.BOLD,18);
        
        l1 = new JLabel("Course Details");
        l1.setBounds(250,20,200,50);
        l1.setForeground(Color.WHITE);
        l1.setFont(f);
        c.add(l1);
        
        table = new JTable(rows,cols);
        table.setSelectionBackground(Color.YELLOW);
        table.setFont(f);
        
        scroll = new JScrollPane(table);
        scroll.setBounds(50, 80, 700, 180);
        c.add(scroll);
        
        b1 = new JButton("Home");
        b1.setBounds(50, 400, 100, 50);
        b1.setBackground(new Color(25,45,45));
        b1.setForeground(Color.WHITE);
        b1.setBorderPainted(false);
        b1.setFont(f);
       
        c.add(b1);
        
        b2 = new JButton("Back");
        b2.setBounds(200, 400, 100, 50);
        b2.setBackground(new Color(25,45,45));
        b2.setForeground(Color.WHITE);
        b2.setFont(f);
        b2.setBorderPainted(false);
        c.add(b2);
       setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setExtendedState(MAXIMIZED_BOTH);
    }
    public static void main(String[] args) {
        
        semester3 frame = new semester3();
       // frame.setVisible(true);
    //    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    //   frame.setExtendedState(MAXIMIZED_BOTH);
        
    }
    
}
