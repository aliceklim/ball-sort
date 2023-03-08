import sort.TreeSort;
import balls.*;
import comparators.ColorComparator;
import comparators.SizeComparator;
import comparators.TypeComparator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TreeSortTest {
    TreeSort sort;
    Comparator<Ball> comparator;
    private Basket basket;
    private Ball ball1;
    private Ball ball2;
    private Ball ball3;
    private Ball ball4;
    private Ball ball5;
    private Ball ball6;


    @BeforeEach
    void setUp(){
        sort = new TreeSort();
        basket = new Basket();
        List<Ball> balls = basket.getBalls();
        ball1 = new Basketball();
        ball2 = new Football();
        ball3 = new Golf();
        ball4 = new Tennis();
        ball5 = new Volleyball();
        ball6 = new Bowling();
        balls.add(ball1);
        balls.add(ball2);
        balls.add(ball3);
        balls.add(ball4);
        balls.add(ball5);
        balls.add(ball6);
    }

    @Test
    void testQuickSortByColor() {
        List<Ball> expected = new ArrayList<>();
        expected.add(ball2);
        expected.add(ball3);
        expected.add(ball6);
        expected.add(ball5);
        expected.add(ball1);
        expected.add(ball4);

        sort.sort(basket.getBalls(), new ColorComparator());
        Assertions.assertIterableEquals(expected, basket.getBalls());
    }

    @Test
    void testQuickSortByType() {
        List<Ball> expected = new ArrayList<>();
        expected.add(ball1);
        expected.add(ball6);
        expected.add(ball2);
        expected.add(ball3);
        expected.add(ball4);
        expected.add(ball5);

        sort.sort(basket.getBalls(), new TypeComparator());
        Assertions.assertIterableEquals(expected, basket.getBalls());
    }

    @Test
    void testQuickSortBySize() {
        List<Ball> expected = new ArrayList<>();
        expected.add(ball3);
        expected.add(ball4);
        expected.add(ball5);
        expected.add(ball1);
        expected.add(ball2);
        expected.add(ball6);

        sort.sort(basket.getBalls(), new SizeComparator());
        Assertions.assertIterableEquals(expected, basket.getBalls());
    }
}
