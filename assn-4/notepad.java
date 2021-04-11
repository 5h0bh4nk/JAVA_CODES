import java.awt.*;

public class notepad {
    notepad(){
        Frame f = new Frame();
        f.setSize(1000,500);
        Font myFont = new Font("Segoe UI", Font.BOLD,17);
        MenuBar mb=new MenuBar();  

        Menu file=new Menu("File"); 
        MenuItem nw=new MenuItem("New");  
        MenuItem op=new MenuItem("Open");  
        MenuItem sv=new MenuItem("Save");  
        MenuItem dl=new MenuItem("Delete");  
        file.add(nw);
        file.add(sv);  
        file.add(sv);  
        file.add(dl);
        mb.add(file);

        Menu edit = new Menu("Edit");
        MenuItem ct = new MenuItem("Cut");
        MenuItem cp = new MenuItem("Copy");
        MenuItem ps = new MenuItem("Paste");
        MenuItem cc = new MenuItem("Convert Case");
        MenuItem ud = new MenuItem("Undo");
        edit.add(ct);
        edit.add(cp);
        edit.add(ps);
        edit.add(cc);
        edit.add(ud);
        mb.add(edit);

        Menu set = new Menu("Settings");
        MenuItem imp = new MenuItem("Import");
        MenuItem chb = new MenuItem("Change Bg");
        MenuItem cht = new MenuItem("Change Theme");
        set.add(imp);
        set.add(chb);
        set.add(cht);
        mb.add(set);

        Menu lang = new Menu("Languages");
        Menu clang = new Menu("C language");
        MenuItem c = new MenuItem("C");
        MenuItem cppa = new MenuItem("C++ 14");
        MenuItem cppb = new MenuItem("C++ 17");
        MenuItem jav = new MenuItem("Java");
        MenuItem pyt = new MenuItem("Python");
        MenuItem rub = new MenuItem("Ruby");
        MenuItem js = new MenuItem("JavaScript");
        MenuItem php = new MenuItem("PHP");
        MenuItem go = new MenuItem("GoLang");
        clang.add(c);clang.add(cppa);clang.add(cppb);
        lang.add(clang);
        lang.add(jav);
        lang.add(pyt);
        lang.add(rub);
        lang.add(js);
        lang.add(php);
        lang.add(go);
        mb.add(lang);

        mb.setFont(myFont);
        
        f.setMenuBar(mb);
        f.setSize(400,400);  
        f.setLayout(null);  
        f.setVisible(true);
    }

    public static void main(String args[])
    {
        notepad n = new notepad();
    }
}
