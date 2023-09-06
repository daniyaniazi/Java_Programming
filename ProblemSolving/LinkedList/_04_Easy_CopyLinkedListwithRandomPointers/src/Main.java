// Definition for a Node.

import java.util.HashMap;

class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}


class Main {
    public Node copyRandomList(Node head) {
        
        HashMap<Node,Node> oldToNewNodemap= new HashMap<>();
        
        if(head == null) return null;
        
        Node current = head;
        Node prev = null;
        Node newHead = null;
        
        while(current!=null){
            Node copyNode = new Node(current.val);
            if(newHead==null){
                newHead = copyNode;
            }else{
                prev.next = copyNode;
            }
            oldToNewNodemap.put(current,copyNode);
            prev = copyNode;
            current = current.next;
        }
        
        // Random pointers
        current = head;
        Node newListCurrent = newHead;
        
        while(current!=null){
            if(current.random == null){
                newListCurrent.random = null;
            }
            else{
                newListCurrent.random = oldToNewNodemap.get(current.random);
            }
            
            current = current.next;
            newListCurrent = newListCurrent.next;
        }
        
        return newHead;
    }
}