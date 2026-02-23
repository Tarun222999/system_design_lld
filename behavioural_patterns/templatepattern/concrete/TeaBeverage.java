package templatepattern.concrete;

import templatepattern.template.Beverage;

public class TeaBeverage extends Beverage {
    public void brew() {
        System.out.println("Brewing tea");
    }

    public void addCondiments() {
        System.out.println("Adding lemon");
    }
}
