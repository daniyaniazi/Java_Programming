/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    List<Integer> pre = new ArrayList<Integer>();
    public List<Integer> preorder(Node root) {
        findOrder (root);
        return pre;
    }
    public void findOrder(Node root){
        if(root == null) return;
        if(root.children == null){ pre.add(root.val); return;}
        int i=0;
        pre.add(root.val);
        while(i != root.children.size()){
            findOrder(root.children.get(i));
            i++;
        }
        return;
    }
}