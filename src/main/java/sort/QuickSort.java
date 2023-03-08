package sort;

import java.util.Comparator;
import java.util.List;
/**
 * The QuickSort class provides an implementation of the Quick Sort algorithm. It works by
 * partitioning the list into two sublists around a pivot element, and then recursively sorting each sublist.
 */
public class QuickSort implements Sort {

    public <T> void sort(List<T> list, Comparator<T> comparator){
        quickSort(list, 0, list.size() - 1, comparator);
    }

    private <T> void quickSort(List<T> list, int start, int end, Comparator<T> comparator) {
        if (start < end){
            int pivot = partition(list, start, end, comparator);
            quickSort(list, start, pivot - 1, comparator);
            quickSort(list, pivot + 1, end, comparator);
        }
    }

    private <T> int partition(List<T> list, int start, int end, Comparator<T> comparator) {
        T pivot = list.get(end);
        int i = start - 1;
        for (int k = start; k <= end - 1; k++) {
            if (comparator.compare(list.get(k), pivot) <= 0) {
                i++;
                swap(list, i, k);
            }
        }

        swap(list, i + 1, end);
        return i + 1;
    }

    private <T> void swap(List<T> list, int num1, int num2){
        T temp = list.get(num1);
        list.set(num1, list.get(num2));
        list.set(num2, temp);
    }
}
