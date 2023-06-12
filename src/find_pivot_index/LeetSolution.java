package find_pivot_index;

import interfaces.Solution;

public class LeetSolution implements Solution {
    public int pivotIndex(int []nums) {
        int pivot = -1;

        if(nums.length < 3) {
            return pivot;
        }
        for (int i = 0; i < nums.length; i++) {
            int left = 0;
            int right = 0;

            for(int j = 0; j < i; j++){
                left += nums[j];
            }

            for(int k = i+1; k < nums.length; k++){
                right += nums[k];
            }

            if(left == right){
                return i;
            }
        }
        return pivot;
    }

    @Override
    public void Solve() {
        System.out.println(pivotIndex(new int[]{1,2,3,4}));
    }
}
