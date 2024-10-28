<h2><a href="https://leetcode.com/problems/contains-duplicate">217. Contains Duplicate</a></h2><h3>Easy</h3><hr><p>Given an integer array <code>nums</code>, return <code>true</code> if any value appears <strong>at least twice</strong> in the array, and return <code>false</code> if every element is distinct.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<div class="example-block">
<p><strong>Input:</strong> <span class="example-io">nums = [1,2,3,1]</span></p>

<p><strong>Output:</strong> <span class="example-io">true</span></p>

<p><strong>Explanation:</strong></p>

<p>The element 1 occurs at the indices 0 and 3.</p>
</div>

<p><strong class="example">Example 2:</strong></p>

<div class="example-block">
<p><strong>Input:</strong> <span class="example-io">nums = [1,2,3,4]</span></p>

<p><strong>Output:</strong> <span class="example-io">false</span></p>

<p><strong>Explanation:</strong></p>

<p>All elements are distinct.</p>
</div>

<p><strong class="example">Example 3:</strong></p>

<div class="example-block">
<p><strong>Input:</strong> <span class="example-io">nums = [1,1,1,3,3,4,3,2,4,2]</span></p>

<p><strong>Output:</strong> <span class="example-io">true</span></p>
</div>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= nums.length &lt;= 10<sup>5</sup></code></li>
	<li><code>-10<sup>9</sup> &lt;= nums[i] &lt;= 10<sup>9</sup></code></li>
</ul>

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
 
