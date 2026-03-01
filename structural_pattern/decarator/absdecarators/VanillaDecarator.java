package structural_pattern.decarator.absdecarators;

import structural_pattern.decarator.icoffee.Cofee;

public class VanillaDecarator extends CoffeDecarator {
    protected Cofee coffee;

    public VanillaDecarator(Cofee coffee) {
        super(coffee);
    }

    public String getDescription() {
        return coffee.getDescription();
    }

    public double getCost() {
        return coffee.getCost() + 0.60;
    }
}
