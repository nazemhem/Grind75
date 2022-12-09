package easy;

/*
Runtime 1 ms Beats 79.85%
Memory 43.1 MB Beats 47.7%
 */
public class MergeTwoSortedLists21 {

    public static void main(String[] args) {
        //[9,11,12]
        //[0,34,50]
        ListNode first1 = new ListNode(9);
        ListNode first2 = new ListNode(11);
        ListNode first3 = new ListNode(12);
        first1.next = first2;
        first2.next = first3;

        ListNode second1 = new ListNode(0);
        ListNode second2 = new ListNode(34);
        ListNode second3 = new ListNode(50);
        second1.next = second2;
        second2.next = second3;

        System.out.println(mergeTwoLists(first1, second1));


    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) return list2;
        else if (list2 == null) return list1;
        if (list1.val <= list2.val) {
            list1.next = mergeTwoLists(list1.next, list2);
            return list1;
        } else {
            list2.next = mergeTwoLists(list2.next, list1);
            return list2;
        }
    }


}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    @Override
    public String toString() {
        return "ListNode{" +
                "val=" + val +
                ", next=" + next +
                '}';
    }
}
