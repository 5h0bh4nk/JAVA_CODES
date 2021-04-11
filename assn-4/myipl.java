import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;

public class myipl extends JFrame{
    
    JPanel p,q;
    BufferedImage bi;
    Font myFont = new Font("Arial", Font.BOLD , 50);
    Font myFontsm = new Font("Arial", Font.BOLD , 20);
    public myipl(){

        try{
            bi=ImageIO.read(new File("iplmain.jpg"));
        }
        catch (IOException ex)
        {
            System.out.println(ex.getMessage());
        }

        JLabel t = new JLabel("TEAMS");
        t.setFont(new Font("Arial",Font.BOLD, 20));t.setPreferredSize(new Dimension(100,40));
        JButton b1 = new JButton("RR");b1.setPreferredSize(new Dimension(100,40));
        JButton b2 = new JButton("KKR");b2.setPreferredSize(new Dimension(100,40));
        JButton b3 = new JButton("MI");b3.setPreferredSize(new Dimension(100,40));
        JButton b4 = new JButton("DD");b4.setPreferredSize(new Dimension(100,40));
        JButton b5 = new JButton("RCB");b5.setPreferredSize(new Dimension(100,40));
        JButton b6 = new JButton("CSK");b6.setPreferredSize(new Dimension(100,40));
        JButton b7 = new JButton("KXIP");b7.setPreferredSize(new Dimension(100,40));
        JButton b8 = new JButton("SH");b8.setPreferredSize(new Dimension(100,40));


        p = new JPanel();
        p.add(t);
        b1.setBackground(Color.GREEN);p.add(b1);
        b2.setBackground(Color.CYAN);p.add(b2);
        b3.setBackground(Color.GREEN);p.add(b3);
        b4.setBackground(Color.CYAN);p.add(b4);
        b5.setBackground(Color.GREEN);p.add(b5);
        b6.setBackground(Color.CYAN);p.add(b6);
        b7.setBackground(Color.GREEN);p.add(b7);
        b8.setBackground(Color.CYAN);p.add(b8);
        p.setBounds(50,150,100,500);  

        setLayout(null);
        setBackground(Color.RED);
        add(p);
        setVisible(true);
        setSize(1000,1000);
    }

    public void paint(Graphics g){
        super.paint(g);
        g.setColor(Color.YELLOW);
        g.fillRect(0, 0, 1000, 1000);
        g.drawImage(bi,200,200,600,600,null);
        g.setColor(Color.blue);
        g.setFont(myFont);
        g.drawString("INDIAN PREMIER LEAGUE 2021", 150, 150);
        g.setColor(Color.black);
        g.setFont(myFontsm);
        g.drawString("TEAMS", 70, 220);
        g.setColor(Color.red);
        g.drawString("FIRST SIXER TO BE HIT ON 21-04-21", 330, 850);
        g.drawString("STAY TUNED !!!!", 450, 900);
    }

    public static void main(String args[])
    {
        new myipl();
    }

}