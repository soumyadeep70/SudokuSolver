import java.util.ArrayList;

public class UserInteraction {
    public static void main(String[] args) {

        System.out.println("\uD835\uDD4E\uD835\uDD56\uD835\uDD5D\uD835\uDD54\uD835\uDD60\uD835\uDD5E\uD835\uDD56 " +
                "\uD835\uDD65\uD835\uDD60 \uD835\uDD4A\uD835\uDD66\uD835\uDD55\uD835\uDD60\uD835\uDD5C\uD835\uDD66" +
                " \uD835\uDD4A\uD835\uDD60\uD835\uDD5D\uD835\uDD67\uD835\uDD56\uD835\uDD63 :");
        System.out.println("\uD835\uDDA4\uD835\uDDC7\uD835\uDDCD\uD835\uDDBE\uD835\uDDCB \uD835\uDDD2\uD835\uDDC8\uD835" +
                "\uDDCE\uD835\uDDCB \uD835\uDDCC\uD835\uDDCE\uD835\uDDBD\uD835\uDDC8\uD835\uDDC4\uD835\uDDCE" +
                " \uD835\uDDC9\uD835\uDDCE\uD835\uDDD3\uD835\uDDD3\uD835\uDDC5\uD835\uDDBE \uD835\uDDBB\uD835\uDDBE" +
                "\uD835\uDDC5\uD835\uDDC8\uD835\uDDD0 (\uD835\uDDA4\uD835\uDDC7\uD835\uDDCD\uD835\uDDBE\uD835\uDDCB" +
                " '\uD835\uDFE2' \uD835\uDDBF\uD835\uDDC8\uD835\uDDCB \uD835\uDDBE\uD835\uDDC6\uD835\uDDC9\uD835\uDDCD\uD835\uDDD2" +
                " \uD835\uDDBC\uD835\uDDBE\uD835\uDDC5\uD835\uDDC5\uD835\uDDCC) :");

        Sudoku sudoku = new Sudoku();
        sudoku.takeInput();
        ArrayList<Sudoku> solved = Solver.solve(sudoku);
        System.out.println("\nFound " + solved.size() + " possible solution.");
        for (int count = 1; count <= solved.size(); count++) {
            System.out.printf("Solution #%d : \n", count);
            solved.get(count - 1).print();
        }
    }
}
