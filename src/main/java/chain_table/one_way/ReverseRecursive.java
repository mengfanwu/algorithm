package chain_table.one_way;

/**
 * Created by mengfw on 2017/12/7.
 */
public class ReverseRecursive {
    public static void main(String[] args) {
        Node head = Node.init();
        head.print();
        Node reHead = reverse(head);
        reHead.print();


    }

    public static Node reverse(Node head){

        if(head == null || head.next == null){
            return head;
        }

        Node reHead = reverse(head.next);//拿到最后一个节点

        head.next.next = head;//反转
        head.next = null;
        return reHead;//将翻转后的头逐层返回

    }

}
