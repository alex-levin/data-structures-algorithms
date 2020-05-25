A logarithmic function is the opposite of an exponential function. When you say something grows
exponentially, it's being multiplied. When something grows logarithmically, it is being divided.
logb(x) = y iff b^y = x
In CS log(x) base is 2: log(x) = log2(x) (binary logarithm)
log(x) = y iff 2^y = x
log(N) = y iff 2^y = N
log(1) = 0 because 2^0 = 1
log(4) = 2 because 2^2 = 4
log(16) = 4 because 2^4 = 16
When we increase the power of 2 (the exponent) by 1, we double the number:
2^5 = 2^4 * 2
2^4 = 16; 2^5 = 32
2^(x+1) = 2^x * 2
2^? = N; when we double the number N, we increase ? by 1
2^4 = 16; lets double 16:
2^x = 32; x = 4 + 1 = 5
2^20 = 1048576
2^21 = 2097152
If we increase the exponent 20 by 10, we would get more then 1 bil:
2^30 = 1073741824
2^x = N; the more N increases, x increases by the tiny amount.
log(N) complexity is increasingly better that the linear complexity
log(N) = y; if N doubles, log(N) increases by only 1
log(1,048,576) = 20
log(1,073,741,824) = 30
log(N) complexity does not increase as fast as N
Its great to have the log(N) complexity.
Array: [0 1 2 3 4 5 6 7]
Cut in half and eliminate the right size for whatever reason (like in binary search):
1. [0 1 2 3 | 4 5 6 7]
2. [0 1 | 2 3]
3. [0 | 1]
[0] - nothing to cut
Total amount of operations is log(N) = log(8)
If we double the array, we will need to perform 4 operations
This algorithm has time complexity of log(N)
In binary tree we also cut in a half when doing binary tree search.

