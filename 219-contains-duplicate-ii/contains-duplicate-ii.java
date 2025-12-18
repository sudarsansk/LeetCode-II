class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        // Map<Integer, Integer> map = new HashMap<>();
        // for(int i=0; i < nums.length; i++){
        //     if(map.containsKey(nums[i])){
        //         if(i - map.get(nums[i]) <= k){
        //             return true;
        //         }
        //     }
        //     map.put(nums[i], i);
        // }
        // return false;

        //Using HashSet
        Set result = new HashSet();
        for(int i=0; i<nums.length; i++){
            if(result.contains(nums[i])) return true;
            result.add(nums[i]);
            if(result.size() > k){
                result.remove(nums[i - k]);
            }
        }
        return false;
    }
}