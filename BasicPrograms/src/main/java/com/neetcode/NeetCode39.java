package com.neetcode;

public class NeetCode39 {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode newNode = new ListNode();
        newNode.next = head;

        ListNode firstPtr = newNode;
        ListNode secondPtr = newNode;

        for (int i = 0; i < n; i++) {
            secondPtr = secondPtr.next;
        }

        while (secondPtr != null) {
            firstPtr = firstPtr.next;
            secondPtr = secondPtr.next;
        }
        firstPtr.next = firstPtr.next.next;
        return newNode.next;

    }
}
