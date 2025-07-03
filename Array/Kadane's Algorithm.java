//Problem: Given an integer array arr[]. You need to find the maximum sum of a subarray.
//Platform: Greeks for greeks
//Link: https://www.geeksforgeeks.org/problems/kadanes-algorithm-1587115620/1?page=1&category=Arrays&sortBy=submissions
//Time Complexity: O(n)
//Space Complexity: O(1)


//Code Below

class Solution {
    int maxSubarraySum(int[] arr) {
        int sum=0;
        int start=0;
        int ansstart=-1;
        int ansend=-1;
        int maxi=Integer.MIN_VALUE;
        int n =arr.length;
        for(int i=0;i<n;i++){
            if(sum==0){
                start=i;
            }
            sum=sum+arr[i];
            if(sum>maxi){
                maxi=sum;
                ansstart=start;
                ansend=i;
            }
            if(sum<0){
                sum=0;
            }
        }
        return maxi;
        
    }
}
