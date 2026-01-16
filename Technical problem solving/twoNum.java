// You are given two non-empty linked lists representing
// two non-negative integers. The digits are stored in reverse order,
// and each of their nodes contains a single digit. Add the two numbers and return
// the sum as a linked list.
// You may assume the two numbers do not contain any leading zero, except the number 0 itself.

class twoNum {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l3 = new ListNode(0);
        ListNode head = l3;
        int carry = 0;
        while(l1!=null || l2!=null || carry!=0){
            int v1 = (l1!=null)? l1.val : 0;
            int v2 = (l2!=null)? l2.val : 0;
            int sum = v1+v2+carry;
            carry = sum/10;
            int digit = sum%10;
            l3.next = new ListNode(digit);
            l3 = l3.next;
            l1 = (l1!=null) ? l1.next : null;
            l2 = (l2!=null) ? l2.next : null;
        }
        return head.next;

        
    }
}