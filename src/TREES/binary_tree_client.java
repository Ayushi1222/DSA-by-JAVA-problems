package TREES;

public class binary_tree_client {
//    10 true 20 true 40 false false true 50 false false true 30 false true 60 true 70 false false false
    public static void main(String[] args) {
        binary_Tree tree=new binary_Tree();
        tree.display();
        System.out.println(tree.max());
        System.out.println(tree.find(50));
        System.out.println(tree.height());
        tree.LevelOrder();
    }
}
