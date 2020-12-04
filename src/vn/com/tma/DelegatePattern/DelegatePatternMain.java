package vn.com.tma.DelegatePattern;

public class DelegatePatternMain {

    public static void main(String[] args) {
        PlanTest planTest = new PlanTest();
//        Delegate to plan A
        MarketingPlan planA = new PlanA();
        planTest.setMarketingPlan(planA);
        planTest.promoteProduct();


//        Delegate to Plan B
        MarketingPlan planB = new PlanB();
        planTest.setMarketingPlan(planB);
        planTest.promoteProduct();
    }

}
