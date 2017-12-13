package chain_table.one_way;

/**
 * Created by mengfw on 2017/12/7.
 */
public class CheckCircle {
    public static void main(String[] args) {
        Node circle = Node.init();
        System.out.println(check(circle));

    }
    public static boolean check(Node head){
        if (head == null){
            return false;
        }
        Node n1 = head;
        Node n2 = head;
        while(n2 != null){
            n1 = n1.next;
            if(n1 == null){
                return false;
            }
            n2 = n2.next;
            if(n2 == null){
                return false;
            }
            n2 = n2.next;
            if(n1 == n2){
                return true;
            }
        }

        return false;
    }
}
