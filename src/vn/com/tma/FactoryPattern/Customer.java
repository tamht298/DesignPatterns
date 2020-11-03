package vn.com.tma.FactoryPattern;

public class Customer {
    private String name;

    private Pizza pizza;

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
        this.pizza = pizza;
        System.out.println(quantity + " pieces of " + this.pizza.getPizzaTypeName() + " for " + this.name);
    }
}
