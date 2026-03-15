package lldquestions.snakeandfood.foodFactory;

import lldquestions.snakeandfood.fooditem.FoodItem;
import lldquestions.snakeandfood.fooditem.concrete.bonus.BonusFoodItem;
import lldquestions.snakeandfood.fooditem.concrete.normal.NormalFoodItem;

public class FoodFactor {
    // Static method to create a food item at a given position and type
    public static FoodItem createFood(int[] position, String type) {
        if ("bonus".equals(type)) {
            return new BonusFoodItem(position[0], position[1]); // Create bonus food
        }
        return new NormalFoodItem(position[0], position[1]); // Default to normal food
    }
}