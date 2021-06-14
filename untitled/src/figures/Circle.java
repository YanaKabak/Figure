package figures;

public class Circle extends Figure{

    private double radius;
    public Circle(double square, String color, double radius) {
        super(square, color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public void draw(){
        System.out.println("figures.Figure: " + getClass().getName() + ", " + toString() + ", radius: " + radius + "units");
    }
}
