public class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    public void draw(){

        shape.draw();
        setRedBorder(shape);

    }

    private void setRedBorder(Shape decoratedShape){

        System.out.println("This shape border is red");

    }
}
