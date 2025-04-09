package com.neetcode;

public class NeetCode38 {

    public void reorderList(ListNode head) {
        ListNode slowPtr = head;
        ListNode fastPtr = head;

        while (fastPtr != null && fastPtr.next != null) {
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
        }
        ListNode l1 = head;
        ListNode l2 = lastNode(slowPtr.next);
        slowPtr.next = null;

        ListNode finalNode = new ListNode();
        ListNode current = finalNode;

        while (l1 != null || l2 != null) {
            if (l1 != null) {
                current.next = l1;
                current = current.next;
                l1 = l1.next;
            }
            if (l2 != null) {
                current.next = l2;
                current = current.next;
                l2 = l2.next;
            }
        }

    }

    public ListNode lastNode(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        ListNode next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
}
