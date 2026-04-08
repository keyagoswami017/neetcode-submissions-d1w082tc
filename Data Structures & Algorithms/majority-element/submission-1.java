class Solution {
    public int majorityElement(int[] nums) {
        double major = nums.length / 2;

        Map<Integer,Integer> maxCount = new HashMap<>();
        for(int n : nums) {
            maxCount.put(n,maxCount.getOrDefault(n,0)+1);
            if(maxCount.get(n) > major)
                return n;
        }
        return -1;
    }
}