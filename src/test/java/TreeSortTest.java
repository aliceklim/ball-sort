import entity.constants.BallType;
import entity.constants.Color;
import entity.constants.Size;
import sort.BallComparator;
import sort.TreeSort;
import entity.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TreeSortTest {
    TreeSort sorter;
    List<Ball> balls;
    List<Ball> expected;
    List<Ball> sorted;


    @BeforeEach
    void setUp(){
        sorter = new TreeSort();
        balls = Arrays.asList(
                new Ball(BallType.BASKETBALL, Size.BIG, Color.BROWN),
                new Ball(BallType.FOOTBALL, Size.BIG, Color.WHITE),
                new Ball(BallType.GOLF, Size.SMALL, Color.WHITE),
                new Ball(BallType.TENNIS, Size.SMALL, Color.GREEN),
                new Ball(BallType.VOLLEYBALL, Size.MEDIUM, Color.YELLOW),
                new Ball(BallType.BOWLING, Size.BIG, Color.BLACK)
        );
        expected = new ArrayList<>(balls);
        sorted= new ArrayList<>(balls);

    }

    @Test
    void testQuickSortByColor() {
        sorter.sort(sorted, BallComparator.compareByColor());
        Assertions.assertEquals(expected.stream().map(Ball::getColor).collect(Collectors.toList()),
                balls.stream().map(Ball::getColor).collect(Collectors.toList()));
    }

    @Test
    void testQuickSortByType() {
        sorter.sort(sorted, BallComparator.compareByType());
        Assertions.assertEquals(expected.stream().map(Ball::getBallType).collect(Collectors.toList()),
                balls.stream().map(Ball::getBallType).collect(Collectors.toList()));
    }

    @Test
    void testQuickSortBySize() {
        sorter.sort(sorted, BallComparator.compareBySize());
        Assertions.assertEquals(expected.stream().map(Ball::getSize).collect(Collectors.toList()),
                balls.stream().map(Ball::getSize).collect(Collectors.toList()));
    }
}
