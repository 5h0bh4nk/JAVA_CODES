import java.util.Scanner;

public class q11 {
    static class Company{
        String name[];
        int salary[];
        int size;

        Company()
        {
            Scanner sc=new Scanner(System.in);
            System.out.print("No. of employees : ");
            size=sc.nextInt();
            name = new String[size];
            salary=new int[size];
        }
        void takeInput(){
            System.out.println("Eneter name and salary :");
            Scanner sc=new Scanner(System.in);
            for(int i=0 ;i<size ;i++)
            {
                name[i]=sc.next();
                salary[i]=sc.nextInt();
            }
        }
    }

    static class display extends Company{
        int maxs,mins;

        void dispMin(){
            int ind=0;
            int mins=salary[0];
            for(int i=1 ;i<size ;i++)
            {
                if(salary[i]<mins)
                {
                    mins=salary[i];
                    ind=i;
                }
            }
            System.out.println("The employee with Min salary is "+super.name[ind]+" with salary of "+super.salary[ind]);
            this.mins=mins;
        }

        void dispMax(){
            int ind=0,maxs=salary[0];
            for(int i=1 ;i<size;i++)
            {
                if(salary[i]>maxs)
                {
                    maxs=salary[i];
                    ind=i;
                }
            }
            System.out.println("The employee with Max salary is "+super.name[ind]+" with salary of "+super.salary[ind]);
            this.maxs=maxs;
        }
    }

    static class compute extends display{
        void avgSalary(){
            int sum=0;
            for(int i=0 ;i<size ;i++)
            {
                sum+=super.salary[i];
            }
            System.out.println("The avg. salary of employees is "+(sum/size));
        }

        void difference(){
            System.out.print("The difference of max and min salary is "+(super.maxs-super.mins));
        }
    }

    public static void main(String args[])
    {
        compute MyCompany=new compute();
        MyCompany.takeInput();
        MyCompany.dispMin();
        MyCompany.dispMax();
        MyCompany.avgSalary();
        MyCompany.difference();
    }
}
