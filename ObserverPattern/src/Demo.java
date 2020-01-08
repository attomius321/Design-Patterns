//Observer pattern uses three actor classes. Subject Observer and Client.
//Subject is an object having methods to attach and detach observers to a client object.
//We created an abstract class Observer and a concrete class Subject that is using class
//Observer.
//Demo use Subject an concrete class object;


public class Demo {
    public static void main(String[] args){

        Subject subject = new Subject();

        OctalObserver octalObserver = new OctalObserver(subject);
        octalObserver.attach(subject);

        BinaryObserver binaryObserver = new BinaryObserver(subject);
        binaryObserver.attach(subject);

        HexObserver hexObserver = new HexObserver(subject);
        hexObserver.attach(subject);

        System.out.println("First state change: 15");
        subject.setState(15);
        System.out.println("Second state change: 10023223");
        subject.setState(10023223);

    }
}
