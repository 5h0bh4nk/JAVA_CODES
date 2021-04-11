import java.util.Scanner;

public class q11{

    public static class RaisedException extends Exception{
        RaisedException(String msg){
            super(msg);
        }
    }

    static class student{
        int id;
        String name, department;
        student(int Id,String Name, String Department)
        {
            id=Id;
            name=Name;
            department=Department;
        }
    }

    static class studentinfo{
        student stu[];
        String college;
        studentinfo(int x,String clg)
        {
            college=clg;
            stu=new student[x];
        }

        void take_input() throws RaisedException
        {
            System.out.println("Enter the id, name, department of "+stu.length+" students");
            Scanner sc=new Scanner(System.in);
            int id;
            String name, department;
            for (int i=0;i<stu.length;i++)
            {
                int f=0;
                id=sc.nextInt();
                name=sc.next();
                department=sc.next();
                for (int j=0;j<i;j++)
                {
                    if (stu[j].id==id)
                    {
                        i--;
                        f=1;
                        throw new RaisedException("ID already exists . enter a different id ");
                    }
                    else if(stu[j].name==name)
                    {
                        i--;
                        f=1;
                        throw new RaisedException("Name already exists . enter a different name ");
                    }
                }

                if (f==0)
                {
                    stu[i]=new student(id,name,department);
                    System.out.println("Entry inserted successfully !");
                }

                else
                    continue;
            }
        }

        void print(){
            System.out.println();
            System.out.println("The student info in the database are :-");
            System.out.println("ID\t"+ "NAME\t\t"+"DEPARTMENT\t"+"COLLEGE\t");
            for (int i=0;i<stu.length;i++)
            {
                System.out.println(stu[i].id+"\t"+stu[i].name+"\t"+stu[i].department+"\t\t"+college);
            }
        }
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.print("Enter the no of students : ");
        n=sc.nextInt();
        System.out.print("Enter college name : ");
        String clg=sc.next();
        studentinfo sol=new studentinfo(n,clg);
        try{
            sol.take_input();
            sol.print();
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
   
}