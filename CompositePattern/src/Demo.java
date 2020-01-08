public class Demo {

    public static void main(String[] args){

        Employee CEO = new Employee("John", "CEO", 30000);

        Employee headSales = new Employee("Mirela", "Head Sales", 20000);

        Employee headMarketing = new Employee("Michel","Head Marketing", 15000);

        Employee clerk1 = new Employee("Laura","Marketing", 10000);
        Employee clerk2 = new Employee("Bob","Marketing", 10000);

        Employee salesExecutive1 = new Employee("Richard","Sales", 10000);
        Employee salesExecutive2 = new Employee("Rob","Sales", 10000);

        CEO.add(headSales); //headSales subordinate of CEO
        CEO.add(headMarketing);

        headSales.add(salesExecutive1);
        headSales.add(salesExecutive2);

        headMarketing.add(clerk1);
        headMarketing.add(clerk2);

        System.out.println(CEO); //printed CEO , now we go into the list of CEO

        //work as an hierarchy
        //as CEO you have power over all other Subordinates

        for(Employee headEmployee : CEO.getSubordinates()){

            System.out.println("--" + headEmployee);

            for(Employee pieleaPulii : headEmployee.getSubordinates()){

                System.out.println("----" + pieleaPulii);

            }

        }

    }

}
