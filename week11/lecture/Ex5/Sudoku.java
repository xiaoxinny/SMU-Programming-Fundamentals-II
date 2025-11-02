public class Sudoku {
    public static void main(String[] args) {
        int[][] sudoku = new int[3][3];
        int num = 0;
        for (int[] sudokuList : sudoku) {
            ++num;
            for (int j = 0; j < sudokuList.length; j++) {
                sudokuList[j] = num;
                ++num;
            }
        }
    }
}
