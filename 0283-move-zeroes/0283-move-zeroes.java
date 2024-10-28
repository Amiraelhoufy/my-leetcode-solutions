class Solution {
    public void moveZeroes(int[] nums) {

        if(nums==null || nums.length <=1 ) return;

        int zeroIndex =0;
        for(int i=0; i<nums.length; i++){
            // Moving Non-zero element to the front
            if(nums[i] != 0){
                nums[zeroIndex] = nums[i];
                zeroIndex++;
            }
        }

        // set the last elements with zeroes
        while(zeroIndex < nums.length){
            nums[zeroIndex] = 0;
            zeroIndex++;
        }
        
    }
}