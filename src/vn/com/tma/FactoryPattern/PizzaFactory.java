package vn.com.tma.FactoryPattern;

public class PizzaFactory {

    public Pizza getPizza(PizzaType pizzaType) {
        if(pizzaType.equals(null)) return null;
        switch (pizzaType) {
            case CHEESE: {
                return new CheesePizza();
            }
            case VEGGIE: {
                return new VeggiePizza();
            }

        }
        return null;
    }
}
