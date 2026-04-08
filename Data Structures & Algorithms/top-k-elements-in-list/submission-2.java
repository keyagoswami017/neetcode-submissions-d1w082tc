class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> hm = new HashMap<>();
        List<Integer>[] freq = new List[nums.length + 1];
        for(int i = 0 ;i < freq.length ; i++)
            freq[i] = new ArrayList<>();
        
        for(int n : nums)
            hm.put(n,hm.getOrDefault(n,0)+1);
        for(Map.Entry<Integer, Integer> entry : hm.entrySet())
            freq[entry.getValue()].add(entry.getKey());

        int [] output = new int [k];
        int idx = 0;
        for(int i = freq.length - 1 ; i > 0 && idx < k ; i-- ){
            for(int n : freq[i]){
                output[idx++] = n;
                if(idx == k)
                    return output;
            }
        }
        return output;

        
          
    }
}
