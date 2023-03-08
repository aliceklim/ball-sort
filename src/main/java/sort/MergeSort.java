package sort;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
/**
 * The MergeSort class provides an implementation of the Merge Sort algorithm which cuts down a list
 * into multiple sublists until each has only one item, then merges all the sublists into a sorted list.
 */
public class MergeSort implements Sort {
    public <T> void sort(List<T> list, Comparator<T> comparator){
        mergeSort(list, comparator);
    }

    private static <T> void mergeSort(List<T> list, Comparator<T> comparator){

        if (list.size() < 2)
            return;

        int middle = list.size() / 2;
        List<T> leftList = new ArrayList<>();
        List<T> rightList = new ArrayList<>();

        for (int i = 0; i < middle; i++) {
            leftList.add(list.get(i));
        }
        for (int i = middle; i < list.size(); i++) {
            rightList.add(list.get(i));
        }

        mergeSort(leftList, comparator);
        mergeSort(rightList, comparator);

        merge(list, leftList, rightList, comparator);
    }

    private static <T> void merge(List<T> list, List<T> leftList, List<T> rightList, Comparator<T> comparator){

        int pivot = 0;
        int left = 0;
        int right = 0;

        while (left < leftList.size() && right < rightList.size()) {
            if (comparator.compare(leftList.get(left), rightList.get(right)) < 0) {
                list.set(pivot++, leftList.get(left++));
            } else {
                list.set(pivot++, rightList.get(right++));
            }
        }
        while (left < leftList.size()) {
            list.set(pivot++, leftList.get(left++));
        }
        while (right < rightList.size()) {
            list.set(pivot++, rightList.get(right++));
        }
    }
}
