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
public class Tennis extends Ball {

    BallType ballType = BallType.TENNIS;
    Size size = Size.SMALL;
    Color color = Color.GREEN;
    String tennisType;

    @Override
    public String toString() {
        return "Ball { " +
                "ballType = " + ballType +
                ", size = " + size +
                ", color = " + color +
                '}';
    }
}
