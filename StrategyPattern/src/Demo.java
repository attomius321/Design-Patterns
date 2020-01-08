//we created Strategy interface dfining an action and concrete strategy classes implemeting
// the Strategy interface.
// Context is where we use a Strategy
// Demo will use Context and strategy objects defined in Context

public class Demo {

    public static void main(String[] args){

        Context context = new Context(new OperationAdd());

        System.out.println("10 + 5 = " + context.executeStrategy(10,5));

        context = new Context(new OperationMultiply());

        System.out.println("10 * 5 = " + context.executeStrategy(10,5));

        context = new Context(new OperationSubstract());

        System.out.println("10 - 5 = " + context.executeStrategy(10,5));

        context = new Context(new OperationDIvide());

        System.out.println("10 / 5 = " + context.executeStrategy(10,5));

    }

}
