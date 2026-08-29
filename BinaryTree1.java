public class BinaryTree1 {
    public static void main(String[] args) {
        BinaryTree<Integer> intTree = new BinaryTree<>();
        int[] values = {50, 30, 70, 20, 40, 60, 80};
        for (int v : values) intTree.insert(v);
        intTree.inorder(); // 20 30 40 50 60 70 80

        BinaryTree<String> strTree = new BinaryTree<>();
        String[] words = {"banana", "apple", "cherry"};
        for (String w : words) strTree.insert(w);
        strTree.inorder(); // apple banana cherry
    }
    }


class Node<T extends Comparable<T>> {
    T data;
    Node<T> left;
    Node<T> right;

    Node(T data) {
        this.data = data;
        left = right = null;
    }
}

class BinaryTree<T extends Comparable<T>> {
    Node<T> root;

    BinaryTree() {
        root = null;
    }

    void insert(T data) {
        root = insertRec(root, data);
    }

    private Node<T> insertRec(Node<T> root, T data) {
        if (root == null) {
            return new Node<>(data);
        }
        int cmp = data.compareTo(root.data);
        if (cmp < 0) {
            root.left = insertRec(root.left, data);
        } else if (cmp > 0) {
            root.right = insertRec(root.right, data);
        }
        return root;
    }

    void inorder() {
        inorderRec(root);
        System.out.println();
    }

    private void inorderRec(Node<T> root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.data + " ");
            inorderRec(root.right);
        }
    }

    boolean search(T data) {
        return searchRec(root, data);
    }

    private boolean searchRec(Node<T> root, T data) {
        if (root == null) return false;
        int cmp = data.compareTo(root.data);
        if (cmp == 0) return true;
        return cmp < 0 ? searchRec(root.left, data) : searchRec(root.right, data);
    }
}

