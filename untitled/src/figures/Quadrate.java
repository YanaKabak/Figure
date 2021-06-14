package figures;

public class Quadrate extends Figure{

    private double sideLength;

    public Quadrate(double square, String color, double sideLength) {
        super(square, color);
        this.sideLength = sideLength;
    }

    public double getSideLength() {
        return sideLength;
    }

    public void setSideLength(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public void draw(){
        System.out.println("figures.Figure: " + getClass().getName() + ", " + toString() + ", side length: " + sideLength + "units");
    }
}
