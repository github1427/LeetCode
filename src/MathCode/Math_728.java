package MathCode;

import java.util.ArrayList;
import java.util.List;

/**
 * 自除数
 * 自除数 是指可以被它包含的每一位数除尽的数。
 * <p>
 * 例如，128 是一个自除数，因为 128 % 1 == 0，128 % 2 == 0，128 % 8 == 0。
 * <p>
 * 还有，自除数不允许包含 0 。
 * <p>
 * 给定上边界和下边界数字，输出一个列表，列表的元素是边界（含边界）内所有的自除数。
 * <p>
 * 示例 1：
 * <p>
 * 输入：
 * 上边界left = 1, 下边界right = 22
 * 输出： [1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 22]
 * 注意：
 * <p>
 * 每个输入参数的边界满足 1 <= left <= right <= 10000。
 */
public class Math_728 {
    public static void main(String[] args) {
        System.out.println(selfDividingNumbers(1, 22));
    }

    public static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();
        int remain = 0;
        int num = 0;
        boolean flag = true;
        for (int i = left; i <= right; i++) {
            num = i;
            while (num > 0) {
                remain = num % 10;
                if (remain == 0) {
                    flag = false;
                    break;
                }
                if (i % remain != 0) {
                    flag = false;
                    break;
                }
                num /= 10;
            }
            if (flag) {
                list.add(i);
            }
            flag = true;
        }
        return list;
    }
}
