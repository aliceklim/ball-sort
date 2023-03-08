package comparators;

import balls.Ball;
import balls.constants.BallType;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
/**
 * The TypeComparator class is an implementation of the Comparator interface comparing
 * Ball objects based on the type.
 */

public class TypeComparator implements Comparator<Ball> {
    private static final Map<BallType, Integer> typeValues = new HashMap<>();

    static {
        typeValues.put(BallType.BASKETBALL, 1);
        typeValues.put(BallType.BOWLING, 2);
        typeValues.put(BallType.FOOTBALL, 3);
        typeValues.put(BallType.GOLF, 4);
        typeValues.put(BallType.TENNIS, 5);
        typeValues.put(BallType.VOLLEYBALL, 6);
    }

    @Override
    public int compare(Ball ball1, Ball ball2) {
        Integer type1 = typeValues.get(ball1.getBallType());
        Integer type2 = typeValues.get(ball2.getBallType());
        return type1.compareTo(type2);
    }
}
