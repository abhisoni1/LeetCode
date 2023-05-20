class Solution {
    public int minSubArrayLen(int target, int[] nums) {

        int start = 0;
        int end = 0;
        int currentSum = 0;

        int minLength = 0;

        while ( end < nums.length ){
            currentSum += nums[end];
            end++;

            while ( start < end && currentSum >= target ){


                currentSum -= nums[start];
                start++;

                if ( minLength == 0){
                    minLength = end-start+1;
                }

                minLength = Math.min(minLength, end-start+1 );


            }


        }
        return minLength;
    }
}