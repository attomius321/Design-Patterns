//An abstract class exposes defined ways/templates to execute its methods. The template
//method is defined as final so it can't be overridden;

public class Demo {

    public static void main(String[] args){

        Game game = new Cricket();
        game.play();
        game = new Football();
        game.play();

    }

}
