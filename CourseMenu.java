
package projectsms;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import static java.awt.SystemColor.menu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class  CourseMenu extends JFrame{
       Container c;
       JMenuBar mb;
        JMenu  menu;
       JMenuItem newitem,openitem;
       JButton home,back;
     JFrame frame;
     String filename1;
     JFileChooser jc;
     JTable table;
    DefaultTableModel model;
    JScrollPane scroll;
    String[] coloum = {"Name","Roll No","Class held","Class present","Percentage"};
    
     
       
    CourseMenu(){
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(new java.awt.Color(0, 230, 230));
         
        mb=new JMenuBar();
        mb.setBounds(0, 0,1600,50);
        mb.getMaximumSize();
        
        
        menu=new JMenu("File"); 
        menu.setPreferredSize(new Dimension(105,50));
            
        newitem = new JMenuItem("New"); 
        newitem.setPreferredSize(new Dimension(100,50));
        openitem=new JMenuItem("Open"); 
        openitem.setPreferredSize(new Dimension(100,50));
            
            
        menu.add(newitem); menu.add(openitem);  
        mb.add(menu);
        c.add(mb);
        
        
         Font hf=new Font("Arial",Font.BOLD,16);
        table = new JTable();
        
        model = new DefaultTableModel();
        
        
        
        jc = new JFileChooser(".");
        
         home=new JButton("Home");
        home.setBounds(500,600,150,50);
        home.setFont(hf);
        home.setBackground(Color.BLACK);
        home.setForeground(Color.WHITE);
        c.add(home);
        back=new JButton("Back");
        back.setBounds(700,600,150,50);
        back.setFont(hf);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        c.add(back);
        
        
        frame=new JFrame();
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200,50,800,650);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setTitle("Menu");
        frame.setVisible(true);
        frame.add(c);
        
        
        
        openitem.addActionListener(new ActionListener(){
        
  
        @Override
        public void actionPerformed(ActionEvent e){
                
                model.setColumnIdentifiers(coloum);
                table.setModel(model);
                table.setFont(hf);
                table.setSelectionBackground(Color.BLACK);
                table.setBackground(Color.WHITE);
                table.setRowHeight(30);
        
                scroll = new JScrollPane(table);
                scroll.setBounds(10,60,1300,500);
                c.add(scroll);
  
                int option = jc.showOpenDialog(CourseMenu.this);
                if (option == JFileChooser.APPROVE_OPTION){
                    
                    File sf = jc.getSelectedFile();
                    filename1 =sf.getPath();
                    sf  = new File(filename1);
                    try{
                        FileReader  fr = new FileReader(sf);
                         BufferedReader br = new BufferedReader(fr); 
                         
                         Object[] lines = br.lines().toArray();
                        for(int i=0;i<lines.length;i++)
                        {
                            String[] row = lines[i].toString().split("#");
                             model.addRow(row);
                                
                         }
                    }
                    catch(Exception ae){
                       ae.printStackTrace();
                    }
                    
                }
                
        }
        
        });
        
       home.addActionListener(new ActionListener(){
        
  
        @Override
        public void actionPerformed(ActionEvent e){
            
  
                frame.dispose();
                Home hm = new Home();           
        }
        
        });
           
        
        
    }
    
    
    public static void main(String[] args) {
        CourseMenu cm = new CourseMenu();
    }
    
    
    
    
}
