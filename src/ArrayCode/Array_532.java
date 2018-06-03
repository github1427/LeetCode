package ArrayCode;

import java.util.*;

/**
 * 数组中的K-diff数对
 * 给定一个整数数组和一个整数 k, 你需要在数组里找到不同的 k-diff 数对。这里将 k-diff 数对定义为一个整数对 (i, j), 其中 i 和 j 都是数组中的数字，且两数之差的绝对值是 k.
 * <p>
 * 示例 1:
 * <p>
 * 输入: [3, 1, 4, 1, 5], k = 2
 * 输出: 2
 * 解释: 数组中有两个 2-diff 数对, (1, 3) 和 (3, 5)。
 * 尽管数组中有两个1，但我们只应返回不同的数对的数量。
 * 示例 2:
 * <p>
 * 输入:[1, 2, 3, 4, 5], k = 1
 * 输出: 4
 * 解释: 数组中有四个 1-diff 数对, (1, 2), (2, 3), (3, 4) 和 (4, 5)。
 * 示例 3:
 * <p>
 * 输入: [1, 3, 1, 5, 4], k = 0
 * 输出: 1
 * 解释: 数组中只有一个 0-diff 数对，(1, 1)。
 */
public class Array_532 {
    public static void main(String[] args) {
        int[] nums = {3, 1, 4, 1, 5};
        System.out.println(findPairs2(nums, 2));
    }

    // 还凑合，略麻烦
    public static int findPairs(int[] nums, int k) {
        if (nums.length == 0) {
            return 0;
        }
        int count = 0;
        int removeEle = Integer.MIN_VALUE;
        Set<Integer> set = new HashSet<>();
        Arrays.sort(nums);
        set.add(nums[0]);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != removeEle) {
                if (set.contains(nums[i] - k)) {
                    count++;
                    set.remove(nums[i] - k);
                    removeEle = nums[i] - k;
                }
                set.add(nums[i]);
            }
        }
        return count;
    }

    // 大神的，用hashmap实现
    public static int findPairs2(int[] nums, int k) {
        if (nums==null||nums.length==0||k<0){
            return 0;
        }
        Map<Integer,Integer> map =new HashMap<>();
        int count=0;
        map.put(nums[0],1);
        for (int i=1;i<nums.length;i++){
            if (map.containsKey(nums[i])){
                if (map.get(nums[i])==1&&k==0){
                    count++;
                    map.put(nums[i],2);
                }
                continue;
            }
            if (map.containsKey(nums[i]-k)){
                count++;
            }
            if (map.containsKey(nums[i]+k)){
                count++;
            }
            map.put(nums[i],1);
        }
        return count;
    }
}
