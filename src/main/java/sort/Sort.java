package sort;

import java.util.Comparator;
import java.util.List;
/**
 * The Sort interface defines a contract for sorting a List of objects using a Comparator.
 */
public interface Sort {
    <T> void sort(List<T> list, Comparator<T> comparator);
}
