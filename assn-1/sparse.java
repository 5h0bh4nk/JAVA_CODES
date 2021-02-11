import java.util.Scanner;

class sparse{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter no. of rows and columns :");
        int n=sc.nextInt();
        int m=sc.nextInt();
        int a[][]=new int[n][m];

        boolean f=false;
        int cnt=0;

        for(int i=0 ;i<n ;i++)
        {
            for(int j=0 ;j<m ;j++)
            {
                a[i][j]=sc.nextInt();
                if(a[i][j]==0)
                cnt++;
            }

            if(cnt>(m*n)/2)
            {
                f=true;
                break;
            }
        }
        if(f)
        System.out.println("sparse matrix");
        else
        System.out.println("Normal matrix");

    }
}