# Delete Characters To Make Fancy String (👍)

## Problem
A fancy string is a string where no three consecutive characters are equal.

Given a string s, delete the minimum possible number of characters from s to make it fancy.

Return the final string after the deletion. It can be shown that the answer will always be unique.

## Example
- Input: s = "leeetcode"<br>
- Output: "leetcode"<br>
- Explanation: Remove an 'e' from the first group of 'e's to create "leetcode".<br> No three consecutive characters are equal, so return "leetcode".

## Constrains

-  1 <= s.length <= 10<sup>5</sup>
- ```s``` consists only of lowercase English letters.

## Approach
Simple. Traverse the string. If there exists a situation where the characters before and after a certain character are the same, do not add the character to the result. Else, add to the result and return the result.

```python
class Solution:
    def makeFancyString(self, s: str) -> str:
        if len(s) == 1:
            return s
        result = ""
        result += s[0]
        
        for idx in range(1, len(s) - 1):
            if s[idx - 1] == s[idx] == s[idx + 1]:
                continue
            result += s[idx]
        
        result += s[len(s) - 1]
        return result
```