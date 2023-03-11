package entity.constants;

public enum Size {

    SMALL("Small"), MEDIUM("Medium"), BIG("Big");

    private final String size;

    Size(String size){
        this.size = size;
    }

    @Override
    public String toString() {
        return this.size;
    }
}
