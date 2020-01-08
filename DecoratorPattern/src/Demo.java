//new functionality for already existent objects without changing it's structure;


public class Demo {

    public static void main(String[] args){

        Shape circle = new Circle();

        Shape redCircle = new RedShapeDecorator(new Circle()); //Circle wrapped in Red shape decorator

        Shape redRectangle = new RedShapeDecorator(new Rectangle());

        circle.draw();

        redCircle.draw();

        redRectangle.draw();

    }
}
