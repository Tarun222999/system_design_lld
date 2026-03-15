package lldquestions.snakeandfood.fooditem;

abstract public class FoodItem {
    protected int row, column;
    protected int points;

    protected FoodItem(int row, int col) {
        this.row = row;
        this.column = col;
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    public int getPoints() {
        return points;
    }
}
