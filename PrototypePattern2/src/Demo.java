public class Demo {

    public static void main(String[] args){

        CloneFactory animalMaker = new CloneFactory();

        Sheep sally = new Sheep();

        Sheep clonedSally = (Sheep) animalMaker.getClone(sally);

        System.out.println(sally);

        System.out.println(clonedSally);

        System.out.println(System.identityHashCode(sally));

        System.out.println(System.identityHashCode(clonedSally));

        Dog doggo = new Dog();

        Dog clonedDoggo = (Dog) animalMaker.getClone(doggo);

        System.out.println(doggo);

        System.out.println(clonedDoggo);

        System.out.println(System.identityHashCode(doggo));

        System.out.println(System.identityHashCode(clonedDoggo));

    }

}
