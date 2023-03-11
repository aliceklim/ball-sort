package entity;

import entity.constants.BallType;
import entity.constants.Color;
import entity.constants.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Ball {

    BallType ballType;
    Size size;
    Color color;

    @Override
    public String toString() {
        return "Ball { " +
                "ballType = " + ballType +
                ", size = " + size +
                ", color = " + color +
                '}';
    }
}
