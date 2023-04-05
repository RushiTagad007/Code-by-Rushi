public class SquareStar{

public static void main(String[] args){

public static String createSquare(int n) {
    if (n < 1) {
        return "";
    }

    // Create the first row of the square
    String firstRow = "#".repeat(n);

    // Create the middle rows of the square
    StringBuilder middleRows = new StringBuilder();
    for (int i = 0; i < n - 2; i++) {
        middleRows.append("#").append(" ".repeat(n - 2)).append("#");
        if (i != n - 3) {
            middleRows.append("\n");
        }
    }

    // Create the last row of the square
    String lastRow = "#".repeat(n);

    // Combine the rows into a single string
    return firstRow + "\n" + middleRows.toString() + "\n" + lastRow;
}
}
}