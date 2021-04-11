import java.awt.*;
import java.awt.event.*;

public class registration implements ActionListener{
    Frame f;
    TextField username,pass,cpass,email;
    Label regL;
    TextArea info;
    registration(){
        f = new Frame("RegisterForm");
        Label userL = new Label("UserName     ");
        Label passL = new Label("Password    ");
        Label cpassL = new Label("Confirm Password");
        Label emailL = new Label("Email     ");
        Label branchL = new Label("Branch     ");
        Label infoL = new Label("Info     ");
        regL = new Label(" ");

        username = new TextField(10);
        pass = new TextField(10);
        cpass = new TextField(10);
        email = new TextField(10);

        Choice branch = new Choice();
        branch.addItem("CSE");
        branch.addItem("ECE");
        branch.addItem("EEE");
        info = new TextArea();

        f.setLayout(null);

        userL.setBounds(40,50,120,30);
        passL.setBounds(40,100,120,30);
        cpassL.setBounds(40,150,120,30);
        emailL.setBounds(40,200,120,30);
        branchL.setBounds(40,250,120,30);
        infoL.setBounds(40,300,120,30);

        username.setBounds(190,50,150,30);
        pass.setBounds(190,100,150,30);
        cpass.setBounds(190,150,150,30);
        email.setBounds(190,200,150,30);
        branch.setBounds(190,250,150,30);
        info.setBounds(190,300,150,100);


        f.add(userL);f.add(username);
        f.add(passL);f.add(pass);
        f.add(cpassL);f.add(cpass);
        f.add(emailL);f.add(email);
        f.add(branchL);f.add(branch);
        f.add(infoL);f.add(info);

        Button reg = new Button("Register");
        reg.setBounds(170,450,100,40);
        reg.addActionListener(this);
        f.add(reg);

        regL.setBounds(140,500,200,30);
        f.add(regL);

        f.setSize(500,600);
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
    {
        String s=e.getActionCommand();
        if(s=="Register")
        {
            if(cpass.getText().equals(pass.getText()))
            {
                regL.setText("Registered Succesfully !!!!");
                username.setText("");
                pass.setText("");
                cpass.setText("");
                email.setText("");
                info.setText("");
            }
            else{
                regL.setText("Passwords Don't Match !!!!!");
                pass.setText("");
                cpass.setText("");
            }
        }
    }

    public static void main(String args[])
    {
        registration reg = new registration();
    }
}
