class Solution {
    void swap (int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    void reverse(int[] nums, int start){
        int i = start;
        int j = nums.length - 1;
        while (i < j){
            swap(nums, i, j);
            i++;
            j--;
        }
    }
    public void nextPermutation(int[] nums) {
        int ind1 = -1;
        int ind2 = -2;
        int n = nums.length;
        //find breaking point
        for (int i = n-2; i >= 0; i--){
            if (nums[i] < nums[i+1]){
                ind1 = i;
                break;
            }
        }
        
        //if no breaking point
        if (ind1 == -1) reverse(nums, 0);
        else {
            //find next greater element and assingn to ind2
            for (int i = n-1; i >= 0; i--){
                if (nums[i] > nums[ind1]){
                    ind2 = i;
                    break;
                }
            }
            swap(nums, ind1, ind2);
            //reverse right half
            reverse(nums, ind1+1);
        }
    }
}