import java.awt.*;
import java.awt.event.*;
import java.io.*;

class biodata implements ActionListener{
    Frame f;
    TextArea ta;
    Label l1,l2;
    Button b;

    public biodata()
    {
        f=new Frame("BIODATA");
        f.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        ta=new TextArea();
        l1=new Label();
        l2=new Label();
        b=new Button("SUBMIT");
        b.addActionListener(this);
        l1.setBounds(50,50,100,30);
        l2.setBounds(160,50,400,30);
        ta.setBounds(50,100,400,300);
        b.setBounds(200,400,100,30);
        f.add(l1);
        f.add(l2);
        f.add(ta);
        f.add(b);
        f.setLayout(null);
        f.setSize(500,450);
        f.setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        String s=ta.getText();
        String words[]=s.split("\\s");
        l1.setText("Words: "+words.length);
        if (words.length<30)
        {
            l2.setText("Minimum number of words should be 30");
            return;
        }
        else
        {
            try (PrintWriter out = new PrintWriter("biodata.txt")) {
                out.println(s);
            }
            catch (Exception ex)
            {
                System.out.println(ex);
            }
            l2.setText("Biodata copied Successfully !!");
        }
    }
    public static void main(String args[])
    {
        new biodata();
    }
}