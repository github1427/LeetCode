package ArrayCode;

/**
 * 图片评话器
 * 包含整数的二维矩阵 M 表示一个图片的灰度。你需要设计一个平滑器来让每一个单元的灰度成为平均灰度 (向下舍入) ，平均灰度的计算是周围的8个单元和它本身的值求平均，如果周围的单元格不足八个，则尽可能多的利用它们。
 * <p>
 * 示例 1:
 * <p>
 * 输入:
 * [[1,1,1],
 * [1,0,1],
 * [1,1,1]]
 * 输出:
 * [[0, 0, 0],
 * [0, 0, 0],
 * [0, 0, 0]]
 * 解释:
 * 对于点 (0,0), (0,2), (2,0), (2,2): 平均(3/4) = 平均(0.75) = 0
 * 对于点 (0,1), (1,0), (1,2), (2,1): 平均(5/6) = 平均(0.83333333) = 0
 * 对于点 (1,1): 平均(8/9) = 平均(0.88888889) = 0
 */
public class Array_661 {
    public static void main(String[] args) {
        int [] []nums={{2,3,4},{5,6,7},{1,1,1}};
        int [] [] smoother=imageSmoother(nums);
        for (int i=0;i< smoother.length;i++){
            for (int j=0;j<smoother[0].length;j++){
                System.out.print(smoother[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static int[][] imageSmoother(int[][] M) {
        int row=M.length;
        int col=M[0].length;
        int [][] smoother=new int[row][col];
        int sum=0,count=0;
        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                sum+=M[i][j];
                count++;
                if (j-1>=0){
                    sum+=M[i][j-1];
                    count++;
                }
                if (j+1<=col-1){
                    sum+=M[i][j+1];
                    count++;
                }
                if (i-1>=0){
                    if (j-1>=0){
                        sum+=M[i-1][j-1];
                        count++;
                    }
                    if (j+1<=col-1){
                        sum+=M[i-1][j+1];
                        count++;
                    }
                    sum+=M[i-1][j];
                    count++;
                }
                if (i+1<=row-1){
                    if (j-1>=0){
                        sum+=M[i+1][j-1];
                        count++;
                    }
                    if (j+1<=col-1){
                        sum+=M[i+1][j+1];
                        count++;
                    }
                    sum+=M[i+1][j];
                    count++;
                }
                smoother[i][j]=sum/count;
                count=0;
                sum=0;
            }
        }
        return smoother;
    }
}
