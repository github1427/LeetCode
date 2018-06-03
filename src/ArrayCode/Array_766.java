package ArrayCode;

/**
 * 托普利茨矩阵
 * 如果一个矩阵的每一方向由左上到右下的对角线上具有相同元素，那么这个矩阵是托普利茨矩阵。
 * <p>
 * 给定一个 M x N 的矩阵，当且仅当它是托普利茨矩阵时返回 True。
 * <p>
 * 示例 1:
 * <p>
 * 输入: matrix = [[1,2,3,4],[5,1,2,3],[9,5,1,2]]
 * 输出: True
 * 解释:
 * 1234
 * 5123
 * 9512
 * <p>
 * 在上面这个矩阵中, 对角线分别是 "[9]", "[5, 5]", "[1, 1, 1]", "[2, 2, 2]", "[3, 3]", "[4]", 各条对角线上的所有元素都相同, 因此答案是True。
 * 示例 2:
 * <p>
 * 输入: matrix = [[1,2],[2,2]]
 * 输出: False
 * 解释:
 * 对角线, 比如: "[1, 2]" 上有不同的元素。
 */
public class Array_766 {
    public static void main(String[] args) {
        int[][] matrix={{1,2,3,4},{5,1,2,3},{9,3,1,2}};
        System.out.println(isToeplitzMatrix(matrix));
    }
    public static boolean isToeplitzMatrix(int[][] matrix) {
        int row=matrix.length;
        int col=matrix[0].length;
        for (int i=0;i<row-1;i++){
            for (int j=0;j<col-1;j++){
                if (matrix[i][j]!=matrix[i+1][j+1]){
                    return false;
                }
            }
        }
        return true;
    }
}
