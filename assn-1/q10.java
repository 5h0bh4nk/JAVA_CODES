import java.util.*;

public class q10 {

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("No. of elements :");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Array :");
        rotate.store_val(a,n);
        System.out.println("k:");
        int k=sc.nextInt();

        int sum=0;
        boolean f=false;
        for(int i=0 ;i<n ;i++)
            sum+=a[i];
        
        for(int i=0 ;i<n ;i++)
        if((sum-a[i])%k==0)
        {
            f=true;
            System.out.print("index is : "+(i));
            break;
        }
        if(!f)
        System.out.println("Sum cannot never be a multiple of k");
    }
}
