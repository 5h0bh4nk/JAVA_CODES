import java.util.Random;
import java.util.Scanner;

public class q10 {
    static class RThread extends Thread{
        public void run(){
            Scanner sc= new Scanner(System.in);
            System.out.print("Number od random to be generated :");
            int n = sc.nextInt();
            int a[] = new int[n];
            Random rd = new Random(1000);
            for(int i=0 ;i<n ;i++)
            {
                int ri = rd.nextInt(200);
                System.out.println("Random : "+ri);

                a[i]=ri;

                if(ri%2!=0)
                {
                    CThread cube = new CThread(ri);
                    cube.start();
                }
                else{
                    SThread square = new SThread(ri);
                    square.start();
                }

                try
                {Thread.sleep(2000);}
                catch(InterruptedException e)
                {System.out.println("Random Thread Interrupted !!");}

            }

            SumThread sum = new SumThread(a);
            sum.start();
        }
    }

    static class SThread extends Thread{
        int num;
        SThread(int n)
        {
            num=n;
        }

        public void run(){
            System.out.println("The square of Number is : "+ (num*num));
        }
    }

    static class CThread extends Thread{
        int num;
        CThread(int n)
        {
            num=n;
        }

        public void run(){
            System.out.println("The cube of Number is : "+ (num*num*num));
        }
    }

    static class SumThread extends Thread{
        int sum=0;
        SumThread(int a[])
        {
            for(int i=0 ;i<a.length ;i++)
            sum+=a[i];
        }

        public void run(){
            System.out.println("The Sum of all Random Numbers is : "+sum);
        }
    }

    public static void main(String args[])
    {
        RThread main = new RThread();
        main.start();
    }

}
