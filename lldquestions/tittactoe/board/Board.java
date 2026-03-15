package lldquestions.tittactoe.board;

public class Board {
    public int n, m;
    public int[][] grid;

    public Board(int n, int m) {
        this.n = n;
        this.m = m;
        grid = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                grid[i][j] = -1;
            }
        }
    }

    public boolean isValid(int i, int j) {
        return i >= 0 && i < n && j >= 0 && j < m;
    }

    public void throwErrorIfNotValid(int i, int j) {
        if (!isValid(i, j)) {
            throw new IndexOutOfBoundsException("Invalid grid position: (" + i + ", " + j + ")");
        }
    }

    public boolean isEmpty(int i, int j) {
        return isValid(i, j) && grid[i][j] == -1;
    }

    public int getSymbol(int i, int j) {
        throwErrorIfNotValid(i, j);
        return grid[i][j];
    }

    public void putSymbol(int i, int j, int symbol) {
        throwErrorIfNotValid(i, j);
        grid[i][j] = symbol;
    }

    public void display() {

        // Print column numbers
        System.out.print("  ");
        for (int j = 0; j < m; j++) {
            System.out.print(j + " ");
        }
        System.out.println();

        for (int i = 0; i < n; i++) {

            // Print row number
            System.out.print(i + " ");

            for (int j = 0; j < m; j++) {
                System.out.print(grid[i][j] + " ");
            }

            System.out.println();
        }
    }
}
