## Solution

1. **Using HashMap**:
   - Time complexity &rarr; **O(n)**
   - Space complexity &rarr; **O(n)**     
 
```java
  public static int[] twoSum(int[] nums, int target) {

    Map<Integer,Integer> map = new HashMap<>();

    // O(n)
    for(int i=0; i<nums.length;i++){
      int complement = target-nums[i];
      if(map.containsKey(complement)){
        return new int[]{map.get(complement),i};
      }
      map.put(nums[i],i);
    }

    throw  new IllegalArgumentException("No two sum solution exists");
  }
```


## Summary

1. **Using HashMap**:
   - Time complexity &rarr; **O(n)**
   - Space complexity &rarr; **O(n)**
 
