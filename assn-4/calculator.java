import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class calculator implements ActionListener{
    Frame f;
    Panel p;
    Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,bx,bd,ba,bs,bm,be,br,bsq,bi;
    TextField calc;
    GridLayout g;
    int opd1,opd2,result;
    char op;

    calculator(){
        f=new Frame("MyCalci");
        f.setLayout(new FlowLayout());
        calc = new TextField(15);
        // calc.setBounds(50,50,100,50);

        b0 = new Button("0");
        b0.addActionListener(this);
        b1 = new Button("1");
        b1.addActionListener(this);
        b2 = new Button("2");
        b2.addActionListener(this);
        b3 = new Button("3");
        b3.addActionListener(this);
        b4 = new Button("4");
        b4.addActionListener(this);
        b5 = new Button("5");
        b5.addActionListener(this);
        b6 = new Button("6");
        b6.addActionListener(this);
        b7 = new Button("7");
        b7.addActionListener(this);
        b8 = new Button("8");
        b8.addActionListener(this);
        b9 = new Button("9");
        b9.addActionListener(this);
        ba = new Button("+");
        ba.addActionListener(this);
        bs = new Button("-");
        bs.addActionListener(this);
        bx = new Button("*");
        bx.addActionListener(this);
        bd = new Button("/");
        bd.addActionListener(this);
        bm = new Button("%");
        bm.addActionListener(this);
        be = new Button("=");
        be.addActionListener(this);
        br = new Button("C");
        br.addActionListener(this);
        bsq = new Button("x^2");
        bsq.addActionListener(this);
        bi = new Button("1/x");
        bi.addActionListener(this);

        p = new Panel();
        g = new GridLayout(5,4);
        p.setLayout(g);
        // p.setBounds(50,100,300,300);
        f.add(calc);p.add(b1);p.add(b2);p.add(b3);p.add(ba);
        p.add(b4);p.add(b5);p.add(b6);p.add(bs);
        p.add(b7);p.add(b8);p.add(b9);p.add(bx);
        p.add(bd);p.add(b0);p.add(bm);p.add(br);
        p.add(bsq);p.add(bi);p.add(be);
        p.setSize(500,500);

        f.add(p);
        f.setSize(500,500);
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String s=e.getActionCommand();
        char ch = s.charAt(0);

        if(Character.isDigit(ch))
            calc.setText(calc.getText()+s);

        else if(ch=='+' || ch=='-' || ch=='/' || ch=='*' || ch=='%')
        {
            opd1 = Integer.parseInt(calc.getText());
            op = ch;
            calc.setText("");
        }
        else if(ch=='C')
        {
            calc.setText("");
            opd1=0;
            opd2=0;
            op = 'c';
        }
        else if(s=="x^2")
        {
            calc.setText(""+opd1*opd1);
        }
        else if(s=="x^2")
        {
            calc.setText(""+getvalue(opd1, opd1, '*'));
        }
        else if(ch=='=')
        {
            opd2 = Integer.parseInt(calc.getText());
            result = getvalue(opd1,opd2,op);
            calc.setText(""+result);
        }

    }

    int getvalue(int v1,int v2,char op)
    {
        if(op=='+')
        return v1+v2;
        else if(op=='-')
        return v1-v2;
        else if(op=='*')
        return v1*v2;
        else if(op=='/')
        {
            if(v2==0)
            throw new ZeroDivisionException("Denominartor is 0 !! ");
            else
            return v1/v2;
        }
        else if(op=='%')
        {
            if(v2==0)
            throw new ZeroDivisionException("Denominartor is 0 !! ");
            else
            return v1%v2;
        }
        else
        return -1;
    }

    public static void main(String args[]){
        calculator c= new calculator();
    }

    public class ZeroDivisionException extends ArithmeticException {
        ZeroDivisionException(String msg)
        {
            super(msg);
        }
    }
}