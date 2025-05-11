package com.programs;

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
}

public class LeetCode21 {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode newNode = new ListNode(Integer.MIN_VALUE);
        ListNode headNode = newNode;

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                newNode.next = list1;
                list1 = list1.next;
            } else {
                newNode.next = list2;
                list2 = list2.next;
            }
            newNode = newNode.next;
        }
        if (list1 == null)
            newNode.next = list2;
        else if (list2 == null)
            newNode.next = list1;
        return headNode.next;
    }
}
