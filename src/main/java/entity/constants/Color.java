package entity.constants;

public enum Color {

    WHITE("White"), BLACK("Black"), YELLOW("Yellow"), BROWN("Brown"), GREEN("Green"), ;

    private final String color;

    Color (String color){
        this.color = color;
    }

    @Override
    public String toString() {
        return this.color;
    }
}
