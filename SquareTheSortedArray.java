/*
Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.



Example 1:

Input: nums = [-4,-1,0,3,10]
Output: [0,1,9,16,100]
Explanation: After squaring, the array becomes [16,1,0,9,100].
After sorting, it becomes [0,1,9,16,100].
* */

import java.util.Arrays;

public class SquareTheSortedArray {
    //static int counter = 0;
    public static void main(String[] args) {
        int[] arr = {-5,-4,-3,-2};
        SquareTheSortedArray sol = new SquareTheSortedArray();

        System.out.println("OUTPUT-->"+ Arrays.toString(sol.sortedSquares(arr)));
        //System.out.println(arr[arr.length-1]);
        //System.out.println(counter);

        int a = 10000;
        int b = a*a;
        System.out.println(b);
    }

    public int[] sortedSquares(int[] nums) {
        /*SquareTheSortedArray sol = new SquareTheSortedArray();
        nums = sol.sqrTheArray(nums);*/

        int size = nums.length;
        int counter = 0;

        for (int i=0; i< size; i++) {
            if (nums[i] < 0) {
                counter++;
            }
            nums[i] = nums[i]*nums[i];
        }
        System.out.println("After square: "+Arrays.toString(nums)+
                " counter: "+counter+
                " Size"+size);

        int i = counter;
        int j = counter-1;
        int k = 0;
        int[] arr = new int[size];

        if (size > 1) {
            if (counter == size) {
                for (int x = size-1; x>=0; x--) {
                    arr[k] = nums[x];
                    k++;
                }
            }
            else {
                while (j >= 0 && i < size) {

                    if (nums[i] <= nums[j]) {
                        arr[k] = nums[i];
                        i++;
                    } else {
                        arr[k] = nums[j];
                        j--;
                    }
                    k++;
                }

                while (i < size) {
                    arr[k] = nums[i];
                    i++;
                    k++;
                }
                while (j >= 0) {
                    arr[k] = nums[j];
                    j--;
                    k++;
                }
            }
                return arr;
        }
        else
            return nums;
    }
}
