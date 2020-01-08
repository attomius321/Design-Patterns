public class FactoryFactory {

     public static SuperFactory getFactory(boolean rounded){

         if(rounded){

             return new RoundedShapeFactory();

         } else {

             return new ShapeFactory();

         }
     }

}
