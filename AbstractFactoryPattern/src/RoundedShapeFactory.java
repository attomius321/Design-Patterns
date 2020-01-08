public class RoundedShapeFactory extends SuperFactory {

    @Override
    public Shape getShape(String shapeType) {
        if(shapeType.equalsIgnoreCase("RECTANGLE")){

            return new RoundedRectangle();

        } else if(shapeType.equalsIgnoreCase("SQUARE")){

            return new RoundedSquare();

        }else if(shapeType.equalsIgnoreCase("CIRCLE")){

            return new Circle();

        } else return null;

    }

}
