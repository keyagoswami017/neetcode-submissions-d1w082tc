class Solution {
    public boolean isPalindrome(String s) {
        int len = s.length();
        int i = 0, j = len-1;
        while( i < j ){
            char c1 = s.charAt(i), c2 = s.charAt(j);
            if( !(Character.isLetterOrDigit(c1))){
                i++;
                continue;
            }
            else if( !(Character.isLetterOrDigit(c2))){
                j--;
                continue;
            }
            else if( Character.toLowerCase(c1) != Character.toLowerCase(c2))
                return false;
            i++;
            j--;
        }
        return true;
    }
}
