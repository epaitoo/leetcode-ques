class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> hMap = new HashMap<Integer, Integer>();
        for (int i=0; i <nums.length; i++) {
            if (hMap.containsKey(nums[i])) {
                return true;
            }
            hMap.put(nums[i], i);
        }
        return false;
    }
}