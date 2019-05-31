import java.util.LinkedList;

// Check if a linked list is a palindrome
// Method: compare reversed front of the array to the second half. We will use a stack to reverse the front half
class isPalidrome {
    boolean isPalidrome(LinkedList head) {
        LinkedList fast = head;
        LinkedList slow = head;
        Stack<Integer> stack = new Stack<Integer>();
        // push elements from first half onto the stack. When fast runner reaches the
        // end we know that we are at the middle
        while (fast != null && fast.next != null) {
            stack.push(slow.value);
            slow = slow.next;
            fast = fast.next.next;
        }
        // has odd number of elemenets->skip the middle element
        if (fast != null) {
            slow = slow.next;
        }
        while (slow != null) {
            int top = stack.pop();
            if (top != slow.value)
                return false;
            slow = slow.next;
        }
        return true;
    }
}