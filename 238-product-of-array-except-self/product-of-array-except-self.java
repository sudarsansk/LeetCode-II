class Solution {
    public int[] productExceptSelf(int[] nums) {
        //Using Division Operation
        //If zero is there you will get arithmetric expection

        // int product = 1;
        // int[] result = new int[nums.length];
        // for(int i=0; i< nums.length;i++){
        //     product = product * nums[i];
        // }
        // for(int j=0; j < nums.length; j++){
        //     if(nums[j] != 0){ 
        //         result[j] = product / nums[j];
        //     }
        // }
        // return result;

        //Bruce Force Approach

        // int product;
        // int[] result = new int[nums.length];
        // for(int i = 0; i < nums.length; i++){
        //     product = 1;
        //     for(int j = 0; j < nums.length; j++){
        //         if(i != j){
        //             product = product * nums[j];
        //         }
        //     }
        //     result[i] = product;
        // }
        // return result;

        //Optimal Solution
        int[] result = new int[nums.length];
        
        Arrays.fill(result,1);
        
        int pre = 1, post = 1;
        
        for(int i=0; i<nums.length; i++){
            result[i] = pre;
            pre = nums[i]*pre;
        }
        
        for(int i=nums.length-1; i>=0; i--){
            result[i] = result[i]*post;
            post = post*nums[i];
        }

        return result;
    }
}