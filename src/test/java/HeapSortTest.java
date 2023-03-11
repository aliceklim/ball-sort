import entity.constants.BallType;
import entity.constants.Color;
import entity.constants.Size;
import sort.BallComparator;
import sort.HeapSort;
import entity.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class HeapSortTest {
    HeapSort sorter;
    List<Ball> balls;
    List<Ball> expected;


    @BeforeEach
    void setUp(){
        sorter = new HeapSort();
        balls = Arrays.asList(
                new Ball(BallType.BASKETBALL, Size.BIG, Color.BROWN),
                new Ball(BallType.FOOTBALL, Size.BIG, Color.WHITE),
                new Ball(BallType.GOLF, Size.SMALL, Color.WHITE),
                new Ball(BallType.TENNIS, Size.SMALL, Color.GREEN),
                new Ball(BallType.VOLLEYBALL, Size.MEDIUM, Color.YELLOW),
                new Ball(BallType.BOWLING, Size.BIG, Color.BLACK)
        );
        expected = new ArrayList<>(balls);
    }

    @Test
    void testQuickSortByColor() {
        sorter.sort(balls, BallComparator.compareByColor());
        expected.sort(BallComparator.compareByColor());
        Assertions.assertIterableEquals(balls.stream().map(Ball::getColor).collect(Collectors.toList()),
                expected.stream().map(Ball::getColor).collect(Collectors.toList()));
    }

    @Test
    void testQuickSortByType() {
        sorter.sort(balls, BallComparator.compareByType());
        expected.sort(BallComparator.compareByType());
        Assertions.assertEquals(expected.stream().map(Ball::getBallType).collect(Collectors.toList()),
                balls.stream().map(Ball::getBallType).collect(Collectors.toList()));
    }

    @Test
    void testQuickSortBySize() {
        sorter.sort(balls, BallComparator.compareBySize());
        expected.sort(BallComparator.compareBySize());
        Assertions.assertIterableEquals(expected.stream().map(Ball::getSize).collect(Collectors.toList()),
                balls.stream().map(Ball::getSize).collect(Collectors.toList()));
    }
}
