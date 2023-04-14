class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n=nums.length;
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=Integer.MIN_VALUE;
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(nums[j]>nums[i]){
                    arr[i]=nums[j];
                    break;
                }
            }
            if(arr[i]==Integer.MIN_VALUE){
                for(int j=0;j<i;j++){
                    if(nums[j]>nums[i]){
                        arr[i]=nums[j];
                        break;
                    }
                }
            }
        }
        for(int i=0;i<n;i++){
            if(arr[i]==Integer.MIN_VALUE){
                arr[i]=-1;
            }
        }
        return arr;
    }
}

//LINK:-https://leetcode.com/problems/next-greater-element-ii/