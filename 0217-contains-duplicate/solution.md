## Solution

1. **Using Two Arrays**:
   - Time complexity &rarr; O(n^2)
 
```java
public static boolean containsDuplicateUsingTwoArrays(int[] nums) {
    if(nums == null || nums.length <= 1) return false;

    for(int i = 0; i < nums.length - 1; i++) {
        for (int j = i + 1; j < nums.length; j++) {
            if(nums[i] == nums[j]) {
                return true; // Duplicate found
            }
        }
    }
    return false; // No duplicates
}
```

2. **Using one Array**:
   - Time complexity &rarr; O(nlogn)
     

 
```java
public static boolean containsDuplicateUsingOneArray(int[] nums) {
  // Remove the Non-Dominant term
  // O(n log n) + O(n) =
  // Time Complexity O(n log n)

    if(nums == null || nums.length <= 1) return false;

    // Sort Array ((like Merge Sort) Bring the duplicate values next to each other
    // O(n log n)
    Arrays.sort(nums); // Sort the array

    // O(n)
    for(int i = 0; i < nums.length - 1; i++) {
        if(nums[i] == nums[i + 1]) {
            return true; // Duplicate found
        }
    }
    return false; // No duplicates
}
```

3. **Using HashSet**:
   - Time complexity &rarr; O(n)
     
 
```java
public static boolean containsDuplicateUsingHashset(int[] nums) {

    // O(1)
    if(nums == null || nums.length <= 1) return false;

    HashSet<Integer> seen = new HashSet<>();

    // O(N) * O(1) = O(N)
    for (int num:nums){
      // contains() and add(): Both contains and add are average O(1)

     /* if(seen.contains(num)){
        return true;
      }
      seen.add(num);

    */

      // Better approach
      // add() returns false if num is already found in set

      if(!seen.add(num)){
        return true; // duplicate found
      }

    }
    return false;

}

```


## Summary

1. **Using Two Arrays**: a brute-force approach &rarr; **O(n^2)**
2. **Using one Array**:  Sorts the array first &rarr; **O(nlogn)**
3. **Using HashSet**: using a HashSet for efficient lookup &rarr; **O(n)**
 
