class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> arr = new ArrayList<Integer>();
        HashMap<Integer, Integer> hMap = new HashMap<>();
        int counter = 1;

        for(int i=0; i < nums.length; i++) {
            if (!hMap.containsKey(nums[i])) {
                hMap.put(nums[i], i);
            }
        }

        while (counter <= nums.length) {
            if (!hMap.containsKey(counter)) {
                arr.add(counter);
            }
            counter++;
        }

        return arr;

    }
}