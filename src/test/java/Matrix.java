import java.util.ArrayList;

public class Matrix {
    public static int sumOfEvenNumbers(int[][] matrix){
        int sum = 0;
        for(int i=0;i<matrix.length;i++){

            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j] % 2 == 0){
                    sum = sum + matrix[i][j];
                }
            }
        }


        return sum;
    }

     public static ArrayList<Integer> rowsWithZero(int[][] matrix){
        ArrayList<Integer> rows = new ArrayList<>();

        for(int i=0;i<matrix.length;i++){
            int counter = 0;
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j] == 0){
                    counter++;
                }
            }
            if(counter != 0){
                rows.add(i);
            }
        }

        return rows;
     }
}
