package Practice;

public class Main {
    public static void main(String[] args) {
        // ListNode head = new ListNode(0);
        // head.next = new ListNode(1);
        // head.next.next = new ListNode(2);
        // head.next.next.next = new ListNode(3);

        ListNode head = new ListNode(0);
        ListNode cur = head;

        for(int i = 1; i <= 10; i++){
            cur.next = new ListNode(i);
            cur = cur.next;
        }

        cur = head;
        while(cur != null){
            System.out.println(cur.val);
            cur = cur.next;
        }
        System.out.println(head);
    }
}

class ListNode {
    public int val;
    public ListNode next;

    public ListNode(){}

    public ListNode(int data){
        val = data;
    }

    public ListNode(int data, ListNode pointer){
        val = data;
        next = pointer;
    }

    // public String toString(){
    //     return "val: " + val + ", next: " + next; 
    // }
}