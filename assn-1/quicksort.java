import java.util.*;

public class quicksort {

    public static void store_val(int a[],int n)
    {
        System.out.print("Enter elements :");
        Scanner sc=new Scanner(System.in);
        for(int i=0 ;i<n ;i++)
        a[i]=sc.nextInt();
    }

    static void swap(int a[],int i,int j)
    {
        int tmp=a[i];
        a[i]=a[j];
        a[j]=tmp;
    }

    static int partition(int a[],int low,int high)
    {
        int pivot=a[low];
        int i=low;
        for(int j=low+1;j<=high;j++)
        {
            if(a[j]<pivot)
            {
                swap(a,++i,j);
            }
        }
        swap(a,i,low);
        return i;
    }

    static void quick_sort(int a[],int low,int high)
    {
        if(low<high)
        {
            int p=partition(a, low, high);
            quick_sort(a, low, p-1);
            quick_sort(a, p+1, high);
        }
    }

    static void merge(int a[],int b[],int c[],int n,int m)
    {
        int i=0,j=0,k=0;
        while(i<n && j<m){
            if(a[i]<b[j])
            c[k++]=a[i++];
            else
            c[k++]=b[j++];
        }
        while(i<n)
        c[k++]=a[i++];
        while(j<m)
        c[k++]=b[j++];

    }

    public static int[] merge(int a[],int b[],int n,int m)
    {
        int ans[]=new int[n+m];
        int i=0,j=0,k=0;
        while(i<n && j<m)
        {
            ans[k++]=(a[i]<b[j])?a[i++]:b[j++];
        }
        while(i<n)
        ans[k++]=a[i++];
        while(j<m)
        ans[k++]=b[j++];

        return ans;
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("# Array 1");
        System.out.print("NO. of elements :");
        int n=sc.nextInt();
        int a[]=new int[n];
        store_val(a, n);

        System.out.println("# Array 2");
        System.out.print("NO. of elements :");
        int m=sc.nextInt();
        int b[]=new int[m];
        store_val(b, m);

        quick_sort(a, 0, n-1);
        quick_sort(b, 0, m-1);

        int ans[]=merge(a, b, n, m);

        System.out.print("Sorted merged array :");;
        for(int i=0 ;i<n+m ;i++)
        System.out.print(ans[i]+" ");
    }
}
