import comparators.ColorComparator;
import sort.MergeSort;

import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Basket basket = new Basket();
        MergeSort mergeSort = new MergeSort();
        Comparator colorComparator = new ColorComparator();
        basket.fillInBasket(12);
        basket.listContents();
        mergeSort.sort(basket.getBalls(), colorComparator);
        basket.listContents();
    }
}
