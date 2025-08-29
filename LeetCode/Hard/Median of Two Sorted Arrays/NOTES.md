
          Median of Two Sorted Arrays

          - Summary: This Java code efficiently finds the median of two sorted arrays using binary search. It employs arrays as the primary data structure to store input numbers. The algorithm cleverly partitions the arrays to find the middle elements, handling both even and odd total element counts.  A key logic decision involves adjusting the binary search's boundaries based on whether the current partition satisfies the median condition.

          - Time Complexity: O(log(min(m, n))), where 'm' and 'n' are the lengths of the input arrays. This is because the algorithm uses binary search on the smaller array, resulting in a logarithmic time complexity.
          - Space Complexity: O(1). The algorithm uses a constant amount of extra space to store variables, irrespective of the input array sizes.
          