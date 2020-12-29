import java.util.ArrayList;
import java.util.List;

public class _0559_Maximum_Depth_of_N_ary_Tree {
    public static int maxDepth(Node root) {
        int maxDepth = 1;
        if (root == null) {
            return 0;
        }
        List<Node> children = root.children;
        if (children == null) {
            return 1;
        }
        for (Node child : children) {
            maxDepth = Math.max(maxDepth, maxDepth(child) + 1);
        }
        return maxDepth;
    }

    public static void main(String[] args) {
        List<Node> childrenOfNode1_3 = new ArrayList<>();
        childrenOfNode1_3.add(new Node(5));
        childrenOfNode1_3.add(new Node(6));
        List<Node> childrenOfNode1_1 = new ArrayList<>();
        childrenOfNode1_1.add(new Node(3, childrenOfNode1_3));
        childrenOfNode1_1.add(new Node(2));
        childrenOfNode1_1.add(new Node(4));
        Node node1_1 = new Node(1, childrenOfNode1_1);
        System.out.println(maxDepth(node1_1));

        List<Node> childrenOfNode2_11 = new ArrayList<>();
        childrenOfNode2_11.add(new Node(14));
        Node node2_11 = new Node(11, childrenOfNode2_11);
        List<Node> childrenOfNode2_7 = new ArrayList<>();
        childrenOfNode2_7.add(node2_11);
        List<Node> childrenOfNode2_3 = new ArrayList<>();
        childrenOfNode2_3.add(new Node(6));
        childrenOfNode2_3.add(new Node(7, childrenOfNode2_7));
        Node node2_3 = new Node(3, childrenOfNode2_3);
        List<Node> childrenOfNode2_8 = new ArrayList<>();
        childrenOfNode2_8.add(new Node(12));
        List<Node> childrenOfNode2_4 = new ArrayList<>();
        childrenOfNode2_4.add(new Node(8, childrenOfNode2_8));
        Node node2_4 = new Node(4, childrenOfNode2_4);
        List<Node> childrenOfNode2_9 = new ArrayList<>();
        childrenOfNode2_9.add(new Node(13));
        List<Node> childrenOfNode2_5 = new ArrayList<>();
        childrenOfNode2_5.add(new Node(9, childrenOfNode2_9));
        childrenOfNode2_5.add(new Node(10));
        Node node2_5 = new Node(5, childrenOfNode2_5);
        List<Node> childrenOfNode2_1 = new ArrayList<>();
        childrenOfNode2_1.add(new Node(2));
        childrenOfNode2_1.add(node2_3);
        childrenOfNode2_1.add(node2_4);
        childrenOfNode2_1.add(node2_5);
        Node node2_1 = new Node(1, childrenOfNode2_1);
        System.out.println(maxDepth(node2_1));
    }
}

class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}
