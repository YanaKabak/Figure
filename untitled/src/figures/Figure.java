package figures;

public class Figure {

    private double square;
    private String color;

    public Figure(double square, String color) {
        this.square = square;
        this.color = color;
    }

    public void draw() {
        System.out.println(toString());
    }

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "square: " + square + " sq.units" + ", color: " + color;
    }
}


