import java.util.Scanner;
public class spiral {

    // spiral_print will be a recursive function to print an array spiral wise
    // a is the array , and the iterators are :
    // n: denoting iterator going from bottom to up (lower iterator)
    // m: denoting iterator from right to left (right iterator)
    // i: corosponds to n and iterates from top to down(upper iterator)
    // j: corosponds to m and iterates from left to right(left operator)
    // booleans rup denotes going from left to right with upper iterator
    // boolean crt denotes going from left to right with left iterator

    // We aim at recursively decreasing its dimensions while printing it


    static void spiral_print(int a[][],int n,int m,int i,int j,boolean rup,boolean crt)
    {
        //the function breaks when opposite iterators meet
        if(i==n+1 && j==m+1)
        return;

        //starting iteration to right with upper iterator i
        if(rup && crt)
        {

            for(int k=j ;k<=m ;k++)
            System.out.print(a[i][k] + " ");
            rup=false;
            spiral_print(a, n, m, i+1,j,rup,crt);
        }

        //doing left iteration with lower iterator n
        else if(!rup && !crt)
        {
            for(int k=m;k>=j;k--)
            System.out.print(a[n][k]+" ");
            rup=true;
            spiral_print(a, n-1, m, i,j,rup,crt);
        }

        //doing down iteration with right iterator m
        else if(!rup && crt)
        {
            for(int k=i;k<=n;k++)
            System.out.print(a[k][m]+" ");
            crt=false;
            spiral_print(a, n, m-1, i,j,rup,crt);
        }

        //doing up iteration with left iterator j
        else if(rup && !crt)
        {
            for(int k=n;k>=i ;k--)
            System.out.print(a[k][j]+" ");
            crt=true;
            spiral_print(a, n, m, i,j+1,rup,crt);
        }
    }

    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter array size n and m : ");
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] a=new int[n][m];
        System.out.print("Array : \n");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }

        System.out.print("Spiral order :");
        spiral_print(a,n-1,m-1,0,0,true,true);
    }
}