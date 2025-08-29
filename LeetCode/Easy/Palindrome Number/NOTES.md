
          Palindrome Number

          - Summary: The function `isPalindrome` checks if an integer `x` is a palindrome. It uses no explicit data structures beyond built-in integer variables. The algorithm first handles negative numbers and numbers ending in zero (except 0). Then, it iteratively reverses the integer `x` while comparing it to the original until either the reversed number is greater than or equal to the original or the original is reduced to a single or zero digit.  Finally, it checks if the original and reversed numbers are equal or if the original number is equal to the reversed number divided by 10 to account for odd-length palindromes.

          - Time Complexity: O(log10(x)) because the number of iterations in the while loop is proportional to the number of digits in x, which is logarithmic with respect to x. In each iteration, a constant number of operations are performed.
          - Space Complexity: O(1) because the algorithm uses only a constant amount of extra space to store variables such as `reversed`, regardless of the size of the input integer x.
          