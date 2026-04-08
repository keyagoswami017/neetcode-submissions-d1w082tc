class Solution {
    public int lengthOfLongestSubstring(String s) {
        int count = 0,i = 0;
        Set<Character> hs = new HashSet<>();
        for(int j = 0 ; j < s.length() ; j++){
            while(hs.contains(s.charAt(j))){
                hs.remove(s.charAt(i));
                i++;
            }
            hs.add(s.charAt(j));
            count = Math.max(count, j - i + 1);
        }
        return count;
    }
}
