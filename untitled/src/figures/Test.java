package figures;

import java.util.Random;

public class Test {

    private  final static int FIGURE_COUNTER = 4;
    private final static int A = 0;
    private final static int B = 10;
    public static void main(String args[]){

        Figure[] figures = new Figure[A + (int)(Math.random() * B)];
        Object obj = null;
        Random random = new Random();
        for (int i=0; i<figures.length; i++){
            int randomNumber = random.nextInt(FIGURE_COUNTER);
            switch (randomNumber) {
                case 0:
                    figures[i] = new Quadrate(Math.random(), "blue", Math.random());
                    break;
                case 1:
                    figures[i] = new Triangle(Math.random(), "black", Math.random());
                    break;
                case 2:
                    figures[i] = new Circle(Math.random(),"red", Math.random());
                    break;
                case 3:
                    figures[i] = new Trapeze(Math.random(), "green", Math.random());
                    break;
            }
        }
        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
