import java.util.Scanner;


public class q2 {
    
    public static void permute(String s,int l,int r)
    {
        if(l==r)
        System.out.print(s + " , ");

        else{
            for(int i=l ;i<=r ;i++)
            {
                s = swap(s,l,i);
                permute(s, l+1, r);
                s = swap(s,l,i);
            }
        }
    }

    public static String swap(String s,int i,int j)
    {
        char str[] = s.toCharArray();
        char t=str[j];
        str[j]=str[i];
        str[i]=t;
        return String.valueOf(str);
    }

    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter string : ");
        String str = sc.next();
        System.out.println("The permutations of string are : ");
        permute(str, 0, str.length()-1);
    }
}
