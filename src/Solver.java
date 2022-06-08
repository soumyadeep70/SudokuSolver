import java.util.ArrayList;

public class Solver {

    static ArrayList<Sudoku> solved;

    private static ArrayList<Integer> probableNumbers(Sudoku input, int row, int col) {
        boolean[] found = new boolean[10];
        for (int i = 0; i < 9; i++) {
            found[input.getNumber(row, i)] = true;
        }
        for (int i = 0; i < 9; i++) {
            found[input.getNumber(i, col)] = true;
        }
        int tmp_row = 3*(row/3), tmp_col = 3*(col/3);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                found[input.getNumber(tmp_row+i, tmp_col+j)] = true;
            }
        }
        ArrayList<Integer> validNumbers = new ArrayList<>();
        for (int i = 1; i <= 9; i++) {
            if (!found[i]) validNumbers.add(i);
        }
        return validNumbers;
    }

    private static void fill (Sudoku input, int index) {
        if (index == 81) {
            Sudoku solvedInstance = new Sudoku(input.getBoard());
            solved.add(solvedInstance);
            return;
        }
        int row = index / 9, col = index % 9;
        if (input.getNumber(row, col) != 0) {
            fill(input, index+1);
            return;
        }
        ArrayList<Integer> probable = probableNumbers(input, row, col);
        if (probable.isEmpty()) return;
        for (int num: probable) {
            input.setNumber(row, col, num);
            fill(input, index+1);
        }
        input.setNumber(row, col, 0);
    }

    public static ArrayList<Sudoku> solve(Sudoku input) {
        solved = new ArrayList<>();
        fill(input, 0);
        return solved;
    }

}
