import java.util.Scanner;

public class q3 {

    static class member{
        String name,address,phoneNumber;
        int age,salary;
        Scanner sc=new Scanner(System.in);
        member(){
            System.out.println("----------------------------");
            System.out.print("Enter name : ");
            name=sc.next();
            System.out.print("Enter age : ");
            age=sc.nextInt();
            System.out.print("Enter phone number : ");
            phoneNumber=sc.next();
            System.out.print("Enter address : ");
            address=System.console().readLine();
            System.out.print("Enter salary : ");
            salary=sc.nextInt();
        }
        
        void printSalary(){
            System.out.println("The salary of "+name+ " is "+ salary);
        }
    }

    static class employee extends member{
        String specialization;
        Scanner sc=new Scanner(System.in);
        employee(){
            System.out.print("Enter Specialzation : ");
            specialization=sc.next();
        }

        void printDetails(){
            System.out.println("----------------------------");
            System.out.println("Entered Details of Employee");
            System.out.println("Name : "+name);
            System.out.println("Age : "+age);
            System.out.println("Phone Number : "+phoneNumber);
            System.out.println("Address : "+address);
            System.out.println("Salary : "+salary);
            System.out.println("Specialization : "+specialization);
        }
    }

    static class manager extends member{
        String department;
        Scanner sc=new Scanner(System.in);
        manager(){
            System.out.print("Enter department : ");
            department=sc.next();
        }

        void printDetails(){
            System.out.println("----------------------------");
            System.out.println("Entered Manager Details");
            System.out.println("Name : "+name);
            System.out.println("Age : "+age);
            System.out.println("Phone Number : "+phoneNumber);
            System.out.println("Address : "+address);
            System.out.println("Salary : "+salary);
            System.out.println("Department : "+department);
        }
    }

    public static void main(String args[])
    {
        System.out.println("Enter details of Employee ->");
        employee E1 = new employee();
        System.out.println("Enter details of Manager ->");
        manager M1 = new manager();

        E1.printDetails();
        M1.printDetails();

    }
}
