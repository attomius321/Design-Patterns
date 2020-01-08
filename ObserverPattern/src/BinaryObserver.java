public class BinaryObserver extends Observer {

    public BinaryObserver(Subject subject){
        this.subject = subject;
    }

    public void attach(Subject subject){
        this.subject.attach(this);
    }

    public void detach(Subject subject){
        this.subject.detach(this);
    }

    @Override
    public void update() {
        System.out.println("Binary String : " + Integer.toBinaryString(subject.getState()));
    }
}
