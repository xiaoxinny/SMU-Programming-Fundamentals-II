package Q3;

import java.util.Random;

public class Minesweeper {

    public char[][] board;

    public Minesweeper(int numRows, int numColumns, int numBombs) {
        board = new char[numRows][numColumns];
        placeBombs(numBombs);
        countBombs();
    }

    private void countBombs() {
        int rows = board.length;
        int cols = board[0].length;

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {

                if (board[r][c] == 'B') {

                    for (int i = r - 1; i <= r + 1; i++) {
                        for (int j = c - 1; j <= c + 1; j++) {

                            if (i < 0 || i >= rows || j < 0 || j >= cols) {
                                continue;
                            }

                            if (i == r && j == c) {
                                continue;
                            }

                            if (board[i][j] != 'B') {
                                if (board[i][j] == '0' || board[i][j] == ' ') {
                                    board[i][j] = '1';
                                } else {
                                    board[i][j]++;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    private void placeBombs(int numBombs) {
        Random rand = new Random();
        int rows = board.length;
        int cols = board[0].length;

        int bombsPlaced = 0;

        while (bombsPlaced < numBombs) {
            int r = rand.nextInt(rows);
            int c = rand.nextInt(cols);

            if (board[r][c] != 'B') {
                board[r][c] = 'B';
                bombsPlaced++;
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (char[] row : board) {
            sb.append("| ");
            for (char cell : row) {
                if (cell == '0' || cell == ' ') {
                    sb.append(". "); 
                }else {
                    sb.append(cell).append(' ');
                }
            }
            sb.append("|\n");
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Minesweeper minesweeper = new Minesweeper(4, 6, 2);
        System.out.println(minesweeper.toString());
    }
}
