import java.text.DecimalFormat;

public class TaxVisitor implements Visitor{

    DecimalFormat df = new DecimalFormat("#.##");

    public TaxVisitor(){

    }


    @Override
    public double visit(Liquor liquor) {
        System.out.println("Liquor item: Price with Tax");
        return Double.parseDouble(df.format((liquor.getPrice() * .18) + liquor.getPrice()));
    }

    @Override
    public double visit(Tabacco tabacco) {
        System.out.println("Tabacco item: Price with Tax");
        return Double.parseDouble(df.format((tabacco.getPrice() * .32) + tabacco.getPrice()));
    }

    @Override
    public double visit(Necessity necessity) {
        System.out.println("Necessity item: Price with Tax");
        return Double.parseDouble(df.format((necessity.getPrice() * .15) + necessity.getPrice()));
    }
}
