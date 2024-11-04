## Solution

1. **Using Dynamic Programming**:
   - Time complexity &rarr; O(n)
   - Space complexity &rarr; O(n)
 
```java
public static int climbStairs(int n) {
    if(n<=2) return n;
    int dp[] = new int[n+1];
    dp[1]= 1;
    dp[2]= 2;
    for(int i=3;i<=n;i++){
      dp[i] = dp[i-1] + dp[i-2];
    }
    return dp[n];

  }
```

2. **Using Fibonacci**:
  - Time complexity &rarr; O(n)
   - Space complexity &rarr; O(1)     
 
```java

  public static int climbStairsFibonacci(int n) {
    if(n<=2) return n;

    int a=  1;
    int b = 2;

    for(int i=3;i<=n;i++){
      int current = a + b;
      a = b;
      b = current;
    }
    return b;

  }
```


## Summary

1. **Using Dynamic Programming**: 
  - Time complexity &rarr; O(n)
   - Space complexity &rarr; O(n)

2. **Using Fibonacci**:
  - Time complexity &rarr; O(n)
   - Space complexity &rarr; O(1)
 
