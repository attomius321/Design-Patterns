public class OctalObserver extends Observer {

    public OctalObserver(Subject subject){
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
        System.out.println("Octal string : " + Integer.toOctalString(subject.getState()));
    }
}
