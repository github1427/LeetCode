package MathCode;

/**
 * 第N个数字
 * 在无限的整数序列 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, ...中找到第 n 个数字。
 * <p>
 * 注意:
 * n 是正数且在32为整形范围内 ( n < 231)。
 * <p>
 * 示例 1:
 * <p>
 * 输入:
 * 3
 * <p>
 * 输出:
 * 3
 * 示例 2:
 * <p>
 * 输入:
 * 11
 * <p>
 * 输出:
 * 0
 * <p>
 * 说明:
 * 第11个数字在序列 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, ... 里是0，它是10的一部分。
 */
public class Math_400 {
    public static void main(String[] args) {
        System.out.println(findNthDigit(100000000));
    }
    public static int findNthDigit(int n){
        int count=0;
        int num=-1;
        for (int i=1;i<=n;i++){
            while (i>0){
                num=i/10;
                i/=10;
                count++;
            }
        }
    }
}
