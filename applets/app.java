import java.applet.*;
import java.awt.*;
public class app extends Applet{
		String str;
			public void init(){
						str = "This is my first applet";
							}
				public void paint(Graphics g){
							g.drawString(str, 50,50);
								}
}
