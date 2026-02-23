package templatepattern.concrete;

import templatepattern.template.Beverage;

public class CoffeBeverage extends Beverage {

    public void brew() {
        System.out.println("Brewing Cofee");
    }

    public void addCondiments() {
        System.out.println("Adding sugar and milk");
    }
}
