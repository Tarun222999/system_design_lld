package templatepattern;

import templatepattern.concrete.CoffeBeverage;
import templatepattern.concrete.TeaBeverage;
import templatepattern.template.Beverage;

public class Main {
    public static void main(String[] args) {
        Beverage coffee = new CoffeBeverage();
        Beverage tea = new TeaBeverage();
        System.out.println("Making cofee...");
        coffee.prepareRecipe();
        System.out.println("Making tea");
        tea.prepareRecipe();
    }
}
