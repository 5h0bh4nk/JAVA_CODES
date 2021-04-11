import java.util.Scanner;

public class q1 {

    public static void store_val(int a[],int n)
    {
        System.out.print("Enter sorted elements :");
        Scanner sc=new Scanner(System.in);
        for(int i=0 ;i<n ;i++)
        a[i]=sc.nextInt();
    }

    public static boolean bin_search(int a[],int k,int l,int r)
    {
        if(l<r)
        {
            int m=(l+r)/2;
            if(a[m]==k)
            return true;

            if(a[m]>k)
            return bin_search(a,k,l,m-1);
            else
            return bin_search(a,k,m+1,r);
        }
        return false;
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Input no. of elements : ");
        int n=sc.nextInt();
        int a[]=new int[n];
        store_val(a, n);

        System.out.print("Enter element to search :");
        int k=sc.nextInt();
        if(bin_search(a,k,0,n-1))
        System.out.println(k + " found in array !");
        else
        System.out.println(k + " not found in array !");
    }
}
