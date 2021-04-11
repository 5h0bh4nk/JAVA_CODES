import java.applet.Applet;
import netscape.javascript.*;
import java.awt.*;
import java.awt.Image;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import javax.swing.*;
import javax.imageio.ImageIO;
import java.io.*;
import java.net.URI;
import java.util.EventListener;


public class ipl extends Applet {
    int fullW = 1900;
    int fullH = 1000;
    int sideW = (int)(fullW*0.12);
    int navH = (int)(fullH*0.05);
    int offset1 = (int)(0.01 * fullW);
    int limgH = (int)(0.5*fullH);
    int limgW = (int)(0.8*fullW);
    int simgH = (int)(0.8*fullH);
    int simgW = (int)(0.9*sideW);

    public void init()
    {
        // Panel p = new Panel(new BorderLayout());
        // MenuBar mb=new MenuBar();  

        // Menu file=new Menu("File"); 
        // MenuItem nw=new MenuItem("New");  
        // MenuItem op=new MenuItem("Open");  
        // MenuItem sv=new MenuItem("Save");  
        // MenuItem dl=new MenuItem("Delete");  
        // file.add(nw);
        // file.add(sv);  
        // file.add(sv);  
        // file.add(dl);
        // mb.add(file);

        // Menu edit = new Menu("Edit");
        // MenuItem ct = new MenuItem("Cut");
        // MenuItem cp = new MenuItem("Copy");
        // MenuItem ps = new MenuItem("Paste");
        // MenuItem cc = new MenuItem("Convert Case");
        // MenuItem ud = new MenuItem("Undo");
        // edit.add(ct);
        // edit.add(cp);
        // edit.add(ps);
        // edit.add(cc);
        // edit.add(ud);
        // mb.add(edit);

        // Menu set = new Menu("Settings");
        // MenuItem imp = new MenuItem("Import");
        // MenuItem chb = new MenuItem("Change Bg");
        // MenuItem cht = new MenuItem("Chaneg Theme");
        // set.add(imp);
        // set.add(chb);
        // set.add(cht);
        // mb.add(set);

        // // setLayout(new BorderLayout());
        // p.setMenuBar(mb);
        // add(p);
        JPanel nb = Navbar();
        JPanel left = LeftSideBar();
        JPanel right = RightSideBar();
        JPanel middle = MiddleContainer();

        add(nb);
        add(left);
        add(middle);
        add(right);

        setLayout(new BorderLayout());
        setSize(fullW, fullH);
        setVisible(true);
    }
    JPanel Navbar()
    {
        JPanel navbar = new JPanel();
        JLabel link1 = new JLabel("Matches");
        JLabel link2 = new JLabel("Videos");
        JLabel link3 = new JLabel("Points");
        JLabel link4 = new JLabel("Stats");
        JLabel link5 = new JLabel("Teams");
        link1.setBounds(0, 0, 100, 20);
        link2.setBounds(100, 0, 200, 20);
        link3.setBounds(200, 0, 300, 20);
        link4.setBounds(300, 0, 400, 20);
        link5.setBounds(400, 0, 500, 20);
        navbar.add(link1);navbar.add(link2);navbar.add(link3);navbar.add(link4);navbar.add(link5);
        navbar.setLayout(null);
        navbar.setBounds(0, 0, fullW, navH);
        navbar.setBackground(Color.GRAY);
        return navbar;
    }
    JPanel LeftSideBar()
    {
        JPanel sidebox = new JPanel();
        BufferedImage img = null;
        try {img = ImageIO.read(new File("ipl2.png"));} 
        catch (IOException e) { e.printStackTrace(); }
        Image dimg = img.getScaledInstance(simgW, simgH, Image.SCALE_SMOOTH);
        JLabel iplimg = new JLabel(new ImageIcon(dimg));
        iplimg.setBounds(0, 10*navH, simgW, simgH);
        sidebox.add(iplimg);

        sidebox.setBounds(0, navH, sideW, fullH-navH);
        sidebox.setBackground(Color.PINK);
        return sidebox;
    }
    JPanel RightSideBar()
    {
        JPanel sidebox = new JPanel();
        BufferedImage img = null;
        try {img = ImageIO.read(new File("ipl1.png"));} 
        catch (IOException e) { e.printStackTrace(); }
        Image dimg = img.getScaledInstance(simgW, simgH, Image.SCALE_SMOOTH);
        JLabel iplimg = new JLabel(new ImageIcon(dimg));
        iplimg.setBounds(0, 10*navH, simgW, simgH);

        sidebox.add(iplimg);
        sidebox.setBounds(fullW-sideW-offset1, navH, sideW, fullH-navH);
        sidebox.setBackground(Color.PINK);
        return sidebox;
    }
    JPanel MiddleContainer()
    {
        JPanel container = new JPanel();
        JLabel IPLHeading = new JLabel("Indian Premier Leaguge 2021");
        IPLHeading.setBounds((int)(1.8*sideW), 0, fullW - 2*sideW - offset1, navH);
        IPLHeading.setFont(new Font("Serif", Font.BOLD, 50));
        IPLHeading.setForeground(Color.BLUE);
 
        BufferedImage img = null;
        try {img = ImageIO.read(new File("iplMain.png"));} 
        catch (IOException e) { e.printStackTrace(); }
        Image dimg = img.getScaledInstance(limgW, limgH, Image.SCALE_SMOOTH);
        JLabel iplimg = new JLabel(new ImageIcon(dimg));
        iplimg.setBounds(0, 1*navH, fullW - 2*sideW - offset1, limgH);

        JLabel info1 = new JLabel("Chennai Super Kings Vs Delhi Capitals => 21/04/21");
        info1.setFont(new Font("Serif", Font.BOLD, 20));
        info1.setForeground(Color.BLUE);
        info1.setBounds(2*sideW, 2*navH+limgH, 500, 20);

        JLabel info2 = new JLabel("Delhi Capitals Vs Kolkata Knight Riders => 22/04/21");
        info2.setFont(new Font("Serif", Font.BOLD, 20));
        info2.setForeground(Color.BLUE);
        info2.setBounds(2*sideW, 2*navH+limgH+30, 500, 20);

        JLabel info3 = new JLabel("Chennai Super Kings Vs Delhi Capitals => 21/04/21");
        info3.setFont(new Font("Serif", Font.BOLD, 20));
        info3.setForeground(Color.BLUE);
        info3.setBounds(2*sideW, 2*navH+limgH+60, 500, 20);

        JLabel info4 = new JLabel("Delhi Capitals Vs Kolkata Knight Riders => 22/04/21");
        info4.setFont(new Font("Serif", Font.BOLD, 20));
        info4.setForeground(Color.BLUE);
        info4.setBounds(2*sideW, 2*navH+limgH+90, 500, 20);

        JLabel info5 = new JLabel("Chennai Super Kings Vs Delhi Capitals => 21/04/21");
        info5.setFont(new Font("Serif", Font.BOLD, 20));
        info5.setForeground(Color.BLUE);
        info5.setBounds(2*sideW, 2*navH+limgH+120, 500, 20);
        
        container.add(info1);
        container.add(info2);
        container.add(info3);
        container.add(info4);
        container.add(info5);
        container.add(iplimg);
        container.add(IPLHeading);
        container.setLayout(null);

        container.setBounds(sideW, navH, fullW - 2*sideW - offset1, fullH-navH);
        container.setBackground(Color.GREEN);
        return container;
    }
}