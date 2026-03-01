package structural_pattern.decarator.absdecarators;

import structural_pattern.decarator.icoffee.Cofee;

public class MilkDecarator extends CoffeDecarator {
    protected Cofee coffee;

    public MilkDecarator(Cofee coffee) {
        super(coffee);
    }

    public String getDescription() {
        return coffee.getDescription();
    }

    public double getCost() {
        return coffee.getCost() + 0.50;
    }
}
