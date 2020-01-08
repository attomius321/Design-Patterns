public class AbstractFactoryDemo {

    public static void main(String[] args){
    //we use Factory producer to chose in between Factories;
        AbstractFactory shapeFactory = FactoryProducer.getFactory(false);

        Shape shape1 = shapeFactory.getShape("RECTANGLE");

        shape1.draw();

        Shape shape2 = shapeFactory.getShape("SQUARE");

        shape2.draw();

        AbstractFactory shapeFactory2 = FactoryProducer.getFactory(true);

        Shape shape3 = shapeFactory2.getShape("RECTANGLE");

        shape3.draw();

        Shape shape4 = shapeFactory2.getShape("SQUARE");

        shape4.draw();

    }

}
