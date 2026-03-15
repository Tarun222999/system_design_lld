package lldquestions.snakeandfood.fooditem.concrete.normal;

import lldquestions.snakeandfood.fooditem.FoodItem;

public class NormalFoodItem extends FoodItem {
    public NormalFoodItem(int row, int col) {
        super(row, col);
        this.points = 1;
    }
}
