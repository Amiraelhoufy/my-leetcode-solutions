class Solution {
    public int missingNumber(int[] nums) {

    if(nums == null || nums.length ==0) return 0;

    HashSet<Integer> set = new HashSet<>();

    for(int num: nums){
      set.add(num);
    }
    
    int missingNumber=0;
    for(int i=0; i<= nums.length;i++){
      if(!set.contains(i)){
        missingNumber=i;
        break;
      }
    }
    return missingNumber;
    
    }
}