import java.util.Scanner;

public class q10 {
    //custom exception 
    public static class myexception extends Exception{
        public String toString(){
            return "Exception : more than 5 objects cant be created !!";
        }
    }

    //dummy class fro object array creation
    static class dummy
    {
        private void pprint(){
            System.out.println("This is dummy class");
        }
    }
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n;
        System.out.print("enter the no objects to be created : ");
        try
        {
            n=sc.nextInt();
            if (n>5)
                throw new myexception();
            dummy arr[] = new dummy[n];
            for(int i=0 ;i<n ;i++)
            {
                arr[i]= new dummy();
                arr[i].pprint();
            }
        }
        catch (myexception e)
        {
            System.out.println(e);
        }
        finally{
            System.out.println("Successfully executed !!");
        }
    }
}