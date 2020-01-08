public class Demo {

    public static void main(String[] args){

        SuperFactory shapeFactory = FactoryFactory.getFactory(false);

        Shape rectangle = shapeFactory.getShape("RECTANGLE");

        Shape square = shapeFactory.getShape("SQUARE");

        rectangle.draw();

        square.draw();

        SuperFactory roundedShapeFactory = FactoryFactory.getFactory(true);

        Shape roundedRectangle = roundedShapeFactory.getShape("RECTANGLE");

        Shape roundedSquare = roundedShapeFactory.getShape("SQUARE");

        Shape circle = roundedShapeFactory.getShape("CIRCLE");

        roundedRectangle.draw();

        roundedSquare.draw();

        circle.draw();

    }

}

