/*
Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.
*/

class Solution {
    int k=0;
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
          int[] res = new int[n];
        for(int i=0;i<nums.length; i++){
            res[k]= nums[i]*nums[i];
            k++;
        }
          int temp = 0;
        for(int i=0; i<k; i++){
            for(int j=1; j<k-i;j++){
                if(res[j-1]>res[j]){
              temp = res[j-1];
                 res[j-1] = res[j];
                res[j] = temp;  
                }

            }
        }
        return res;
        
    }
}
