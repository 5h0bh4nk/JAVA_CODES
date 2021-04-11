import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class banner implements Runnable,ActionListener {
   String str = "Click on any emoji to view its info        ";
   Thread t ;
   Label l;
   JFrame f;

   boolean b;
   
   public banner(){
      f = new JFrame("Emojis");
      Font myFont = new Font("Segoe UI", Font.BOLD , 20);

      JButton bt1 = new JButton("",new ImageIcon("nerd.png"));
      JButton bt2 = new JButton("",new ImageIcon("lol.png"));
      JButton bt3 = new JButton("",new ImageIcon("wynk.png"));
      JButton bt4 = new JButton("",new ImageIcon("blessed.png"));

      bt1.setPreferredSize(new Dimension(200,200));
      bt1.addActionListener(new ActionListener(){
         public void actionPerformed(ActionEvent e){
            l.setForeground(Color.BLUE);
            str = "I am a nerd !! I like to study !!     ";
         }
      });
      bt2.setPreferredSize(new Dimension(200,200));
      bt2.addActionListener(new ActionListener(){
         public void actionPerformed(ActionEvent e){
            l.setForeground(Color.ORANGE);
            str = "I am fun !! I always laugh !!      ";
         }
      });
      bt3.setPreferredSize(new Dimension(200,200));
      bt3.addActionListener(new ActionListener(){
         public void actionPerformed(ActionEvent e){
            l.setForeground(Color.GREEN);
            str = "I am cool !! How you doin ??     ";
         }
      });
      bt4.setPreferredSize(new Dimension(200,200));
      bt4.addActionListener(new ActionListener(){
         public void actionPerformed(ActionEvent e){
            l.setForeground(Color.MAGENTA);
            str = "I am blessed !! Hope your day goes well !!      ";
         }
      });

      l = new Label(str);
      l.setForeground(Color.RED);
      l.setFont(myFont);

      f.add(bt1);
      f.add(bt2);
      f.add(bt3);
      f.add(bt4);

      f.add(l);

      f.setLayout(new FlowLayout());
      f.setSize(500, 600);
      f.setVisible(true);
      
      Thread t = new Thread(this);
      t.start();
   }

   public void actionPerformed(ActionEvent e)
   {
      //
   }

   public void run () {
      char ch;
      for( ; ; ) {
      try {
            Thread.sleep(250);
            l.setText(str);
            ch = str.charAt(0);
            str = str.substring(1, str.length());
            str = str + ch;
         }
         catch(InterruptedException e) {}
      }
   }

   public static void main(String args[])
   {
      new banner();
   }
}