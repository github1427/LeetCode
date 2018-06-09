package DynamicProgrammingCode;

/**
 * 最小路径和
 * 给定一个包含非负整数的 m x n 网格，请找出一条从左上角到右下角的路径，使得路径上的数字总和为最小。
 * <p>
 * 说明：每次只能向下或者向右移动一步。
 * <p>
 * 示例:
 * <p>
 * 输入:
 * [
 * [1,3,1],
 * [1,5,1],
 * [4,2,1]
 * ]
 * 输出: 7
 * 解释: 因为路径 1→3→1→1→1 的总和最小。
 */
public class DP_64 {
    public static void main(String[] args) {
        int[][] grid = {{1, 3, 1}, {1, 5, 1}, {4, 2, 1}};
        System.out.println(minPathSum(grid));
    }

    public static int minPathSum(int[][] grid) {
        int[][] lenPath = new int[grid.length][grid[0].length];
        lenPath[0][0] = grid[0][0];
        for (int i = 1; i <= grid.length - 1; i++) {
            lenPath[i][0] = lenPath[i - 1][0] + grid[i][0];
        }
        for (int j = 1; j <= grid[0].length - 1; j++) {
            lenPath[0][j] = lenPath[0][j - 1] + grid[0][j];
        }
        for (int i = 1; i <= lenPath.length - 1; i++) {
            for (int j = 1; j <= lenPath[i].length - 1; j++) {
                lenPath[i][j] = Math.min(lenPath[i - 1][j], lenPath[i][j - 1]) + grid[i][j];
            }
        }
        return lenPath[lenPath.length - 1][lenPath[0].length - 1];
    }
}
