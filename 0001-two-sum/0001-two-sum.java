class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
        HashMap<Integer, Integer> hMap = new HashMap<>();

        for(int i=0; i < nums.length; i++) {
            if(hMap.containsKey(target - nums[i])) {
                arr[0] = hMap.get(target - nums[i]);
                arr[1] = i;
                return arr;
            }
            hMap.put(nums[i], i);
        }

        return arr;                                       
    }
}