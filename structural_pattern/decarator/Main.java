package structural_pattern.decarator;

import structural_pattern.decarator.absdecarators.MilkDecarator;
import structural_pattern.decarator.absdecarators.SugarDecarator;
import structural_pattern.decarator.concrete.Espresso;
import structural_pattern.decarator.icoffee.Cofee;

public class Main {
    public static void main(String[] args) {
        Cofee coffee = new Espresso();
        coffee = new MilkDecarator(coffee);
        coffee = new SugarDecarator(coffee);
        System.out.println(coffee.getCost());

    }
}
