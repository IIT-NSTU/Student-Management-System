
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;


public class semester2 extends JFrame {
    
    
     private Container c;
     private JLabel l1;
     private Font f;
     private JTable table;
     private JScrollPane scroll;
     private JButton b1,b2;
     
     private String[] cols={"Course title","Course Code"};
     
     private String[][] rows={
                           {"Data Structure","CSE 1201"},
                           {"Data Structure Lab","CSE 1102"},
                           {"Computer Organization","CSE 1203"},
                           {"Computer Organiztion Lab","CSE 1204"},
                           {"Probability and Statistics for Engineers","STAT 1205"},
                           {"Ordinary Differential Equations","MATH 1207"},
                           {"History of Emergence of Bangladesh","GE 1209"},
                           {"Bengali Literature","GE 1211"},
                           {"Object Oriented Concepts","SE 1213"},
                           {"Object Oriented Concepts 1 Lab","SE 1214"},
                           
                           
                           
     };
    semester2()
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
        
        semester2 frame = new semester2();
       // frame.setVisible(true);
    //    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    //   frame.setExtendedState(MAXIMIZED_BOTH);
    }
    
}
