package vn.com.tma.ObserverPattern;

public class ObserverMain {
    public static void main(String[] args) {
//        init observers
        Observer candidate1 = new Candidate("Tam");
        Observer candidate2 = new Candidate("Tam2");
        Observer candidate3 = new Candidate("Tam3");

//init subject
        JD jd1 = new JD("OmniVista Dev1");
        JD jd2 = new JD("OmniVista Dev2");

//        register observers to subject
        candidate1.setSubject(jd1);


        candidate2.setSubject(jd2);
        candidate3.setSubject(jd2);

        jd1.register(candidate1);
        jd2.register(candidate2);
        jd2.register(candidate3);

        jd1.updateJD("Project's name");
        jd2.updateJD("Change team size");
    }
}
