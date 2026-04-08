class Solution {
    public int characterReplacement(String s, int k) {
        int result = 0;
        Set<Character> cSet = new HashSet<>();
        for(char c : s.toCharArray())
            cSet.add(c);
        
        for(char c : cSet){
            int count = 0 , left = 0;
            for(int right = 0 ; right < s.length(); right++){
                 if(s.charAt(right) == c)
                    count++;
                    
                while( (right - left + 1) - count > k){
                    if(s.charAt(left) == c)
                        count--;
                    left++;
                }
                result = Math.max(result, right - left + 1);
            }
               
            
        }
        return result;
    }
}
