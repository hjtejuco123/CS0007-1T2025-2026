package Module4;
//create a simple two dimensional array display matrix values
//syntax datatype[][] arrayName = new datatype[rows][columns];
//or datatype[][] arrayName = {{value1, value2}, {value3, value4}, ...};    
public class sample9 {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("Matrix values:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
