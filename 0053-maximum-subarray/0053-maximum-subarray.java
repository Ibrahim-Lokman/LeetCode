class Solution {
    public int maxSubArray(int[] nums) {
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int num : nums){
            //Update the currSum by adding the current element num to it. 
            // This step essentially builds the sum of the current subarray.
            currentSum += num;
            
            if(num > currentSum){
                //This step handles the case where the current element alone 
                // forms a subarray with a larger sum than the previous subarray.
                currentSum = num;
            }
            //Update the maxSum by taking the maximum of the current maxSum and the updated currSum. 
            //This step keeps track of the maximum sum encountered so far.
            maxSum = Math.max(maxSum, currentSum);


        }
        return maxSum;
    }
}