import java.util.Arrays;

public class MultidimensionalArrays {
    public static void main(String[] args){
        int row = 10, col = 5;
        int[][] multiDArr = new int[row][col];

        /*
         * Exercise 1:
         * Create a multidimensional array in IntelliJ that
         * prints ten rows numbered 1-10 and five columns numbered 1-5.
         */
        System.out.println("\n***** Exercise 1:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                multiDArr[i][j] = -1;
                System.out.print(" row " + i + " col " + j);
            }
            System.out.println("");
        }

        /*
         * Create an array to display the multiplication tables for the values 1-12.
         * The intersection of a row value and a column value would be
         * the product of the row * column.
         */
        row = 12;
        col = 12;
        int[][] multiChart = new int[row][col];

        System.out.println("\n***** Exercise 2: Multiplication Table");

        // compute the multiplication
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++)
                multiChart[i][j] = (i+1) * (j+1);

        }

        // print out the array
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++)
                System.out.print("\t" + multiChart[i][j]);

            System.out.println("");
        }
    }
}
