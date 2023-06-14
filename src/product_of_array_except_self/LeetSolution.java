package product_of_array_except_self;

import java.util.Arrays;
import java.util.HashMap;

import interfaces.Solution;

/*
Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements
of nums except nums[i].

The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

You must write an algorithm that runs in O(n) time and without using the division operation.
 */

// this exceeds the time limit. We need to follow the directions!

public class LeetSolution implements Solution {
    private final HashMap<Integer, Integer> numberLogger = new HashMap<>();

    public int[] productExceptSelf(int[] nums) {


        for(int i = 0; i< nums.length; i++){
            numberLogger.put(i,nums[i]);
        }

        for(int i =0; i< nums.length; i++){
            final var x =  i;
            var hello = numberLogger.keySet()
                    .stream()
                    .filter(n -> n != x)
                    .map(numberLogger::get)
                    .reduce((a,v) -> a * v)
                    .orElseThrow();
            nums[i] = hello;
        }

        return nums;

    }
    @Override
    public void Solve() {
        System.out.println(Arrays.toString(productExceptSelf(new int[]{1,2,3,4})));
    }



}