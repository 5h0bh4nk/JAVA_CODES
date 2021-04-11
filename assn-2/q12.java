import java.util.Scanner;

public class q12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=null;
        //Invoking a method from a null object.
        try{
            System.out.println(s.length());
        }
        catch (NullPointerException e)
        {
            System.out.println(e);
        }
        //Accessing or modifying a null object’s field
        try{
            char c=s.charAt(3);
        }
        catch (NullPointerException e)
        {
            System.out.println(e);
        }
        //Accessing or modifying the slots of null object, as if it were an array.
        try{
            int x[]=null;
            x[2]=7;
        }

        catch (NullPointerException e)
        {
            System.out.println(e);
        }
        //comparison between a String variable and a literal.
        try{
            System.out.println(s.equals("Test"));
        }
        catch (NullPointerException e)
        { 
            System.out.println(e);
        }
    }
}