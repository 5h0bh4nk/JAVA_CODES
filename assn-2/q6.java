public class q6 {
    static class Shape{
        void printS(){
            System.out.println("This is a shape !");
        }
    }

    static class Rectangle extends Shape{
        void printR(){
            System.out.println("This is rectangular shape");
        }
    }

    static class Circle extends Shape{
        void printC(){
            System.out.println("This is circular shape");
        }
    }

    static class Square extends Rectangle{
        void print(){
            System.out.println("Square is a rectangle");
        }
    }

    public static void main(String args[])
    {
        Square sq= new Square();
        sq.printR();
        sq.printS();
    }
}
