import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.*; 

class MoreThanException extends Exception{
    MoreThanException(String msg)
    {
        super(msg);
    }
}

public class fileraedersandwriters {
    public static void main(String args[])
    {
        //file input stream
        try{
            FileInputStream fis=new FileInputStream("demo.txt");
            BufferedInputStream bin=new BufferedInputStream(fis);    
            int s=0;
            while((s=bin.read())!=-1)
            System.out.print((char)s);
            fis.close();
            bin.close();
        }
        catch(FileNotFoundException e)
        {
            System.out.println(e.getMessage());
        }
        catch(IOException e)
        {
            System.out.println(e.getMessage());
        }

        //file output stream
        try{
            FileOutputStream fos=new FileOutputStream("demo.txt",true);
            BufferedOutputStream bot=new BufferedOutputStream(fos);
            String my="My name is Shubhank";
            byte b[]=my.getBytes();
            bot.write(b);
            bot.close();
            fos.close();
        }
        catch(Exception e)
        {
            e.getMessage();
        }

        //file reader
        try{
            FileWriter fw=new FileWriter("demo.txt",true);
            fw.write("\nWelcome Shubhank");
            fw.flush();
            fw.close();
        }
        catch(Exception e){
            e.getStackTrace();
        }

        //file writer
        try{
            FileReader fr=new FileReader("demo.txt");
            BufferedReader br=new BufferedReader(fr);    
            char a[]=new char[100];
            br.read(a);
            for(char c:a)
            System.out.print(c);
            br.close();
            fr.close();
        }
        catch(Exception e){
            e.getStackTrace();
        }

    }
}
