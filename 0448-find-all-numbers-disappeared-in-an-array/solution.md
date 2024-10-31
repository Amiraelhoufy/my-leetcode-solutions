## Solution

1. **Using Boolean Array**:
   - Time complexity &rarr; O(n)
   - Space complexity &rarr; O(n)
     

 
```java 
 public static List<Integer> findDisappearedNumbers(int[] nums) {
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

```

2. **Using HashSet**:
   - Time complexity &rarr; O(n)
   - Space complexity &rarr; O(n)
     
 
```java

  public static List<Integer> findDisappearedNumbersUsingHashset(int[] nums) {
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
```


## Summary

1. **Using boolean Array**: slight advantage in terms of performance, as array access is generally faster than the HashSet operations &rarr; **O(n)**
2. **Using HashSet**:  &rarr; **O(n)**
 
