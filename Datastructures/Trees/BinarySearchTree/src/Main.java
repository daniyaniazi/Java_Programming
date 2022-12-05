public class Main {
    public static void main(String[] args)
    {
       BinaryTree tree = new BinaryTree();
        tree.insert(5);
        tree.insert(8);
      //  tree.insert(1);
        tree.insert(6);
        tree.insert(7);
        tree.insert(6);
        tree.insert(4);
        System.out.println( tree.find(7));
//        tree.preOrder();
//        tree.inOrder();
//        tree.postOrder();
//        System.out.println( tree.height());
        System.out.println(tree.min());
        System.out.println(tree.BinaryMin());;

    }
}