public class array {
    public static void main(String args[])
    {
        int[] a = new int[5];
        a[0]=1;a[1]=2;a[2]=3;a[3]=4;a[4]=5;
        print(a);
        int[] b=give();
        print(b);

        int s=10000000;
        changeval(s);
        System.out.println(s);
    }

    static void print(int[] a)
    {
        for(int i=0 ;i<a.length ;i++)
        {
            System.out.println("The values for index" + (i+1) +" is " + a[i]);
        }
    }

    public static int[] give()
    {
        return new int[]{1,2,3,4,5,10};
    }

    static void changeval(int a)
    {
        a=100;
    }
}
