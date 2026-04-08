class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer,Integer> countMap = new HashMap<>();

        for(int i = 0;i < nums.length;i++)
            countMap.put(nums[i],countMap.getOrDefault(nums[i],0)+1);
        
        for(int key : countMap.keySet())
            if(countMap.get(key) > 1)
                return true;
        
        return false;
    }
}
