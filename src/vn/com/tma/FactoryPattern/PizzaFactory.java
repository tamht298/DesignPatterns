package vn.com.tma.FactoryPattern;

public class PizzaFactory {

    public Pizza getPizza(PizzaType pizzaType) {
        if (pizzaType.equals(null)) return null;

        Pizza pizza = null;
        switch (pizzaType) {
            case CHEESE: {
                pizza = new CheesePizza();
            }
            case VEGGIE: {
                pizza = new VeggiePizza();
            }

        }
        return pizza;
    }
}
