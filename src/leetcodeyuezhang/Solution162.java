/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcodeyuezhang;

/**
 *
 * @author YueZhang 162. Find Peak Element A peak element is an element that is
 * greater than its neighbors.
 *
 * Given an input array where num[i] ≠ num[i+1], find a peak element and return
 * its index.
 *
 * The array may contain multiple peaks, in that case return the index to any
 * one of the peaks is fine.
 *
 * You may imagine that num[-1] = num[n] = -∞.
 *
 * For example, in array [1, 2, 3, 1], 3 is a peak element and your function
 * should return the index number 2.
 */

//Solution： 边界问题。。。O(n)，应该有logn的方法
public class Solution162 {

    public int findPeakElement(int[] nums) {

        int nLength = nums.length;
        if (nLength == 0 || nLength == 1) {
            return 0;
        }
        
        if (nums[0] > nums[1]) {
            return 0;
        }

        if (nums[nLength - 1] > nums[nLength - 2]) {
            return nLength - 1;
        }

        for (int i = 1; i < nLength - 1; i++) {
            if (nums[i] > nums[i -1] && nums[i] > nums[i + 1]) {            
                return i;
            }
        }

        return 0;
    }

}
