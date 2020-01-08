//with visitor we change the executing algorithm of an element class . Think like different roles that want something different from a class. They come over, don't change the
//structure of the actual classes , but do stuffs with infos from them, and then they leave.


public class Demo {

    public static void main(String[] args){

            TaxVisitor taxCalc = new TaxVisitor();
            HolidayTaxVisitor holidayTaxVisitor = new HolidayTaxVisitor();

            Liquor liq = new Liquor(32.22);
            Tabacco tab = new Tabacco( 40.00);
            Necessity milk = new Necessity(20.12);

            System.out.println(milk.accept(taxCalc));
            System.out.println(tab.accept(holidayTaxVisitor));

    }

}
