class Solution {
        	 public int maxSubArray(int[] nums) {
	     
		 if (nums.length < 1)
			 return 0;
		 if (nums.length == 1)
			 return nums[0];
		 else {
		
			 int max_sum_so_far = nums[0], max_global = nums[0];
			 for (int i=1; i< nums.length; i++) {
				 max_sum_so_far = Math.max(nums[i], max_sum_so_far+nums[i]);
				 if (max_sum_so_far > max_global)
					 max_global = max_sum_so_far;
			 }
			 return max_global;
		 }
	  }
    }