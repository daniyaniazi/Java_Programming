public class BinaryTree {
    private class Node {
        private Integer value;
        private Node left;
        private Node right;

        public Node(Integer value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "Node = " + value;
        }
    }

    private Node root;


    public void insert(int value) {
       Node node = new Node(value);
        if (root == null) {
            root =node;
            return;
        }
        Node current = root;
        while (true) {
            if (value < current.value) {
                if (current.left == null) {
                    current.left = node;
                    break;
                } else {
                    current = current.left;
                }
            } else {
                if (current.right == null) {
                    current.right = node;
                    break;
                } else {
                    current = current.right;
                }
            }
        }
    }

    public boolean find(int value){
        Node current = root;
        while (current!=null){
            if(value<current.value){
                current =current.left;
            }
            else if(value>current.value){
                current =current.right;
            }
            else return true;
        }
        return false;
    }
    public void  preOrder(){
        preOrder(root);
    }
    private void  preOrder(Node root){
        if (root == null) return;
        System.out.println(root.value);
        preOrder(root.left);
        preOrder(root.right);
    }


    public void  inOrder(){
        inOrder(root);
    }
    private void  inOrder(Node root){
        if (root == null) return;
        inOrder(root.left);
        System.out.println(root.value);
        inOrder(root.right);
    }

    public void  postOrder(){
        postOrder(root);
    }
    private void  postOrder(Node root){
        if (root == null) return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.value);
    }
}
