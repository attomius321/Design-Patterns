public class ShapeFactory extends SuperFactory {
    @Override
    public Shape getShape(String shapeType) {
        if(shapeType.equalsIgnoreCase("RECTANGLE")){

            return new Rectangle();

        } else if(shapeType.equalsIgnoreCase("SQUARE")){

            return new Square();

        }else return null;
    }
}
