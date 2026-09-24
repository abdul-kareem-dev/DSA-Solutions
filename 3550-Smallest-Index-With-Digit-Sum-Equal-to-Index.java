class Solution {
    public int smallestIndex(int[] nums) {

        int n = nums.length;
      
        int first = 0;

        for(int i = 0; i < n; i++){
            if(nums[i] <= 9 && nums[i] == i){
                first = i;
                return i;
            }else if(nums[i] >= 10){
                int sum = 0;
                int temp = nums[i];
                while(temp > 0){
                    int digit = temp%10;
                    sum += digit;
                    temp = temp/10;
                }

                if(sum == i){
                    first = i;
                    return i;
                }
            }
        }
        return -1;
    }
}