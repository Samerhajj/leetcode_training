package Java;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDuplicate {


    // Definition for singly-linked list.
    public static class ListNode {
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

    public static ListNode deleteDuplicates(ListNode head) {

        ListNode current = head;

           while(current!=null && current.next!=null){
               if(current.val==current.next.val){
                   current.next=current.next.next;
                   continue;
               }
               current=current.next;
           }
        return head;
    }


    public static void main(String[] args) {

        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(1);

        ListNode test = deleteDuplicates(head);

        for(ListNode node=test;node!=null;node=node.next){
            System.out.println(node.val);
        }

    }
}


