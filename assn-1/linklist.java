import java.util.*;
public class linklist {
    node head;
    int size;

    linklist(){
        head=null;
        size=0;
    }

    public class node{
        int data;
        node next;
        node(int i){
            data=i;
            next=null;
        }
    }

    int size(){
        return size;
    }

    void insert(int x)
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
        size++;
        return;
    }

    void printlist()
    {
        node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data);
            if(temp.next!=null)
            System.out.print(" -> ");
            temp=temp.next;
        }
    }

    void input(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter numbers with space and -1 to terminate the input:");
        int p=sc.nextInt();
        while(p!=-1)
        {
            insert(p);
            p=sc.nextInt();
        }
    }
    
    public static void main(String args[])
    {
        linklist ll=new linklist();
        ll.input();
        System.out.println("The entered list is :");
        ll.printlist();
    }
}
