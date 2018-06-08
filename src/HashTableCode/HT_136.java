package HashTableCode;

import java.util.HashSet;
import java.util.Set;

/**
 * SingleNumber
 * Given a non-empty array of integers, every element appears twice except for one. Find that single one.
 * <p>
 * Note:
 * <p>
 * Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
 * <p>
 * Example 1:
 * <p>
 * Input: [2,2,1]
 * Output: 1
 * Example 2:
 * <p>
 * Input: [4,1,2,1,2]
 * Output: 4
 */
public class HT_136 {
    public static void main(String[] args) {
        int[] nums = {2, 2, 1, 1, 3, 5, 5};
        System.out.println(singleNuber(nums));
    }

    public static int singleNuber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (!set.add(num)) {
                set.remove(num);
            }
        }
        return set.iterator().next();
    }
    //还可以用异或做
}
