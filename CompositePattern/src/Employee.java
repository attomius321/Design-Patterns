import java.util.ArrayList;
import java.util.List;

//composite pattern actor class;
//with this pattern you can create a class that contains group of its own objects;

public class Employee {

    private String name;
    private String dept;
    private int salary;
    private List<Employee> subordinates;

    public Employee(String newName, String newDept, int newSalary){

        this.name = newName;
        this.dept = newDept;
        this.salary = newSalary;
        subordinates = new ArrayList<Employee>();

    }

    public void add(Employee e){

        subordinates.add(e);

    }

    public String getName(){

        return name;

    }

    public String getDept(){

        return dept;

    }

    public int getSalary(){

        return salary;

    }

    public void remove(Employee e){

        subordinates.remove(e);

    }

    public List<Employee> getSubordinates(){

        return subordinates;

    }

    public String toString(){

        return ("Employee : [ Name: " + getName() + ", dept: " + getDept() + ", salary: " + getSalary() + " ]");

    }

}
