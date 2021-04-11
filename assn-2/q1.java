public class q1 {

    //defining classes 
    static class parent{
        //parent method
        void methpar(){
            System.out.println("This is parent class\n");
        }
    }

    static class child extends parent{
        //child method
        void methchild(){
            System.out.println("This is child class\n");
        }
    }

    public static void main(String args[])
    {
        //creating objects
        parent par=new parent();
        child ch=new child();

        // query 1:method of parent class by object of parent class
        par.methpar();

        // query 2:method of child class by object of child class
        ch.methchild();

        // query 3:method of parent class by object of child class
        ch.methpar();
    }
}
