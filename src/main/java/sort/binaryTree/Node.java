package sort.binaryTree;

/**
 * The Node class uses a generic type parameter T allowing to put any type of data.
 * Is used for BinaryTree class
 */

public class Node<T> {
    T value;
    Node<T> left;
    Node<T> right;

    Node(T value)
    {
        this.value = value;
        left = null;
        right = null;
    }
}
