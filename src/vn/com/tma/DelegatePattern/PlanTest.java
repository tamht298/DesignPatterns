package vn.com.tma.DelegatePattern;

public class PlanTest implements MarketingPlan {

    //    private MarketingPlan marketingPlan = new PlanA();
    private MarketingPlan marketingPlan;


    @Override
    public void promoteProduct() {
        try {
            if (marketingPlan != null)
                this.marketingPlan.promoteProduct();
        } finally {
            System.out.println("Done Test");
        }
    }

    public void setMarketingPlan(MarketingPlan anotherPlan) {
        this.marketingPlan = anotherPlan;
    }
}
