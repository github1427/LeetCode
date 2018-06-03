package ArrayCode;

/**
 * 加1
 * 给定一个非负整数组成的非空数组，在该数的基础上加一，返回一个新的数组。
 * <p>
 * 最高位数字存放在数组的首位， 数组中每个元素只存储一个数字。
 * <p>
 * 你可以假设除了整数 0 之外，这个整数不会以零开头。
 * <p>
 * 示例 1:
 * <p>
 * 输入: [1,2,3]
 * 输出: [1,2,4]
 * 解释: 输入数组表示数字 123。
 * 示例 2:
 * <p>
 * 输入: [4,3,2,1]
 * 输出: [4,3,2,2]
 * 解释: 输入数组表示数字 4321。
 */
public class Array_66 {
    public static void main(String[] args) {
        int[] digits={4,3,2,9};
        int [] solution=plusOne(digits);
        for (int num:solution){
            System.out.print(num+" ");
        }

    }

    public static int[] plusOne(int[] digits) {
        int len = digits.length;
        int[] array = new int[len + 1];
        for (int i = len - 1; i >= 0; --i) {
            if (digits[i] == 9) {
                if (i == 0) {
                    array[i] = 1;
                    return array;
                }
                digits[i] = 0;
            } else {
                digits[i] = digits[i] + 1;
                break;
            }
        }
        return digits;
    }
}
