public class Tabacco implements Visitable{

    private double price;

    public Tabacco(double item){

        price = item;

    }

    public double getPrice(){

        return price;

    }

    @Override
    public double accept(Visitor visitor) {

        return visitor.visit(this);

    }

}
