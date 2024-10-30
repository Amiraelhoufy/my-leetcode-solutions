class Solution {
    public int longestConsecutive(int[] nums) {
        

    if (nums == null || nums.length == 0) return 0;

    int longestSequence=1;
    int currentSequence=1;

    Arrays.sort(nums);

    for(int i=1; i<nums.length;i++){
      if(nums[i] == nums[i-1] +1){
        currentSequence++;
      }else if(nums[i] != nums[i-1]){
        longestSequence=Math.max(longestSequence,currentSequence);
        currentSequence=1;
      }
    }

    return Math.max(longestSequence,currentSequence);

}
}