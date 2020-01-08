public class Dog implements Animal {

    public Dog(){

        System.out.println("Dog is made");

    }

    @Override
    public Animal makeCopy() {

        System.out.println("Dog is being made");

        Animal doggo = null;

        try {

            doggo = (Dog) super.clone();

        }catch (CloneNotSupportedException e){

            e.printStackTrace();

        }

        return doggo;

    }

    public String toString(){

        return "This is a dogggooo";

    }
}
