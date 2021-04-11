import java.awt.*;  
import java.awt.event.*;


public class mousevents extends Frame implements MouseListener{
    
    Label disp;  
    mousevents(){  
        addMouseListener(this);  
        disp=new Label(); 
        disp.setBounds(50,50,300,20);
        disp.setFont(new Font("Arial",Font.BOLD,20));
        add(disp);  
        setSize(300,300);  
        setLayout(null);  
        setVisible(true);  
    }  
    public void mouseClicked(MouseEvent e) {  
        disp.setText("Mouse was clicked !!");  
    }  
    public void mouseEntered(MouseEvent e) {  
        disp.setText("Mouse Entered the frame!!");  
    }  
    public void mouseExited(MouseEvent e) {  
        disp.setText("Mouse Exited the frame!");  
    }  
    public void mousePressed(MouseEvent e) {  
        disp.setText("Mouse is Pressed on frame !!");  
    }  
    public void mouseReleased(MouseEvent e) {  
        disp.setText("Mouse Released now !!");  
    }  

    public static void main(String args[])
    {
        new mousevents();
    }
}
