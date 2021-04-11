import java.util.Scanner;

public class q4 {
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
        void perimeter(){
            int peri=2*(length+breadth);
            System.out.println("The perimeter of shape is : "+peri);
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
        System.out.print("Enter length and breadth of rectangle : ");
        int l=sc.nextInt();
        int b=sc.nextInt();
        Rectangle R1= new Rectangle(l, b);
        R1.perimeter();
        R1.area();

        System.out.println("-------------------------------");
        System.out.print("Enter side of square : ");
        int s=sc.nextInt();
        Square S1=new Square(s);
        S1.perimeter();
        S1.area();
    }
}
