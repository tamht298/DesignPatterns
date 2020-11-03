package vn.com.tma.ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class JD implements Subject {
    List<Observer> observers;
    String message;
    String projectTitle;

    public JD(String projectTitle) {
        this.projectTitle = projectTitle;
        observers = new ArrayList<>();

    }

    @Override
    public void register(Observer observer) {
        if(observer ==null){
            throw new NullPointerException();
        }
        if(!observers.contains(observer)){
            observers.add(observer);
        }
    }

    @Override
    public void remove(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer: observers){
            observer.update();
        }
    }

    @Override
    public String getUpdateInfo() {
        return this.message;
    }

    void updateJD(String message){
        this.message=message;
        System.out.println("Project <"+this.projectTitle+"> Updated Info: " + this.message);
        notifyObservers();

    }
}
