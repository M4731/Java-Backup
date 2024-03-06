import java.util.LinkedList;
import java.util.List;

public class LinkedListCycle {

    public boolean hasCycle(ListNode head) {
        if (head == null){
            return false;
        }

        List<ListNode> verified = new LinkedList<>();
        verified.add(head);

        while ( head.next != null ){

            if ( verified.contains(head.next) ){
                return true;
            } else {
                verified.add(head.next);
                head = head.next;
            }
        }

        return false;
    }

}
