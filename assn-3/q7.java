import java.util.Scanner;

import q4;

public class q7 extends q4{
    static void printlist(node head)
    {
        if(head==null)
        return;
        System.out.print(head.data + " ");
        printlist(head.next);
    }

    static node merge(node h1,node h2)
    {
        node head=null;
        while(h1!=null && h2!=null)
        {
            if(h1.data<h2.data)
            {
                head=insert(head, h1.data);
                h1=h1.next;
            }
            else
            {
                head=insert(head, h2.data);
                h2=h2.next;
            }
        }
        while(h1!=null)
        {
            head = insert(head, h1.data);
            h1 = h1.next;
        }
        while(h2!=null)
        {
            head = insert(head, h2.data);
            h2 = h2.next;
        }

        return head;
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        node l1=null,l2=null,merged=null;
        System.out.println("Enter first list and -1 to terminate the input: ");
        
        int p=sc.nextInt();
        while(p!=-1)
        {
            l1 = insert(l1,p);
            p=sc.nextInt();
        }

        System.out.println("Enter second list and -1 to terminate the input: ");

        p=sc.nextInt();
        while(p!=-1)
        {
            l2 = insert(l2,p);
            p=sc.nextInt();
        }

        merged = merge(l1, l2);
        System.out.println("The merged list is :");
        printlist(merged);
    }
}
