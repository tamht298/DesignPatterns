package vn.com.tma.DelegatePattern;

public class PlanB implements MarketingPlan{
    @Override
    public void promoteProduct() {
        System.out.println("Plan B: Invite Rapper-Comedy Actor Wowy raps a song");
    }
}
