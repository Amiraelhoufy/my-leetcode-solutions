## Solution

1. **Using XOR Bit Manipulation**:
   - Time complexity &rarr; O(n)
   - Space complexity &rarr; O(1)
 
```java
public static int singleNumberXORbitManipulation(int[] nums) {

    int result=0;
    for(int num: nums){
      result ^=num;
    }
      return result;

  }
```

2. **Using HashSet**:
   - Time complexity &rarr; O(n)
   - Space complexity &rarr; O(n)
 
```java
  public static int singleNumberUsingHashmap(int[] nums) {

    HashSet<Integer> set = new HashSet<>();
    for(int num: nums){
      if(!set.add(num)){
        set.remove(num);
      }
    }
    return set.iterator().next(); // return the firstElement
  }
```


## Summary

| Solution                   | Time Complexity | Space Complexity | Additional Notes                                              |
|----------------------------|-----------------|------------------|---------------------------------------------------------------|
| **1.XOR Bit Manipulation**    | O(n)           | O(1)            | Best solution for minimal space usage. Uses bit manipulation. |
| **2.HashSet**                 | O(n)           | O(n)            | Linear time but uses extra space due to the HashSet structure.|

 
