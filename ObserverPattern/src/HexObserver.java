public class HexObserver extends Observer {

    public HexObserver(Subject subject){
        this.subject=subject;
    }



    @Override
    public void update() {
        System.out.println("Hex String: " + Integer.toHexString(subject.getState()));
    }

    @Override
    public void attach(Subject subject) {
        this.subject.attach(this);
    }

    @Override
    public void detach(Subject subject) {
        this.subject.detach(this);
    }
}
