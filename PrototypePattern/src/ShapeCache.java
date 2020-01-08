import java.util.Hashtable;

public class ShapeCache {

    private static Hashtable<String, Shape> shapeMap = new Hashtable<String, Shape>();

    public static Shape getShape(String shapeId){

        Shape cachedShape = shapeMap.get(shapeId);

        return (Shape) cachedShape.clone();

    }

    //add the existing shapes in the table : (here we have what is cloneable)

    public static void loadCache() {

        Square square = new Square();
        square.setId("1");
        shapeMap.put(square.getId(),square);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("2");
        shapeMap.put(rectangle.getId(),rectangle);

    }

}
