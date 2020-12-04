package vn.com.tma.DelegatePattern;

public class PlanA implements MarketingPlan{
    @Override
    public void promoteProduct() {
        System.out.println("Plan A: Mail campaign following by company's cost-saving policies");
    }
}
