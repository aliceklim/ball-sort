import balls.*;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Class provides different sorting kinds for balls
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
                    ball = new Volleyball();
                    break;
                case 1:
                    ball = new Golf();
                    break;
                case 2:
                    ball = new Bowling();
                    break;
                case 3:
                    ball = new Tennis();
                    break;
                case 4:
                    ball = new Football();
                    break;
                case 5:
                    ball = new Basketball();
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
}
