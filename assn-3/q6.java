import java.util.Scanner;

import q5;

public class q6 extends q5{
    static int count_leaves(node root)
    {
        if(root==null)
        return 0;

        if(root.left==null && root.right==null)
        return 1;

        return count_leaves(root.left)+count_leaves(root.right);
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int p=sc.nextInt();

        node root = null;
        root = create_tree(root, p);
        System.out.print("No. of leaves in the tree is " + count_leaves(root));
    }
}
