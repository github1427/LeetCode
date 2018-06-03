package ArrayCode;

/**
 * 合并两个有序数组
 * 给定两个有序整数数组 nums1 和 nums2，将 nums2 合并到 nums1 中，使得 num1 成为一个有序数组。
 * <p>
 * 说明:
 * <p>
 * 初始化 nums1 和 nums2 的元素数量分别为 m 和 n。
 * 你可以假设 nums1 有足够的空间（空间大小大于或等于 m + n）来保存 nums2 中的元素。
 * 示例:
 * <p>
 * 输入:
 * nums1 = [1,2,3,0,0,0], m = 3
 * nums2 = [2,5,6],       n = 3
 * <p>
 * 输出: [1,2,2,3,5,6]
 */
public class Array_88 {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {1, 1, 3};
        merge(nums1, 3, nums2, 3);
        for (int num : nums1) {
            System.out.print(num + " ");
        }

    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] array = new int[m + n];
        int i = 0, j = 0;
        for (int k = 0; k < m + n; k++) {
            if (i >= m) {
                array[k] = nums2[j];
                j++;
            } else if (j >= n) {
                array[k] = nums1[i];
                i++;
            } else if (nums1[i] > nums2[j]) {
                array[k] = nums2[j];
                j++;
            } else {
                array[k] = nums1[i];
                i++;
            }
        }
        System.arraycopy(array, 0, nums1, 0, m + n);
    }
}
