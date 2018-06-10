package DynamicProgrammingCode;

/**
 * 不同路径II
 * 一个机器人位于一个 m x n 网格的左上角 （起始点在下图中标记为“Start” ）。
 * <p>
 * 机器人每次只能向下或者向右移动一步。机器人试图达到网格的右下角（在下图中标记为“Finish”）。
 * <p>
 * 现在考虑网格中有障碍物。那么从左上角到右下角将会有多少条不同的路径？
 * 网格中的障碍物和空位置分别用 1 和 0 来表示。
 * <p>
 * 说明：m 和 n 的值均不超过 100。
 */
public class DP_63 {
    public static void main(String[] args) {
        int[][] obstacle = {{1, 0}};
        System.out.println(uniquePathsWithObstacles(obstacle));
    }

    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int row = obstacleGrid.length;
        int col = obstacleGrid[0].length;
        int[][] memo = new int[row][col];
        for (int i = 0; i < row; i++) {
            if (obstacleGrid[i][0] == 1) {
                for (int j = i; j < row; j++) {
                    memo[j][0] = 0;
                }
                break;
            } else {
                memo[i][0] = 1;
            }
        }
        for (int i = 0; i < col; i++) {
            if (obstacleGrid[0][i] == 1) {
                for (int j = i; j < col; j++) {
                    memo[0][j] = 0;
                }
                break;
            } else {
                memo[0][i] = 1;
            }
        }
        for (int i = 1; i < row; i++) {
            for (int j = 1; j < col; j++) {
                if (obstacleGrid[i][j] == 1) {
                    memo[i][j] = 0;
                } else {
                    memo[i][j] = memo[i - 1][j] + memo[i][j - 1];
                }
            }
        }
        return memo[row - 1][col - 1];
    }
}
