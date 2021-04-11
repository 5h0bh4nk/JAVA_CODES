import java.util.Scanner;

public class q5 {
    static class Rectangle{
        int length,breadth;
        Rectangle(int l,int b){
            length=l;
            breadth=b;
        }

        void area(){
            int area=(length*breadth);
            System.out.println("The area of shape is : "+area);
        }

    }

    static class Square extends Rectangle{
        int side;
        Square(int s){
            super(s,s);
            side=s;
        }
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Square[] sq = new Square[10];

        for(int i=0 ; i<10 ; i++)
        {
            System.out.println("-----------------------------");
            System.out.print("Enter side length : ");
            sq[i]=new Square(sc.nextInt());
            sq[i].area();
        }
    }
}
