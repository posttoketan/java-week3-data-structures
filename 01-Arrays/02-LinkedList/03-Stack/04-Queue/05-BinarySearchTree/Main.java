public class Main {

    static class Node {
        int data;
        Node left, right;

        Node(int value) {
            data = value;
            left = right = null;
        }
    }

    static class BinarySearchTree {

        Node root;

        void insert(int value) {
            root = insertNode(root, value);
        }

        Node insertNode(Node root, int value) {
            if (root == null) {
                return new Node(value);
            }

            if (value < root.data) {
                root.left = insertNode(root.left, value);
            } else if (value > root.data) {
                root.right = insertNode(root.right, value);
            }

            return root;
        }

        void inorder(Node root) {
            if (root != null) {
                inorder(root.left);
                System.out.print(root.data + " ");
                inorder(root.right);
            }
        }
    }

    public static void main(String[] args) {

        BinarySearchTree tree = new BinarySearchTree();

        tree.insert(50);
        tree.insert(30);
        tree.insert(70);
        tree.insert(20);
        tree.insert(40);
        tree.insert(60);
        tree.insert(80);

        System.out.println("Inorder Traversal:");
        tree.inorder(tree.root);
    }
}
