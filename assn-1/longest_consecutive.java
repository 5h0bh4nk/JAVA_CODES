import rotate.*;
import java.util.*;
public class longest_consecutive {
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("No. of elements :");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.print("Array :");
        rotate.store_val(a,n);
        int currcount=1,maxcount=0,p=0,q=0,mp=0,mq=0;
        for(int i=1 ; i<n ;i++)
        {
            if(a[i]>=a[i-1])
            currcount++;

            else{
                currcount=1;
                p=i;
            }
            if(maxcount<currcount)
            {
                mp=p;
                mq=i;
                maxcount=currcount;
            }
        }

        System.out.print("Longest consecutive sequence : ");
        for(int i=mp;i<=mq;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
