class Solution {
    public int findDuplicate(int[] nums) {
        Map<Integer,Integer> hm = new HashMap<>();

        for(int n : nums)
            hm.put(n, hm.getOrDefault(n,0) + 1);
        
        int max = -1, res = 0;
        for(int n : nums){
            int val = hm.get(n);
            if ( val > max){
                max = val;
                res = n;
            }
        }
        return res;
    }
}
