package figures;

public class Trapeze extends Figure{

    private double middleLine;

    public Trapeze(double square, String color, double middleLine) {
        super(square, color);
        this.middleLine = middleLine;
    }

    public double getMiddleLine() {
        return middleLine;
    }

    public void setMiddleLine(double middleLine) {
        this.middleLine = middleLine;
    }

    @Override
    public void draw(){
        System.out.println("figures.Figure: " + getClass().getName() + ", " + toString() + ", middle line: " + middleLine + "units");
    }
}
