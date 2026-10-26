import javax.swing.*; import java.awt.*;
public class W17E02_SwingWorkerDemo {
 public static void main(String[] args){SwingUtilities.invokeLater(()->{JFrame f=new JFrame("SwingWorker 2");f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);f.setSize(460,230);JProgressBar bar=new JProgressBar(0,100);bar.setStringPainted(true);JButton start=new JButton("Start Background Task");
 start.addActionListener(e->{start.setEnabled(false);SwingWorker<Void,Void> w=new SwingWorker<>(){protected Void doInBackground() throws Exception{for(int x=0;x<=100;x++){setProgress(x);Thread.sleep(30);}return null;}protected void done(){start.setEnabled(true);}};w.addPropertyChangeListener(ev->{if("progress".equals(ev.getPropertyName()))bar.setValue((Integer)ev.getNewValue());});w.execute();});f.add(bar,BorderLayout.CENTER);f.add(start,BorderLayout.SOUTH);f.setLocationRelativeTo(null);f.setVisible(true);});}
}
