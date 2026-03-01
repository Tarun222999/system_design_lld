package structural_pattern.decarator.concrete;

import structural_pattern.decarator.icoffee.Cofee;

public class Espresso implements Cofee {
    public String getDescription() {
        return "Espresso";
    }

    public double getCost() {
        return 2.00;
    }
}
