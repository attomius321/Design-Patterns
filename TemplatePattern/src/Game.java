public abstract class Game {

    abstract void initialize();
    abstract void startPlay();
    abstract void endPlay();

    //exposes defined way/template to execute its methods
    //template method : it's sublcases can override the method implementation as per need
    //but the invocation is to be in the same way as defined by an abstract class;

    public final void play(){

        initialize();

        startPlay();

        endPlay();

    }

}
