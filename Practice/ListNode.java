package Practice;

public class ListNode {
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

    public String toString(){
        return "val: " + val + ", next: " + next; 
    }
}
