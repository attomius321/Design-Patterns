//Here we change the context , which doOperation we will use at RunTime.
//we define a Strategy here

public class Context {

    private Strategy strategy;

    public Context(Strategy strategy){

        this.strategy = strategy;

    }

    public int executeStrategy(int num1, int num2){

        return strategy.doOperation(num1,num2);

    }

}
