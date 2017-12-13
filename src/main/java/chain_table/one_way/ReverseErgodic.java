package chain_table.one_way;

/**
 * Created by mengfw on 2017/12/7.
 */
public class ReverseErgodic {
    public static void main(String[] args) {
        Node head = Node.init();
        head.print();
        Node reHead = reverse(head);
        reHead.print();
    }

    public static Node reverse(Node head){
        Node pre = null;
        Node cur = head;
        while(cur != null){
            Node temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;
        }
        return pre;
    }

}
