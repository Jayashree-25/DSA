
          Two Sum

          - Summary: The code utilizes a single array to store input numbers. It employs nested loops to iterate through all possible pairs of numbers within the array.  For each pair, it checks if their sum equals the target value. If a pair with the target sum is found, their indices are returned; otherwise, an empty array is returned after checking all pairs.

          - Time Complexity: O(n^2) because of the nested for loops, resulting in a time complexity proportional to the square of the input array's size.
          - Space Complexity: O(1) as the algorithm uses a constant amount of extra space regardless of the input array size. The space used for storing the result array is also constant.
          