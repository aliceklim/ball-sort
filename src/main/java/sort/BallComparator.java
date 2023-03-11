package sort;

import entity.Ball;
import lombok.NoArgsConstructor;

import java.util.Comparator;

@NoArgsConstructor
public class BallComparator {

    private static final Comparator<Ball> BY_TYPE = Comparator.comparing(ball -> ball.getBallType().ordinal());
    private static final Comparator<Ball> BY_SIZE = Comparator.comparing(ball -> ball.getSize().ordinal());
    private static final Comparator<Ball> BY_COLOR = Comparator.comparing(ball -> ball.getColor().ordinal());

    public static Comparator<Ball> compareByType(){
        return BY_TYPE;
    }

    public static Comparator<Ball> compareBySize(){
        return BY_SIZE;
    }

    public static Comparator<Ball> compareByColor(){
        return BY_COLOR;
    }
}
