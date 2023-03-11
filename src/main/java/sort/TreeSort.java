package sort;

import sort.binaryTree.BinaryTree;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
/**
 * The TreeSort class is an implementation of the Sorter interface that sorts a list using a binary tree.
 */
public class TreeSort implements Sorter {

    /**
     * Creates a binary tree and inserts each element of the list into the tree using the Comparator.
     * Then it performs an inorder traversal of the tree to get the elements in sorted order and adds
     * them back to the list.
     * @param list        list to be sorted
     * @param comparator  comparator to use
     */
    public <T> void sort(List<T> list, Comparator<T> comparator) {
        BinaryTree<T> sortTree = new BinaryTree<>(comparator);
        for (T t : list) {
            sortTree.insert(t);
        }
        List<T> sortedList = new ArrayList<>();
        sortTree.inorderTraversal(sortedList);
        list.clear();
        list.addAll(sortedList);
    }
}
