package HashTableCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 两个数组的交集II
 * Example:
 * Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2, 2].
 * <p>
 * Note:
 * Each element in the result should appear as many times as it shows in both arrays.
 * The result can be in any order.
 */
public class HT_350 {
    public static void main(String[] args) {
        int[] nums1 = {3, 1, 2};
        int[] nums2 = {1, 3};
        int[] solution = intersect(nums1, nums2);
        for (int i : solution) {
            System.out.println(i + " ");
        }
    }

    public static int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0, j = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                list.add(nums1[i]);
                i++;
                j++;
            } else if (nums1[i] < nums2[j]) {
                i++;
            } else {
                j++;
            }
        }
        int[] intersect = new int[list.size()];
        for (int m = 0; m < list.size(); m++) {
            intersect[m] = list.get(m);
        }
        return intersect;
    }
}
