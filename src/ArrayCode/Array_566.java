package ArrayCode;

import java.util.ArrayList;
import java.util.List;

/**
 * 重塑矩阵
 * 在MATLAB中，有一个非常有用的函数 reshape，它可以将一个矩阵重塑为另一个大小不同的新矩阵，但保留其原始数据。
 * <p>
 * 给出一个由二维数组表示的矩阵，以及两个正整数r和c，分别表示想要的重构的矩阵的行数和列数。
 * <p>
 * 重构后的矩阵需要将原始矩阵的所有元素以相同的行遍历顺序填充。
 * <p>
 * 如果具有给定参数的reshape操作是可行且合理的，则输出新的重塑矩阵；否则，输出原始矩阵。
 * <p>
 * 示例 1:
 * <p>
 * 输入:
 * nums =
 * [[1,2],
 * [3,4]]
 * r = 1, c = 4
 * 输出:
 * [[1,2,3,4]]
 * 解释:
 * 行遍历nums的结果是 [1,2,3,4]。新的矩阵是 1 * 4 矩阵, 用之前的元素值一行一行填充新矩阵。
 * 示例 2:
 * <p>
 * 输入:
 * nums =
 * [[1,2],
 * [3,4]]
 * r = 2, c = 4
 * 输出:
 * [[1,2],
 * [3,4]]
 * 解释:
 * 没有办法将 2 * 2 矩阵转化为 2 * 4 矩阵。 所以输出原矩阵。
 */
public class Array_566 {
    public static void main(String[] args) {
        int [][]nums={{1,2,3},{3,4,5}};
        int [][] reshape=matrixReshape2(nums,3,2);
        for (int[]num1:reshape){
            for (int num2:num1){
                System.out.print(num2+"  ");
            }
            System.out.println();
            System.out.println("--------");
        }
    }

    //想复杂了，不用list 直接弄个双层for就是干
    public static int[][] matrixReshape(int[][] nums,int r,int c){
        if (nums==null||nums.length==0){
            return nums;
        }
        int row=nums.length;
        int col=nums[0].length;
        if (row*col!=r*c){
            return nums;
        }
        int [][]matrixReshape=new int[r][c];
        List<Integer> list =new ArrayList<>();
        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                list.add(nums[i][j]);
            }
        }
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                matrixReshape[i][j]=list.get(0);
                list.remove(0);
            }
        }
        return matrixReshape;
    }

    //大神代码，不得不喊声666
    public static int[][] matrixReshape2(int[][] nums,int r,int c){
        int row=nums.length;
        int col=nums[0].length;
        int [][] reshapeMatrix =new int[r][c];
        if (row*col==r*c){
            for (int i=0;i<col*row;i++){
                reshapeMatrix[i/c][i%c]=nums[i/col][i%col];
            }
            return reshapeMatrix;
        }
        return nums;
    }
}
