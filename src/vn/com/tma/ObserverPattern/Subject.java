package vn.com.tma.ObserverPattern;

public interface Subject {

    public void register(Observer observer);
    public void remove(Observer observer);
    public void notifyObservers();
    public String getUpdateInfo();
}
