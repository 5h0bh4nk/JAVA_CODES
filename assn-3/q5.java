import java.util.Scanner;

public class q5 {
    static class node
    {
        int val;
        node left,right;

        public node(int x)
        {
            val=x;
            left = right = null;
        }
    }

    static node create_tree(node root,int x)
    {
        Scanner sc = new Scanner(System.in);
        if(root==null)
        {
            root = new node(x);
        }

        int p;
        p = sc.nextInt();
        if(p!=0)
        root.left=create_tree(root.left,p);

        p = sc.nextInt();
        if(p!=0)
        root.right=create_tree(root.right,p);

        return root;
    }

    static void inorder_print(node root)
    {
        if(root==null)
        return;
        inorder_print(root.left);
        System.out.print(root.val + " ");
        inorder_print(root.right);
    }

    public static void main(String args[])
    {
        int p;
        Scanner sc =new  Scanner(System.in);
        p = sc.nextInt();
        node root=null;
        root = create_tree(root,p);
        System.out.println("INORDER PRINT BELOW !!");
        inorder_print(root);
    }
}