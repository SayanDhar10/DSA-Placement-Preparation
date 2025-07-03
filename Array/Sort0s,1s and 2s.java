//Problem: Given an array arr[] containing only 0s, 1s, and 2s. Sort the array in ascending order.
//Platform: Greeks for greeks
//Link: https://www.geeksforgeeks.org/problems/sort-an-array-of-0s-1s-and-2s4231/1?page=1&category=Arrays&sortBy=submissions
//Time Complexity: O(n)
//Space Complexity: O(1)


//Code Below

class Solution {
    // Function to sort an array of 0s, 1s, and 2s
    public void sort012(int[] arr) {
        int count0=0;
        int count1=0;
        int count2=0;
        int n=arr.length;
        for(int i =0;i<n;i++){
            if(arr[i]==0){
                count0++;
            }
            else if(arr[i]==1){
                count1++;
            }
            else{
                count2++;
            }
        }
        for(int i=0;i<count0;i++) arr[i]=0;
        for(int i=count0;i<count0+count1;i++) arr[i]=1;
        for(int i=count0+count1;i<n;i++) arr[i]=2;
        
    }
}