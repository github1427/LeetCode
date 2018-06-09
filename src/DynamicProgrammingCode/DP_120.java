package DynamicProgrammingCode;

import java.util.ArrayList;
import java.util.List;

/**
 * 三角形最短路径和
 * 例如，给定三角形：
 * <p>
 * [
 * [2],
 * [3,4],
 * [6,5,7],
 * [4,1,8,3]
 * ]
 * 自顶向下的最小路径和为 11（即，2 + 3 + 5 + 1 = 11）。
 * <p>
 * 说明：
 * <p>
 * 如果你可以只使用 O(n) 的额外空间（n 为三角形的总行数）来解决这个问题，那么你的算法会很加分。
 */
public class DP_120 {
    static int[] minimumTotalArray = new int[4];

    public static void main(String[] args) {
        List<List<Integer>> lists = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        list1.add(2);
        List<Integer> list2 = new ArrayList<>();
        list2.add(3);
        list2.add(4);
        List<Integer> list3 = new ArrayList<>();
        list3.add(6);
        list3.add(5);
        list3.add(7);
        List<Integer> list4 = new ArrayList<>();
        list4.add(4);
        list4.add(1);
        list4.add(3);
        list4.add(8);
        lists.add(list1);
        lists.add(list2);
        lists.add(list3);
        lists.add(list4);
        System.out.println(minimumTotal(lists));
    }

    public static int minimumTotal(List<List<Integer>> triangle) {
        int[][] minimumArray = new int[triangle.size() + 1][triangle.size() + 1];
        for (int i = triangle.size() - 1; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                minimumArray[i][j] = Math.min(minimumArray[i + 1][j], minimumArray[i + 1][j + 1]) + triangle.get(i).get(j);
            }
        }
        return minimumArray[0][0];
    }
}
