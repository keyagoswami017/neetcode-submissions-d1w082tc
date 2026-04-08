class Solution {
    public boolean validPalindrome(String s) {
        int i = 0 , j = s.length() - 1;
        while(i < j){
            char c1 = s.charAt(i), c2 = s.charAt(j);
            if(!(Character.isLetterOrDigit(c1))){
                i++;
                continue;
            }
            else if(!(Character.isLetterOrDigit(c2))){
                j--;
                continue;
            }
            else if(c1 != c2){
                 return isPalindrome(s,i+1,j) || isPalindrome(s,i,j-1);
            }
            i++;
            j--;
        }
        return true;   
    }

    public boolean isPalindrome(String s ,int a, int b){
        while(a < b){
            if(s.charAt(a) != s.charAt(b))
                return false;
            a++;
            b--;   
        }
        return true;
    }
}