import java.util.*;
public class q4 {

    public static class node{
        int data;
        node next;
        node(int i){
            data=i;
            next=null;
        }
    }

    static node insert(node head,int x)
    {
        if(head==null){
            head=new node(x);
        }
        else{
            node tmp=head;
            while(tmp.next!=null)
            tmp=tmp.next;
            tmp.next=new node(x);
        }
        return head;
    }

    static boolean has_loop(node head)
    {
        node fp=head,sp=head;
        while(fp!=null && fp.next!=null)
        {
            fp=fp.next.next;
            sp=sp.next;

            if(fp==sp)
                return true;
        }
        return false;
    }

    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter numbers with space and -1 to terminate the input:");
        node head=null;
        int p=sc.nextInt();
        while(p!=-1)
        {
            head = insert(head,p);
            p=sc.nextInt();
        }
        System.out.println("Linking 2nd element with last in linklist to make a loop");
        node sec=head.next,last=head;
        while(last.next!=null)
        last=last.next;

        last.next=sec;

        if(has_loop(head))
        System.out.println("Yes ! loop exists !");
        else
        System.out.println("NO loop exists !!");
    }
}
