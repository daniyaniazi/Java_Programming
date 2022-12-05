public class Main {
    public static void main(String[] args)
    {
       BinaryTree tree = new BinaryTree();
        tree.insert(5);
        tree.insert(8);
        tree.insert(1);

        System.out.println( tree.find(1));
        tree.preOrder();
        tree.inOrder();
        tree.postOrder();
        System.out.println( tree.height());

    }
}