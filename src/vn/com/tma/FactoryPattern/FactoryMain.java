package vn.com.tma.FactoryPattern;

public class FactoryMain {
    public static void main(String[] args) {
        Customer cus1 = new Customer("Tam");
        cus1.callPizza(PizzaFactory.getPizza(PizzaType.CHEESE), 1);

        Customer cus2 = new Customer("Tam2");
        cus2.callPizza(PizzaFactory.getPizza(PizzaType.VEGGIE), 2);
    }
}
