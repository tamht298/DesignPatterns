package vn.com.tma.FactoryPattern;

public class Customer {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Customer(String name) {
        this.name = name;

    }

    public void callPizza(Pizza pizza, int quantity) {
        System.out.println(quantity + " pieces of " + pizza.getPizzaTypeName() + " for " + this.name);
    }
}
