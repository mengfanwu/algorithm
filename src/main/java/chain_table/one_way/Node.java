package chain_table.one_way;

/**
 * Created by mengfw on 2017/12/7.
 */
public class Node {
    int value;
    Node next;

    public Node(int value, Node next) {
        this.value = value;
        this.next = next;
    }

    public Node() {
    }

    public void print(){
        Node cur = this;
        int c = 0;
        while (cur != null){
            System.out.println(cur.value);
           if(++c >20){
               return;
           }
            cur = cur.next;

        }
    }

    public static Node init(){
        Node head = new Node(1,new Node(2,new Node(3,new Node(4,null))));
        return head;
    }
    public static Node initCircle(){
        Node circle = new Node(3,null);
        circle.next = new Node(4,new Node(5,new Node(6,circle)));
        Node head = new Node(1,new Node(2,circle));
        return head;
    }
}
