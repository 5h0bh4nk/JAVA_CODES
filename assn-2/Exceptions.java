import java.lang.*;

public class Exceptions{
    public static void main(String args[]) 
    {
        int a=20,b=0;
        System.out.println("Zinda hai hum");

        try{
            System.out.println(a/b);
        }
        catch(ArithmeticException e)
        {
            int c[]=null;
            System.out.println(c);
        }
    }
}