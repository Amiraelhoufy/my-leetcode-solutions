import java.util.HashSet;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        if(nums == null || nums.length<= 1) return false;

        HashSet<Integer> seen = new HashSet<>();

        for(int num: nums){
            if(seen.contains(num)){
                return true;
            }
            seen.add(num);
        }

        return false;
        
    }
}