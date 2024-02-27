public class RemoveLinkedListElements {

    public ListNode removeElements(ListNode head, int val) {

        if ( head == null ) {
            return null;
        }

        while ( head.val == val ){
            if ( head.next == null ){
                return null;
            }
            
            head = head.next;
        }

        ListNode temporary = head;
        while ( temporary.next != null){
            if ( temporary.next.val == val){
                temporary.next = temporary.next.next;
            }
            else {
                temporary = temporary.next;
            }
        }

        return head;
    }

    public static void main(String[] args) {

    }

}
