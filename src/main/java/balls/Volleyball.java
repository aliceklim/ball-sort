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
public class Volleyball extends Ball{

    BallType ballType = BallType.VOLLEYBALL;
    Size size = Size.MEDIUM;
    Color color = Color.YELLOW;
    String volleyBallType;

    @Override
    public String toString() {
        return "Ball { " +
                "ballType = " + ballType +
                ", size = " + size +
                ", color = " + color +
                '}';
    }
}
