
/*
========================================================
PROBLEM: Valid Palindrome
========================================================

Given:
A string s

Return:
true  -> if palindrome
false -> otherwise

IMPORTANT:
Ignore:
- spaces
- commas
- special symbols
- uppercase/lowercase

========================================================
APPROACH 2 : TWO POINTER APPROACH (OPTIMAL)
========================================================

MOST IMPORTANT APPROACH

--------------------------------------------------------
IDEA
--------------------------------------------------------

Use two pointers:

left  -> start of string
right -> end of string

--------------------------------------------------------
LOGIC
--------------------------------------------------------

1. Ignore non-alphanumeric characters

2. Compare characters:
      s[left] and s[right]

3. If not equal:
      return false

4. Move pointers:
      left++
      right--

5. If entire string checked:
      return true

--------------------------------------------------------
WHY THIS APPROACH IS BETTER?
--------------------------------------------------------

- No extra string creation
- No reverse string needed
- Constant extra space

--------------------------------------------------------
TIME COMPLEXITY  : O(n)
SPACE COMPLEXITY : O(1)

BEST APPROACH

========================================================
*/

import java.util.*;

class A02_valid_palindrome {

    public boolean isPalindrome(String s) {

        // left pointer
        int left = 0;

        // right pointer
        int right = s.length() - 1;

        // loop until pointers cross
        while(left < right) {

            // skip non-alphanumeric from left
            while(left < right &&
                  !Character.isLetterOrDigit(s.charAt(left))) {

                left++;
            }

            // skip non-alphanumeric from right
            while(left < right &&
                  !Character.isLetterOrDigit(s.charAt(right))) {

                right--;
            }

            // convert both characters to lowercase
            char leftChar =
                    Character.toLowerCase(s.charAt(left));

            char rightChar =
                    Character.toLowerCase(s.charAt(right));

            // compare characters
            if(leftChar != rightChar) {
                return false;
            }

            // move pointers
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {

        A02_valid_palindrome obj = new A02_valid_palindrome();

        String s = "A man, a plan, a canal: Panama";

        System.out.println(obj.isPalindrome(s));
    }
}
