package sort.binaryTree;

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
