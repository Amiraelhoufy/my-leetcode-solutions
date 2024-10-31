class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
List<Integer> result = new ArrayList<>();
    int n = nums.length;
    boolean[] check = new boolean[n+1];

    // O(n)
    for(int num: nums){
      check[num]= true;
    }

    //O(n)
    for(int i=1;i<=n;i++){
      if(!check[i]){
        result.add(i);
      }
    }

    return result;
    }
}
