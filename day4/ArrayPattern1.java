import java.util.Scanner;

//Spiral Order Matrix
public class ArrayPattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] numbers = new int[n][m];

        //input
        //rows
        for (int i=0; i<n; i++) {
            //cols
            for (int j=0; j<m; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }

        System.out.println("The matrix is: ");
        //output
        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("The spiral order Matrix is: ");

        int rowStart = 0;
        int rowEnd = n-1;
        int colStart = 0;
        int colEnd = m-1;

        //to print the spiral order

        while (rowStart <= rowEnd && colStart <= colEnd) {
            //print rowStart
            for (int i=colStart; i<=colEnd; i++) {
                System.out.print(numbers[rowStart][i] + " ");
            }
            rowStart++;

            //print colEnd
            for (int i=rowStart; i<=rowEnd; i++) {
                System.out.print(numbers[i][colEnd] + " ");
            }
            colEnd--;

            //print rowEnd
            if (rowStart <= rowEnd) {
                for (int i=colEnd; i>=colStart; i--) {
                    System.out.print(numbers[rowEnd][i] + " ");
                }
                rowEnd--;
            }

            //print colStart
            if (colStart <= colEnd) {
                for (int i=rowEnd; i>=rowStart; i--) {
                    System.out.print(numbers[i][colStart] + " ");
                }
                colStart++;
            }
        }
    }
}
