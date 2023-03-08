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
public abstract class Ball {

    BallType ballType;
    Size size;
    Color color;


}
