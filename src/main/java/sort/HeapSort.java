package sort;

import java.util.Comparator;
import java.util.List;
/**
 * The HeapSort class provides an implementation of the Heap Sorter algorithm which sorts by
 * inserting the data into a heap and then repeatedly extracting the root of the heap
 */
public class HeapSort implements Sorter {

    public <T> void sort(List<T> list, Comparator<T> comparator) {
        heapify(list, comparator);
        int end = list.size() - 1;
        while (end > 0) {
            swap(list, end, 0);
            end--;
            siftDown(list, 0, end, comparator);
        }
    }

    private <T> void heapify(List<T> list, Comparator<T> comparator) {
        for (int start = (list.size() - 2) / 2; start >= 0; start--) {
            siftDown(list, start, list.size() - 1, comparator);
        }
    }

    private <T> void siftDown(List<T> list, int start, int end, Comparator<T> comparator) {
        int root = start;
        while ((2 * root + 1) <= end) {
            int child = 2 * root + 1;
            int swap = root;
            if (comparator.compare(list.get(swap), list.get(child)) < 0) {
                swap = child;
            }
            if (((child + 1) <= end) && (comparator.compare(list.get(swap), list.get(child + 1)) < 0)) {
                swap = child + 1;
            }
            if (swap == root) {
                return;
            } else {
                swap(list, root, swap);
                root = swap;
            }
        }
    }

    private <T> void swap(List<T> list, int i1, int i2) {
        T swapObj = list.get(i1);
        list.set(i1, list.get(i2));
        list.set(i2, swapObj);
    }
}
