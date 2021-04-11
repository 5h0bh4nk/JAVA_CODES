import java.awt.*;

import jdk.internal.org.objectweb.asm.tree.analysis.Frame;
import java.awt.*;
public class awt extends Frame{
    awt(){  
        Button b=new Button("click me");  
        b.setBounds(30,100,80,30);// setting button position  
        add(b);//adding button into frame  
        setSize(300,300);//frame size 300 width and 300 height  
        setLayout(null);//no layout manager  
        setVisible(true);//now frame will be visible, by default 
    }
    public static void main(String args[]){  
        awt f=new awt();  
    }
}
