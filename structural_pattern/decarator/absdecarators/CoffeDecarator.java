package structural_pattern.decarator.absdecarators;

import structural_pattern.decarator.icoffee.Cofee;

public abstract class CoffeDecarator implements Cofee {
    private Cofee coffee;

    public CoffeDecarator(Cofee coffee) {
        this.coffee = coffee;
    }

    public String getDescription() {
        return coffee.getDescription();
    }

    public double getCost() {
        return coffee.getCost();
    }
}
