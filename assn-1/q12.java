import java.lang.Math;
import java.util.*;

public class q12{
    static class shape{
        String name;
        String getname()
        {
            return this.name;
        }
    }
    static class circle extends shape{
        double radius;
        circle(){
            Scanner sc=new Scanner(System.in);
            System.out.print("Radius :");
            this.radius = sc.nextDouble();
        }
        void calculate()
        {
            double area=Math.PI*radius*radius;
            System.out.println("Area of circle :" + area);
        }
    }
    static class cylinder extends circle{
        double height;
        cylinder(){
            Scanner sc=new Scanner(System.in);
            System.out.print("Height :");
            this.height = sc.nextDouble();
        }

        void calculate(){
            super.calculate();
            double area=2*Math.PI*radius*height + 2*Math.PI*radius*radius;
            System.out.println("Area of Cylinder :" + area);
        }
    }

    public static void main(String args[])
    {
        cylinder cshape=new cylinder();
        cshape.calculate();
    }
}