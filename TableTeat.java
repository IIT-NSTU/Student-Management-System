
package project;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.util.Vector;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

public class TableTeat extends JFrame{
  public JScrollPane scroll;
  public static void main(String[] args) {
    new TableTeat();
  }

  public TableTeat() {
    startUI();
  }

  public void startUI() {
    EventQueue.invokeLater(new Runnable() {
      @Override
      public void run() {
        try {
          UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
          ex.printStackTrace();
        }
     
        
        MyTableModel model = new MyTableModel();
        model.addRow(new Object[]{"ASH1825001M", "Abdulla Al Noor", false});
        model.addRow(new Object[]{"ASH1825002M", "Imran Hossien", false});
        model.addRow(new Object[]{"ASH1825003M", "Mahabub Alam", false});
        model.addRow(new Object[]{"ASH1825004M", "Fazle Rabbi", false});
        model.addRow(new Object[]{"ASH1825005M", "Asif ", false});
        model.addRow(new Object[]{"ASH1825006M", "Tamanna", false});
        model.addRow(new Object[]{"ASH1825007M", "Mynuddin", false});
        model.addRow(new Object[]{"ASH1825008M", "Suvra", false});
        model.addRow(new Object[]{"ASH1825009M", "Abdulla Al Noor", false});
        model.addRow(new Object[]{"ASH1825010M", "Imran Hossien", false});
        model.addRow(new Object[]{"ASH1825002M", "Mahabub Alam", false});
        model.addRow(new Object[]{"ASH1825003M", "Fazle Rabbi", false});
        model.addRow(new Object[]{"ASH1825001M", "Asif ", false});
        model.addRow(new Object[]{"ASH1825002M", "Tamanna", false});
        model.addRow(new Object[]{"ASH1825002M", "Mynuddin", false});
        model.addRow(new Object[]{"ASH1825003M", "Suvra", false});
        model.addRow(new Object[]{"ASH1825001M", "Abdulla Al Noor", false});
        model.addRow(new Object[]{"ASH1825002M", "Imran Hossien", false});
        model.addRow(new Object[]{"ASH1825003M", "Mahabub Alam", false});
        model.addRow(new Object[]{"ASH1825004M", "Fazle Rabbi", false});
        model.addRow(new Object[]{"ASH1825005M", "Asif ", false});
        model.addRow(new Object[]{"ASH1825006M", "Tamanna", false});
        model.addRow(new Object[]{"ASH1825007M", "Mynuddin", false});
        model.addRow(new Object[]{"ASH1825008M", "Suvra", false});
        model.addRow(new Object[]{"ASH1825009M", "Abdulla Al Noor", false});
        model.addRow(new Object[]{"ASH1825010M", "Imran Hossien", false});
        model.addRow(new Object[]{"ASH1825002M", "Mahabub Alam", false});
        model.addRow(new Object[]{"ASH1825003M", "Fazle Rabbi", false});
        model.addRow(new Object[]{"ASH1825001M", "Asif ", false});
        model.addRow(new Object[]{"ASH1825002M", "Tamanna", false});
        model.addRow(new Object[]{"ASH1825002M", "Mynuddin", false});
        model.addRow(new Object[]{"ASH1825003M", "Suvra", false});
        JTable table = new JTable(model);
        table.setRowHeight(40);
       
        
        
       /* TableColumnModel columnModel = table.getColumnModel();
        columnModel.getColumn(0).setPreferredWidth(20);
        columnModel.getColumn(1).setPreferredWidth(100);
        columnModel.getColumn(2).setPreferredWidth(50);
        */
       
       DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);

        table.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
        table.getColumnModel().getColumn(1).setCellRenderer(centerRenderer);
       
        JScrollPane scrollpane = new JScrollPane(table);
        scrollpane.setBounds(5,90,1350,600);
        
       // scroll=new JScrollPane(table);
       // scroll.setBounds(5,90,1350,600);
        
       // JScrollPane scrollpane ;
        JFrame frame = new JFrame("Testing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       // frame.add(new JScrollPane(table));
        frame.add(scrollpane);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        
      }
    });
  }

  public class MyTableModel extends DefaultTableModel {

    public MyTableModel() {
      super(new String[]{"ID", "Name", "Present","Percentage"}, 0);
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
      Class clazz = String.class;
      switch (columnIndex) {
        case 0:
          clazz = Integer.class;
          break;
        case 2:
          clazz = Boolean.class;
          break;
      }
      return clazz;
    }

    @Override
    public boolean isCellEditable(int row, int column) {
      return column == 2;
    }

    @Override
    public void setValueAt(Object aValue, int row, int column) {
      if (aValue instanceof Boolean && column == 2) {
        System.out.println(aValue);
        Vector rowData = (Vector)getDataVector().get(row);
        rowData.set(2, (boolean)aValue);
        fireTableCellUpdated(row, column);
      }
    }

  }

}