import java.util.Scanner;

public class Sudoku {

    private final int[][] board;

    public Sudoku() {
        board = new int[9][9];
    }

    public Sudoku(int[][] board) {
        this.board = board;
    }

    public int getNumber(int row, int col) {
        return board[row][col];
    }

    public void setNumber(int row, int col, int val) {
        board[row][col] = val;
    }

    public int[][] getBoard() {
        int[][] copy = new int[9][9];
        for (int i = 0; i < 9; i++) {
            System.arraycopy(board[i], 0, copy[i], 0, 9);
        }
        return copy;
    }

    public void takeInput() {
        Scanner scn = new Scanner(System.in);
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                board[row][col] = scn.nextInt();
            }
        }
    }

    public void print() {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

}
