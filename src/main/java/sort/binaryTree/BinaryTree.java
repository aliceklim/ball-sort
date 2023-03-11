package sort.binaryTree;

import java.util.Comparator;
import java.util.List;

/**
 * Class provides possibility to insert nodes and perform an inorder traversal of the tree.
 * It uses a generic type parameter T and a Comparator object to compare values.
 */
public class BinaryTree<T> {

    Node<T> root;
    Comparator<T> comparator;

    public BinaryTree(Comparator<T> comparator) {
        this.comparator = comparator;
    }

    public void insert(T value) {
        root = insertRecursive(root, value);
    }

    private Node<T> insertRecursive(Node<T> current, T value) {
        if (current == null) {
            return new Node<>(value);
        }

        if (comparator.compare(value, current.value) < 0) {
            current.left = insertRecursive(current.left, value);
        } else {
            current.right = insertRecursive(current.right, value);
        }

        return current;
    }

    public void inorderTraversal(List<T> list) {
        inorderTraversal(root, list);
    }

    private void inorderTraversal(Node<T> current, List<T> list) {
        if (current != null) {
            inorderTraversal(current.left, list);
            list.add(current.value);
            inorderTraversal(current.right, list);
        }
    }
}
