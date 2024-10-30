## Solution

1. **Using Array**:
   - Time complexity &rarr; O(nlogn)
 
```java
public static int longestConsecutive(int[] nums) {

    if(nums == null || nums.length <=1) return 0;

    int longestSequence=1;
    int currentSequence=1;

    // O(n log n)
    Arrays.sort(nums);

    // O(n)
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
```

2. **Using HashSet**:
   - Time complexity &rarr; O(n)
     
 
```java
  public static int longestConsecutiveUsingSet(int[] nums) {
    if(nums == null || nums.length ==0 ) return 0;

    HashSet<Integer> set = new HashSet<>();

    int longestSequence = 0;

    // O(n)
    for(int num: nums){
      set.add(num);
    }

    // O(n): as it only runs once per sequence
    for(int num :set){

      // Make sure it's the start of the sequence
      if(!set.contains(num-1)){
        int currentNum=num;
        int currentSeq=1;

        while(set.contains(currentNum+1)){
            currentNum++;
            currentSeq++;
        }

        longestSequence= Math.max(currentSeq,longestSequence);
      }
    }

    return longestSequence;
  }
```


## Summary

1. **Using Array**:  Sorts the array first &rarr; **O(nlogn)**
2. **Using HashSet**: using a HashSet more efficient as it only runs once per sequence &rarr; **O(n)**
 
