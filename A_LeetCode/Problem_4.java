package A_LeetCode;
import java.util.*;
public class Problem_4 {
    public double findMedianSortedArrays(int[] nums1 , int[] nums2)
    {
        int m = nums1.length;
        int n = nums2.length;
        int[] mergeArray = new int[n + m];
        int i = 0;
        int j = 0;
        int k = 0;

        while(i < m && j < n)
        {
            if(nums1[i] < nums2[j])
            {
                mergeArray[k++] = nums1[i++];
            }
            else{
                mergeArray[k++] = nums2[j++];
            }
        }

        while(i < m)
        {
            mergeArray[k++] = nums1[i++];
        }
        while(j < n)
        {
            mergeArray[k++] = nums2[j++];
        }
        int totalLength = m + n;
        if(totalLength % 2 == 1)
        {
            return mergeArray[totalLength / 2];
        }
        else{
            int midIndex = totalLength / 2;
            return (mergeArray[midIndex - 1] + mergeArray[midIndex]) / 2.0;
        }
    }

    public static void main(String[] args) {
        Problem_4 obj = new Problem_4();
        int[] nums1 = {1, 3};
        int[] nums2 = {2};
        double output = obj.findMedianSortedArrays(nums1, nums2);
        System.out.println(output);
    }
}

