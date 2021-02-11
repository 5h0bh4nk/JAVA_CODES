import linklist;
import java.util.Scanner;

public class ll_midnode_delete extends linklist{

    static void remove(linklist ll,int x)
    {
        node temp=ll.head;
        if(temp.data==x)
        {
            ll.head=ll.head.next;
        }
        else
        {
            while(temp.next.data!=x)
            {
                temp=temp.next;
            }
            temp.next=temp.next.next;
        }
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        linklist ll=new linklist();
        ll.input();
        ll.printlist();
        System.out.println("\nenter value to remove: ");
        int x=sc.nextInt();
        remove(ll,x);
        System.out.println("new ll after removal : ");
        ll.printlist();
    }
}
