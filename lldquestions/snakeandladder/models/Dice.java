package lldquestions.snakeandladder.models;

public class Dice {
    private int minValue;
    private int maxValue;

    public Dice(int minValue, int maxValue) {
        this.maxValue = maxValue;
        this.minValue = minValue;
    }

    public int roll() {
        return (int) (Math.random() * (maxValue - minValue + 1) + minValue);
    }
}
