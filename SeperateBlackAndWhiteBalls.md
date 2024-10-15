# 2938. Separate Black and White Balls(👎)

## Problem
There are n balls on a table, each ball has a color black or white.

You are given a 0-indexed binary string s of length n, where 1 and 0 represent black and white balls, respectively.

In each step, you can choose two adjacent balls and swap them.

Return the minimum number of steps to group all the black balls to the right and all the white balls to the left.

## Example
Input: s = "101"
Output: 1

## Constraints
- 1 <= n == s.length <= 10<sup>5</sup>
- s[i] is either '0' or '1'.

## Approach-1: Two Pointers
The idea here is to work with the white balls. If we manage to solve the problem of placing the white balls at their actual positions, we have automatically placed black balls at their position too, due to the swapping operation.

- Maintain a pointer to the position at which a white ball must be present.
- Maintain two variables, whiteBalls and totalSwaps.
- Traverse the string, if you find a white ball, increment totalSwaps by the position you are at - whiteBalls.
- Increment whiteBalls
- Finally, return totalSwaps.

```java
class Solution{
    public long minimumSteps(String s){
        long whiteBalls = 0, totalSwaps = 0;

        for(int currentPos = 0; currentPos < s.length(); currentPos++){
            if(s.charAt(currentPos) == '0'){
                totalSwaps += currentPos - whiteBalls;
            }
            whiteBalls++;
        }

        return totalSwaps;
    }
}
```

## Approach-2: Simple Counter
The idea here is to simply count the number of black balls. Say we find a white ball. The number of places it needs to move to the left is the total number of black balls before it, or in a way until it finds a white ball.

- Maintain pointers `totalSwaps` and `blackBallsFound`.
- Traverse the string.
- If a white ball is found, increment `totalSwaps` with `blackBallsFound`.
- Else, increment blackBallsFound.

```java
class Solution{
    public long minimumSteps(String s){
        long totalSwaps = 0, blackBallsFound = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '0'){
                totalSwaps += blackBallsFound;
            }
            else{
                blackBallsFound++;
            }
        }

        return totalSwaps.
    }
}
```