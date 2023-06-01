package container_with_most_water;

import interfaces.Solution;

// You are given an integer array height of length n.
// There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).
// Find two lines that together with the x-axis form a container, such that the container contains the most water.
// Return the maximum amount of water a container can store.
// Notice that you may not slant the container.


// Seems this will work, it's just too slow though.

public class LeetSolution implements Solution {

    public int maxArea(int [] heights) {

        // so we start from each end, and then only move the pointer inwards to find
        // a line with greater height?

        return 0;
    }

    public int maxAreaBrute(int[] heights) {
        int mostWater = Integer.MIN_VALUE;
        for (int i = 0; i < heights.length; i++) {
            int width = 1;
            for (int j = i + 1; j < heights.length; j++) {
                int min = Math.min(heights[i], heights[j]);
                int water = min * width;
                if(water > mostWater) {
                    mostWater = water;
                }
                width++;
            }
        }
        return mostWater;
    }

    @Override
    public void Solve() {


        System.out.println(maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}) == 49);
        System.out.println(maxArea(new int[]{1,1}) == 1);

    }
}
