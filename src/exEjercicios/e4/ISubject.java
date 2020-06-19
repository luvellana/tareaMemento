package observer_4;

public interface ISubject {
    void attach(IObserver observer);
    void deAttach(IObserver observer);
    void notifyObserver(String tipo, String msg);
}
