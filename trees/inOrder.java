//inOrder traversal without recursion

public class inOrder {
    private class Node {
        Node left;
        Node right;
        int value;
    }

    public static void traverseNode(Node n) {
        Stack<Integer> s = new Stack<>();
        addLeftToStack(s, n);
        while (!s.isEmpty()) {
            Node curr = s.pop();
            System.out.println(curr.value);
            if (curr.right != null) {
                addLeftToStack(s, curr.right);
            }
        }
    }

    private static void addLeftToStack(Stack<Node> s, Node n) {
        while (n != null) {
            s.push(n);
            n = n.left;
        }
    }
}