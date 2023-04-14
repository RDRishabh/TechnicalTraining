class Solution
{
    //Function to find the next greater element for each element of the array.
    public static long[] nextLargerElement(long[] arr, int n)
    { 
        Stack<Integer> stack = new Stack<>();
        long[] result = new long[n];
        for (int i = n - 1; i >= 0; i--) {
            while (stack.isEmpty() && arr[stack.peek()] <= arr[i]) {
                stack.pop();
            }
            result[i] = stack.isEmpty() ? -1 : arr[stack.peek()];
            stack.push(i);
        }
        return result;
        // Your code here
    } 
}

//Link:- https://practice.geeksforgeeks.org/problems/next-larger-element-1587115620/1?utm_source=gfg&utm_medium=article&utm_campaign=bottom_sticky_on_article