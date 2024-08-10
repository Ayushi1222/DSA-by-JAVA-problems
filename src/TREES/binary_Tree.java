package TREES;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class binary_Tree {
    class Node {
        int val;
        Node left;
        Node right;

    }
    private Node root;
    public binary_Tree()
    {
        root = createTree();
    }
    Scanner sc=new Scanner(System.in);
    private Node createTree()
    {
        int item=sc.nextInt();
        Node nn=new Node();
        nn.val=item;
        boolean hlc=sc.nextBoolean();
        if(hlc) // has left  child

        {
            nn.left=createTree();
        }
        boolean hrc=sc.nextBoolean();
        if(hrc) //has right child
        {
            nn.right=createTree();
        }
        return nn;
    }
    public void display()
    {
        display(root);
    }

    private void display(Node node)
    {
        if(node==null) return;
        String s="";
        s="<--"+node.val+"-->";
        if(node.left!=null)
        {
            s=node.left.val+s;
        }
        else
        {
            s="."+s;
        }
        if(node.right!=null)
        {
            s=s+node.right.val;
        }
        else
        {
            s=s+".";
        }
        System.out.println(s);
        display(node.left);
        display(node.right);
    }
    public int max()
    {
        return max(root);
    }
    private int max(Node nn)
    {
        if(nn==null)
            return Integer.MIN_VALUE;
        int left=max(nn.left);
        int right=max(nn.right);
        return Math.max(left,Math.max(right,nn.val));
    }
    public boolean find(int item)
    {
        return find(root,item);
    }
    private boolean find(Node node,int item)
    {
        if(node==null)
            return false;
        if(node.val==item)
            return true;
        boolean left=find(node.left,item);
        boolean right=find(node.right,item);
        return left||right;
    }

    public int height()
    {
        return height(root);
    }
//    Height of a tree = Maximum difference between root and leaf of a tree.
    private int height(Node node)
    {
        //If we are taking height of leaf node = 1 then return 0;
        //If we are taking height of leaf node = 0 then return -1;
        if(node==null)
        {
            return 0;
        }
        int lh=height(node.left);
        int rh=height(node.right);
        return Math.max(lh,rh)+1;
    }

//    TRAVERSAL OF TREE------------------------
//    ------------------PREORDER------------------
    public void preOrder()
    {
        preOrder(root);
    }
    private void preOrder(Node node)
    {
        if(node==null)
            return;
        System.out.println(node.val+" ");
        preOrder(node.left);
        preOrder(node.right);
    }
//------------------POSTORDER----------------
    public void postOrder()
    {
        postOrder(root);
    }
    private void postOrder(Node node)
    {
        if(node==null)
            return;
        preOrder(node.left);
        preOrder(node.right);
        System.out.println(node.val+" ");
    }
//-------------------INORDER--------------------
    public void InOrder()
    {
        InOrder(root);
    }
    private void InOrder(Node node)
    {
        if(node==null)
            return;
        preOrder(node.left);
        System.out.println(node.val+" ");
        preOrder(node.right);
    }

//    --------------LEVELORDER---------------
     public void LevelOrder()
     {
         LevelOrder(root);
     }
    private void LevelOrder(Node node)
    {
        Queue<Node> q=new LinkedList<>(); // ArrayDeque in place of LinkedList
        q.add(node);
        while(!q.isEmpty())
        {
            Node rv=q.poll();
            System.out.print(rv.val+" ");
            if(rv.left!=null)
                q.add(rv.left);
            if(rv.right!=null)
                q.add(rv.right);
        }
    }

}
