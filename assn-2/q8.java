import Addition.add;
import Subtract.diff;
import Multiply.mult;
import Divide.div;
import java.util.Scanner;
public class q8 extends div{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 2 numnbers : ");
        int n=sc.nextInt(),m=sc.nextInt();

        System.out.print("\nInstructions :\n-------\nPress 1 to Add\nPress 2 to subtract\nPress 3 to Divide\nPress 4 to Multiply\nEnter choice : ");
        try{
            switch(sc.nextInt())
            {
                case 1:
                {System.out.println("The result is : "+add.add(n,m));break;}
                case 2:
                {System.out.println("The result is : "+diff.diff(n,m));break;}
                case 3:
                {System.out.println("The result is : "+div(n,m));break;}
                case 4:
                {System.out.println("The result is : "+mult.mult(n,m));break;}
                default:
                System.out.println("Wrong choice entered !! Exiting !!");
            }
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());;
        }
    }
}
