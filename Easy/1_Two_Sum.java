class Solution {
    public int[] twoSum(int[] nums, int target) {
        int left=0;
        int right=nums.length-1;
        while(left<right){
            int curr=nums[left]+nums[right];
            if(curr==target){
                return new int[]{left,right};
            }
            if(curr>target){
                right--;
            }
            if(curr<target){
                left++;
            }
        }
        return new int[]{};
        
    }
}