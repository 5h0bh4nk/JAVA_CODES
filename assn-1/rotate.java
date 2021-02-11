import java.util.*;

public class rotate{
    public static void store_val(int a[],int n)
    {
        Scanner sc=new Scanner(System.in);
        for(int i=0 ;i<n ;i++)
        a[i]=sc.nextInt();
    }

    static void left_rotate(int a[],int n,int d)
    {
        int b[]= new int[n];
        int j=0;
        for(int i=d;i<d+n ;i++)
        {
            b[j++]=a[i%n];
        }
        System.out.println("Left rotate: "+Arrays.toString(b));
    }

    static void right_rotate(int a[],int n,int d)
    {
        int b[]= new int[n];
        int j=0;
        for(int i=n-d;i<2*n-d;i++)
        {
            b[j++]=a[i%n];
        }
        System.out.println("Right rotate: "+Arrays.toString(b));
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("No. of elements :");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Array :");
        store_val(a,n);
        System.out.println("Position :");
        int d=sc.nextInt();
        
        left_rotate(a,n,d);
        right_rotate(a,n,d);
    }
}
