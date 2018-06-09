package com.company;

import java.util.Arrays;
import java.util.LinkedList;

public class MaximumSubArrayColor {
    public static void main(String[] args) {
        Color arr[] = {Color.y, Color.r, Color.r, Color.g, Color.g, Color.r, Color.r, Color.g, Color.y, Color.r };
        System.out.println("INPUT: " + Arrays.toString(arr));
        System.out.println("Maximum Sum of subarray is: " + getMaxSubArray(arr));
    }

    // bottom up approach
    static int getMaxSubArray(Color[] a){
        int [] solution = new int[a.length+1];
        solution[0] = 0;

        for (int j = 1; j < solution.length; j++) {
            solution[j] = Math.max(solution[j-1] + a[j-1].getValue(), a[j-1].getValue());
        }
        // print the solution array
        System.out.println("SOLUTION ARRAY: " + Arrays.toString(solution));

        // calculate the maximum sum in the solution array
        int result = solution[0];
        int temp = 0;
        for (int j = 1; j < solution.length; j++) {
            if(result<solution[j]){
                result = solution[j];
                temp = j-1;
            }
        }

        // create the maximum subarray
        LinkedList linkedList = new LinkedList();
        // System.out.println(temp);
        int end = 0;
        for (int j = temp; j > 0; j--) {
            end += a[j].getValue();
            linkedList.addFirst(a[j]);
            if (end == result){
                break;
            }
        }
        System.out.println(linkedList.toString());

        return result;
    }
}
