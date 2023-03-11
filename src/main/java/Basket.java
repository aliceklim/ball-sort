import entity.*;
import entity.constants.BallType;
import entity.constants.Color;
import entity.constants.Size;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Class provides methods for creating of balls in basket, listing and clearing basket contents
 */
public class Basket {

    @Getter
    private List<Ball> balls = new ArrayList<>();

    /**
     * The method fills in the basket with random balls
     *
     * @param num      number of balls to be generated
     */
    protected void fillInBasket(int num) {
        Random rand = new Random();
        for (int i = 0; i < num; i++) {
            int ballType = rand.nextInt(6);
            Ball ball;
            switch (ballType) {
                case 0:
                    ball = new Ball(BallType.VOLLEYBALL, Size.MEDIUM, Color.YELLOW);
                    break;
                case 1:
                    ball = new Ball(BallType.GOLF, Size.SMALL, Color.WHITE);
                    break;
                case 2:
                    ball = new Ball(BallType.BOWLING, Size.BIG, Color.BLACK);
                    break;
                case 3:
                    ball = new Ball(BallType.TENNIS, Size.SMALL, Color.GREEN);
                    break;
                case 4:
                    ball = new Ball(BallType.FOOTBALL, Size.BIG, Color.WHITE);
                    break;
                case 5:
                    ball = new Ball(BallType.BASKETBALL, Size.BIG, Color.BROWN);
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + ballType);
            }
            balls.add(ball);
        }
    }

    public void listContents(){
        for (Ball ball : balls) {
            System.out.println(ball.toString());
        }
    }

    public void clearBasket(){
        balls.clear();
    }
}
