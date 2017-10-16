class Solution {
    public int findLengthOfLCIS(int[] nums) {
     
		if (nums ==  null || nums.length == 0)
			return 0;
		else if (nums.length == 1)
			return 1;
		else {
			
			int currentMaxLength=1, maxSoFar = 0;
			
			for (int i=0; i< nums.length-1; i++) {
				if (nums[i+1] > nums[i]) {
					++currentMaxLength;
					maxSoFar = Math.max(maxSoFar, currentMaxLength);
				}
				else
					currentMaxLength=1;
			}
			
			return Math.max(currentMaxLength,maxSoFar);
			
		}	
    }
}