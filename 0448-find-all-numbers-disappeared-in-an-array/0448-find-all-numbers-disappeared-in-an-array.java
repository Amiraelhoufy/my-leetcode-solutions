class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
            List<Integer> list = new ArrayList<>();

    HashSet<Integer> set = new HashSet<>();

    // O(n)
    for(int num: nums){
      set.add(num);
    }

    // O(n)
    for(int i=1;i<=nums.length;i++){

      if(!set.contains(i)){
        list.add(i);
      }
    }

    return list;
  }

}
