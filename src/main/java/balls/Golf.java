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
public class Golf extends Ball {

    BallType ballType = BallType.GOLF;
    Size size = Size.SMALL;
    Color color = Color.WHITE;
    String golfType;

    @Override
    public String toString() {
        return "Ball { " +
                "ballType = " + ballType +
                ", size = " + size +
                ", color = " + color +
                '}';
    }
}
