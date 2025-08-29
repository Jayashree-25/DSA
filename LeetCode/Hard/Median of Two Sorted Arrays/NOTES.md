
          Median of Two Sorted Arrays

          - Summary: This Java code efficiently finds the median of two sorted arrays using a binary search approach.  It leverages arrays to store input data and employs a while loop with a binary search strategy to efficiently locate the partition point that divides the combined array into two halves with equal or near-equal elements. Based on this partition, it calculates and returns the median. The algorithm ensures that the longer array is always passed as the second argument, optimizing the search process.

          - Time Complexity: O(log(min(m, n))), where m and n are the lengths of the input arrays. This is because the while loop performs a binary search on the smaller array, resulting in a logarithmic time complexity.
          - Space Complexity: O(1). The algorithm uses a constant amount of extra space to store variables like low, high, partitionX, partitionY, maxLeftX, minRightX, maxLeftY, and minRightY.  The space used does not depend on the size of the input arrays.
          