package comparators;

import balls.Ball;
import balls.constants.Size;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
/**
 * The SizeComparator class is an implementation of the Comparator interface comparing
 * Ball objects based on the size.
 */
public class SizeComparator implements Comparator<Ball> {

    private static final Map<Size, Integer> sizeValues = new HashMap<>();

    static {
        sizeValues.put(Size.SMALL, 1);
        sizeValues.put(Size.MEDIUM, 2);
        sizeValues.put(Size.BIG, 3);
    }

    @Override
    public int compare(Ball ball1, Ball ball2) {
        Integer size1 = sizeValues.get(ball1.getSize());
        Integer size2 = sizeValues.get(ball2.getSize());
        return size1.compareTo(size2);
    }
}
