## Solution


1. **Using Hashset**:
   - Time complexity &rarr; O(n)
   - Space Complexity  &rarr; O(n)
     
  
```java
public static int missingNumber(int[] nums){

    if(nums == null || nums.length ==0) return 0;

    HashSet<Integer> set = new HashSet<>();

    // O(n)
    for(int num: nums){
      set.add(num);
    }

    // O(n)
    for(int i=0; i<= nums.length;i++){
      if(!set.contains(i)){
       return i;
      }
    }
    return -1; // should not happen
  }
```

2. **Using Triangle Formula**:
   - Time complexity &rarr; O(n)
   - Space Complexity  &rarr; O(1)
     
 ![Triangle Formula](assets/Triangular-Numbers.jpg)

```java
public static int missingNumberUsingTriangularFormula(int[] nums) {
    int n = nums.length;
    int expectedSum= (n *(n+1))/2;
    int calculatedSum=0;
    for(int num:nums){
      calculatedSum+= num;
    }

    return expectedSum-calculatedSum;
  }
```

## Summary

1. **Using HashSet**: Time Complexity &rarr; **O(n)** & Space Complexity &rarr; **O(n)**
2. **Using Triangle Formula**: Time Complexity &rarr; **O(n)** & Space Complexity &rarr; **O(1)** as it doesn't require any storage
 
