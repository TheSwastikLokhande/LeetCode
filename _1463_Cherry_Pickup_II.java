public class _1463_Cherry_Pickup_II {
    public static void main(String[] args) {
        
    }
    public static int cherryPicgitkup(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        
        // Initialize dp array
        int[][][] dp = new int[rows][cols][cols];
        
        // Iterate through each row and columns for both robots
        for (int i = rows - 1; i >= 0; i--) {
            for (int j1 = 0; j1 < cols; j1++) {
                for (int j2 = 0; j2 < cols; j2++) {
                    // Current cell's cherries
                    int cherries = grid[i][j1];
                    
                    // If robots are not in the same column, add cherries from robot #2
                    if (j1 != j2) {
                        cherries += grid[i][j2];
                    }
                    
                    // Transition to the next row for both robots
                    int maxNext = 0;
                    for (int move1 = j1 - 1; move1 <= j1 + 1; move1++) {
                        for (int move2 = j2 - 1; move2 <= j2 + 1; move2++) {
                            // Check if the next moves are within bounds
                            if (i + 1 < rows && move1 >= 0 && move1 < cols && move2 >= 0 && move2 < cols) {
                                maxNext = Math.max(maxNext, dp[i + 1][move1][move2]);
                            }
                        }
                    }
                    
                    // Update dp array
                    dp[i][j1][j2] = cherries + maxNext;
                }
            }
        }
        
        return dp[0][0][cols - 1];
    }
}
