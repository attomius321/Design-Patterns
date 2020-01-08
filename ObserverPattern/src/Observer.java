public abstract class Observer {

    public Subject subject;
    public abstract void update();
    public abstract void attach(Subject subject);
    public abstract void detach(Subject subject);

}
