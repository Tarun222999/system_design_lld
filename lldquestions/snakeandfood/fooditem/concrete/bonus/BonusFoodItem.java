package lldquestions.snakeandfood.fooditem.concrete.bonus;

import lldquestions.snakeandfood.fooditem.FoodItem;

public class BonusFoodItem extends FoodItem {
    public BonusFoodItem(int row, int column) {
        super(row, column);
        this.points = 3;
    }
}
