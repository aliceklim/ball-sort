package entity.constants;

public enum BallType {

    BASKETBALL("Basketball"), BOWLING("Bowling"), FOOTBALL("Football"), GOLF("Golf"), TENNIS("Tennis"),
    VOLLEYBALL("Volleyball");

    private final String type;

    BallType (String type){
        this.type = type;
    }

    @Override
    public String toString() {
        return this.type;
    }
}