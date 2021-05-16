/*
Given an array nums of integers, return how many of them contain an even number of digits.
nausheen fathima
*/

class Solution {
    int[] res = new int[10000000];
    int check, j=0,k=0;
    public int findNumbers(int[] nums) {
        for(int i=0; i<=nums.length-1; i++){
        k=countNumber(nums[i]);
           if(k % 2 ==0){
               res[j] = nums[i];
               j++;
           }else{
               continue;
           }
            
        }
        return j;
        
    }
    public int countNumber(int n){
        int ndigit =0;
        while(n>0){
        ndigit++;
        n=n/10;
            }
        return ndigit;
    }
}
