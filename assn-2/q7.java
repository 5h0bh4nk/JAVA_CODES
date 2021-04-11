import java.util.Scanner;

public class q7 {
    static int add(int a,int b){
        return a+b;
    }

    static int add(int a[]){
        int sum=0;
        for(int i=0 ;i<a.length ;i++)
        sum+=a[i];

        return sum;
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of elements : ");
        int n=sc.nextInt();
        System.out.print("Enter numbers : ");
        if(n==2)
        {
            int a=sc.nextInt(),b=sc.nextInt();
            System.out.println("The sum using method 1 is "+ add(a,b));
        }
        else{
            int p[]=new int[n];
            for(int i=0 ;i<n ;i++)
            p[i]=sc.nextInt();
            System.out.println("The sum using overloaded method 2 is "+add(p));
        }
    }
    
}
