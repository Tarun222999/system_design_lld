package structural_pattern.decarator.concrete;

import structural_pattern.decarator.icoffee.Cofee;

public class Capuccino implements Cofee {
    public String getDescription() {
        return "Cappucino";
    }

    public double getCost() {
        return 3.00;
    }
}
