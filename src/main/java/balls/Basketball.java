package balls;

import balls.constants.BallType;
import balls.constants.Color;
import balls.constants.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Basketball extends Ball {

    BallType ballType = BallType.BASKETBALL;
    Size size = Size.BIG;
    Color color = Color.BROWN;
    String basketBallType;

    @Override
    public String toString() {
        return "Ball { " +
                "ballType = " + ballType +
                ", size = " + size +
                ", color = " + color +
                '}';
    }
}
