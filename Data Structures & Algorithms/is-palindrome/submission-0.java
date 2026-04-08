class Solution {
    public boolean isPalindrome(String s) {
        int len = s.length();
        int i = 0, j = len-1;
        while( i < j ){
            char c1 = Character.toLowerCase(s.charAt(i)), c2 = Character.toLowerCase(s.charAt(j));
            if( !((c1 >= 'a' && c1 <='z') || (c1 >= '0' && c1 <= '9'))){
                i++;
                continue;
            }
            else if( !((c2 >= 'a' && c2 <='z') || (c2 >= '0' && c2 <= '9'))){
                j--;
                continue;
            }
            else if( c1 != c2)
                return false;
            i++;
            j--;
        }
        return true;
    }
}
