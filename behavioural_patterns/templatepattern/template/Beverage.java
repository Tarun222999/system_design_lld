package templatepattern.template;

public abstract class Beverage {
    // make sure the alogorith steps are followed
    public final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    void boilWater() {
        System.out.println("Boiling water");
    }

    void pourInCup() {
        System.out.println("Pouring into cup");
    }

    public abstract void brew();

    public abstract void addCondiments();
}
