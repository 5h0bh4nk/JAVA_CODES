import java.io.FileInputStream;
import java.util.Scanner;
import java.io.*; 

public class q9 {
    public static class MoreThanKException extends Exception{
        MoreThanKException(String msg)
        {
            super(msg);
        }
    }
    
    public static void main(String args[]) throws MoreThanKException
    {  
        //file input stream
        try{
            FileInputStream fis=new FileInputStream("demo.txt");
            BufferedInputStream bin=new BufferedInputStream(fis);  
            Scanner sc=new Scanner(System.in);
            int k=sc.nextInt();
            
            // k ust not be < 100
              if(k<100)
              throw new MoreThanKException("Error !! Value of k must be >= 100");
            int s=0,count=0; 
            while((s=bin.read())!=-1)
            {
                count++;
                //error on exceeding k limit
                if(count>k)
                    throw new MoreThanKException("Error !! Character Limit Exceeded");
            }
            fis.close();
            bin.close();
            System.out.println("No Exceptions occured !!");
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("Program executed Successfully !!");
        }
    }
}
