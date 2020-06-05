package observer;

public interface ICanalYT {
    void attach(ISubscriptor observer);
    void deAttach(ISubscriptor observer);
    void notifyObserver(Video v);
}
