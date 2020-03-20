package leetcode.hot4;

import jdk.jfr.StackTrace;

public class Solution {


    public static void  main(String[] args){
        int[] nums1 = {1,2};
        int[] nums2 = {3,4};
        System.out.println(findMedianSortedArrays(nums1,nums2));
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int sum = nums1.length + nums2.length;
        if (sum % 2 == 0){
            System.out.println(findKth(nums1,0,nums2,0,sum / 2));
            System.out.println(findKth(nums1,0,nums2,0,sum / 2 + 1));
            return (findKth(nums1,0,nums2,0,sum / 2) + findKth(nums1,0,nums2,0,sum / 2 + 1)) / 2.0;
        }
        return findKth(nums1,0,nums2,0,(sum + 1) / 2);
    }

    public static double findKth(int[] nums1, int pos1, int[] nums2, int pos2, int k){
        if (pos1 >= nums1.length) return nums2[pos2 + k - 1];
        if (pos2 >= nums2.length) return nums1[pos1 + k - 1];
        if (k == 1) return nums1[pos1 + k - 1] < nums2[pos2 + k - 1] ? nums1[pos1 + k - 1] : nums2[pos2 + k - 1];
        double mid1 = nums1.length >= k / 2 + pos1 ? nums1[pos1 + k / 2 - 1] : Double.MAX_VALUE;
        double mid2 = nums2.length >= k / 2 + pos2 ? nums2[pos2 + k / 2 - 1] : Double.MAX_VALUE;
        if (mid1 <= mid2)
            return findKth(nums1, pos1 + k / 2, nums2, pos2, k - k / 2);
        else
            return findKth(nums1, pos1, nums2, pos2 + k / 2, k - k / 2);
    }
}
