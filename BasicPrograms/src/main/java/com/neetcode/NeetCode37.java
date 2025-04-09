package com.neetcode;

public class NeetCode37 {

    public boolean hasCycle(ListNode head) {
        ListNode slowPtr = head;
        ListNode fastPtr = head;
        while( fastPtr != null && fastPtr.next != null){
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
            if(fastPtr == slowPtr)
                return true;
        }
        return false;
    }
}
