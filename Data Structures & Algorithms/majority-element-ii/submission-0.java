class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer, Integer> res = new HashMap<>();
        List<Integer> output = new ArrayList<>();
        int len = nums.length;
        for(int n : nums)
            res.put(n, res.getOrDefault(n,0)+1);
        for(int n : res.keySet())
            if(res.get(n) > len/3)
                output.add(n);

        return output;
    }
}