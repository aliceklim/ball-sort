import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class BasketTest {

    @Test
    void testFillInBasket() {
        Basket basket = new Basket();
        basket.fillInBasket(10);
        int actualNum = basket.getBalls().size();
        int expectedNum = 10;
        Assertions.assertEquals(expectedNum, actualNum);
    }
}
