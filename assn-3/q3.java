public class q3{

public interface iface1{
    public static void display(){
        System.out.println("This is INTERFACE 1");
    }
}

public interface iface2{
    public static void display(){
        System.out.println("This is INTERFACE 2");
    }
}

public static class mainc implements iface1,iface2{

    public static void display(){
        System.out.println("This is main class and implementing following :");
        iface1.display();
        iface2.display();
    }
}

public static void main(String args[]){
    mainc myobj = new mainc();
    myobj.display();
}

}