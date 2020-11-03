package vn.com.tma.ObserverPattern;

public class Candidate implements Observer {

    private String name;
    private Subject subject;

    public Candidate(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        String updateInfo = subject.getUpdateInfo();

        System.out.println("Hey "+ this.name +"! JD has been updated with info: " + updateInfo);
    }

    @Override
    public void setSubject(Subject subject) {
        this.subject = subject;
    }
}
