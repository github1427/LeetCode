package HashTableCode;

import java.util.*;

/**
 * 两个数组的交集I
 * Given two arrays, write a function to compute their intersection.
 * <p>
 * Example:
 * Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2].
 * <p>
 * Note:
 * Each element in the result must be unique.
 * The result can be in any order.
 */
public class HT_349 {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        int[] solution = intersection(nums1, nums2);
        for (int i : solution) {
            System.out.println(i + " ");
        }
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for (int i : nums1) {
            set1.add(i);
        }
        for (int i : nums2) {
            set2.add(i);
        }
        List<Integer> list = new ArrayList<>();
        for (int i : set1) {
            if (set2.contains(i)) {
                list.add(i);
            }
        }
        int[] intersection = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            intersection[i] = list.get(i);
        }
        return intersection;
    }
}
