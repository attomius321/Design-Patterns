import java.text.DecimalFormat;

public class HolidayTaxVisitor implements Visitor {

    DecimalFormat df = new DecimalFormat("#.##");

    public HolidayTaxVisitor(){

    }


    @Override
    public double visit(Liquor liquor) {
        System.out.println("Liquor item: Price with Tax");
        return Double.parseDouble(df.format((liquor.getPrice() + liquor.getPrice())));
    }

    @Override
    public double visit(Tabacco tabacco) {
        System.out.println("Liquor item: Price with Tax");
        return Double.parseDouble(df.format((tabacco.getPrice() + tabacco.getPrice())));
    }

    @Override
    public double visit(Necessity necessity) {
        System.out.println("Liquor item: Price with Tax");
        return Double.parseDouble(df.format((necessity.getPrice() + necessity.getPrice())));
    }

}

