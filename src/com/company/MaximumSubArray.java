package com.company;

import java.util.Arrays;
import java.util.LinkedList;

public class MaximumSubArray {
    public static void main(String[] args) {
        int arrA[] = { 1, 2, -3, -4, 2, 7, -2, 3, -2, -4, -3 };
        System.out.println("INPUT: " + Arrays.toString(arrA));
        System.out.println("Maximum Sum of subarray is  " + getMaxSubArray(arrA));
    }

    // bottom up approach
    static int getMaxSubArray(int [] a){
        int [] solution = new int[a.length+1];
        solution[0] = 0;

        for (int j = 1; j < solution.length; j++) {
            solution[j] = Math.max(solution[j-1] + a[j-1], a[j-1]);
        }
        // print the solution array
        System.out.println("SOLUTION ARRAY: " + Arrays.toString(solution));

        // calculate the maximum sum in the solution array
        int result = solution[0];
        int temp = 0;
        for (int j = 1; j < solution.length; j++) {
            if(result < solution[j]){
                result = solution[j];
                temp = j-1;
            }
        }

        // create the maximum subarray
        LinkedList linkedList = new LinkedList();
        // System.out.println(temp);
        int end = 0;
        for (int j = temp; j > 0; j--) {
            end += a[j];
            linkedList.addFirst(a[j]);
            if (end == result){
                break;
            }
        }
        System.out.println("MAX SUBARRAY: " + linkedList.toString());

        return result;
    }
}
