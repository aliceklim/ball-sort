package comparators;

import balls.Ball;
import balls.constants.Color;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/**
 * The ColorComparator class is an implementation of the Comparator interface comparing
 * Ball objects based on the color.
 */
public class ColorComparator implements Comparator<Ball> {

    private static final Map<Color, Integer> colorValues = new HashMap<>();

    static {
        colorValues.put(Color.WHITE, 1);
        colorValues.put(Color.BLACK, 2);
        colorValues.put(Color.YELLOW, 3);
        colorValues.put(Color.BROWN, 4);
        colorValues.put(Color.GREEN, 5);
    }

    @Override
    public int compare(Ball ball1, Ball ball2) {
        Integer color1 = colorValues.get(ball1.getColor());
        Integer color2 = colorValues.get(ball2.getColor());
        return color1.compareTo(color2);
    }
}
