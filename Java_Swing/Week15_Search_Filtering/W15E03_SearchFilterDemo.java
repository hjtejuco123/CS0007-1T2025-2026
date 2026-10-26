import javax.swing.*; import javax.swing.table.*; import java.awt.*; import java.util.regex.Pattern;
public class W15E03_SearchFilterDemo {
 public static void main(String[] args){SwingUtilities.invokeLater(()->{JFrame f=new JFrame("Search Filter 3");f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);f.setSize(650,360);DefaultTableModel m=new DefaultTableModel(new Object[][]{{1,"Ana","BSIT"},{2,"Ben","BSCS"},{3,"Cara","BSIT"},{4,"Dino","BSIS"}},new String[]{"ID","Name","Course"});JTable t=new JTable(m);TableRowSorter<DefaultTableModel> sorter=new TableRowSorter<>(m);t.setRowSorter(sorter);JTextField q=new JTextField(18);JButton b=new JButton("Filter");
 b.addActionListener(e->{String s=q.getText();sorter.setRowFilter(s.isBlank()?null:RowFilter.regexFilter("(?i)"+Pattern.quote(s)));});JPanel p=new JPanel();p.add(new JLabel("Keyword"));p.add(q);p.add(b);f.add(p,BorderLayout.NORTH);f.add(new JScrollPane(t),BorderLayout.CENTER);f.setLocationRelativeTo(null);f.setVisible(true);});}
}
