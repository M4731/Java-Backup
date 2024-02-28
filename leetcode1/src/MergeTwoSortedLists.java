import org.w3c.dom.NodeList;

import java.util.List;

public class MergeTwoSortedLists {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        if ( list1 == null && list2 == null ) {
            return null;
        }

        if ( list1 == null ){
            return list2;
        }

        if ( list2 == null ) {
            return list1;
        }

        ListNode result = new ListNode();
        if ( list1.val <= list2.val ) {
            result.val = list1.val;
            list1 = list1.next;
        }
        else {
            result.val = list2.val;
            list2 = list2.next;
        }
        ListNode start = result;

        while ( list1 != null && list2 != null ){
            if ( list1.val <= list2.val ){
                ListNode aux = new ListNode();
                aux.val = list1.val;
                result.next = aux;
                result = result.next;
                list1 = list1.next;
            }
            else{
                ListNode aux = new ListNode();
                aux.val = list2.val;
                result.next = aux;
                result = result.next;
                list2 = list2.next;
            }
        }

        while ( list1 != null ){
            ListNode aux = new ListNode();
            aux.val = list1.val;
            result.next = aux;
            result = result.next;
            list1 = list1.next;
        }

        while (list2 != null ){
            ListNode aux = new ListNode();
            aux.val = list2.val;
            result.next = aux;
            result = result.next;
            list2 = list2.next;
        }

        return start;

    }

}
