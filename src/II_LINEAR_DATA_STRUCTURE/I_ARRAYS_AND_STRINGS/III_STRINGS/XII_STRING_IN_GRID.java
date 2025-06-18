package II_LINEAR_DATA_STRUCTURE.I_ARRAYS_AND_STRINGS.III_STRINGS;

public class XII_STRING_IN_GRID {
    public static void main(String[] args) {
        char grid[][] = {
                {'a', 'b', 'a', 'b'},
                {'a', 'b', 'e', 'b'},
                {'e', 'b', 'e', 'b'}
        };
        String word = "abe";

        int r = grid.length;
        int c = grid[0].length;
        int countword = 0;

        // 8 Possible Directions: {row change, col change}
        int directions[][] = {
                {0, 1},   // Right
                {0, -1},  // Left
                {1, 0},   // Down
                {-1, 0},  // Up
                {-1, -1}, // Top-Left Diagonal
                {-1, 1},  // Top-Right Diagonal
                {1, -1},  // Bottom-Left Diagonal
                {1, 1}    // Bottom-Right Diagonal
        };

        // Check all positions in the grid
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                // Check all 8 directions
                for (int[] dir : directions) {
                    int k;
                    int row = i, col = j;

                    // Try to match the word in this direction
                    for (k = 0; k < word.length(); k++) {
                        if (row < 0 || row >= r || col < 0 || col >= c || grid[row][col] != word.charAt(k)) {
                            break;
                        }
                        row += dir[0]; // Move row
                        col += dir[1]; // Move col
                    }

                    // If entire word is matched, increment count
                    if (k == word.length()) {
                        countword++;
                    }
                }
            }
        }

        System.out.println(countword);
    }
}
