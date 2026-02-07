class maxSubArray {
    public int maxSubArray(int[] nums) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0; i<nums.length;i++){
            int temp = nums[i] + currSum;
            if(temp<nums[i]){
                currSum = nums[i];
            }
            else{
                currSum = temp; 
            }
        
        if(maxSum<currSum){
                maxSum = currSum;
            }
    }
    return maxSum;
}
}