package figures;

public class Triangle extends Figure{

    private double hypotenuse;

    public Triangle(double square, String color, double hypotenuse) {
        super(square, color);
        this.hypotenuse = hypotenuse;
    }

    public double getHypotenuse() {
        return hypotenuse;
    }

    public void setHypotenuse(double hypotenuse) {
        this.hypotenuse = hypotenuse;
    }

    @Override
    public void draw(){
        System.out.println("figures.Figure: " + getClass().getName() + ", " + toString() + ", hypotenuse: " + hypotenuse + "units");
    }
}
