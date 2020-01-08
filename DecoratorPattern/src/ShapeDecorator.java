public abstract class ShapeDecorator implements Shape {

    protected Shape shape = null;

    public ShapeDecorator(Shape decoratedShape){

        this.shape = decoratedShape;

    }

    public void draw(){

        shape.draw();

    }

}
