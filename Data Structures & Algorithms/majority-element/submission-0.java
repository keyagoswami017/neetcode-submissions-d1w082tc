class Solution {
    public int majorityElement(int[] nums) {
        double major = nums.length / 2;

        Map<Integer,Integer> maxCount = new HashMap<>();
        for(int n : nums) 
            maxCount.put(n,maxCount.getOrDefault(n,0)+1);

        for(int key : maxCount.keySet())
            if(maxCount.get(key) > major)
                return key;
        return -1;
    }
}