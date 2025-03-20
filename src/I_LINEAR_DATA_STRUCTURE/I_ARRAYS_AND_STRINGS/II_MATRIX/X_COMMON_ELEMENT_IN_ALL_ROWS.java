package I_LINEAR_DATA_STRUCTURE.I_ARRAYS_AND_STRINGS.II_MATRIX;

import java.util.ArrayList;
import java.util.List;

public class X_COMMON_ELEMENT_IN_ALL_ROWS {


    public static List<Integer> findCommonElements(int[][] matrix) {
        List<Integer> commonElements = new ArrayList<>();

        // If the matrix is empty, return empty list
        if (matrix.length == 0 || matrix[0].length == 0) {
            return commonElements;
        }

        // Use the first row as reference
        int[] firstRow = matrix[0];

        // Check each element in the first row
        for (int element : firstRow) {
            boolean isCommon = true;

            // Check if the element exists in all other rows
            for (int i = 1; i < matrix.length; i++) {
                boolean found = false;
                for (int j = 0; j < matrix[i].length; j++) {
                    if (matrix[i][j] == element) {
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    isCommon = false;
                    break;
                }
            }

            // If the element is common in all rows, add it to the result
            if (isCommon) {
                commonElements.add(element);
            }
        }

        return commonElements;
    }


    public static void main(String[] args) {

        int[][] matrix = {
                {1, 2, 3, 4},
                {2, 3, 4, 5},
                {3, 4, 5, 6},
                {4, 5, 6, 7}
        };

        // Find common elements
        List<Integer> commonElements = findCommonElements(matrix);

        // Print the result
        System.out.println("Common elements in all rows: " + commonElements);
    }

}

