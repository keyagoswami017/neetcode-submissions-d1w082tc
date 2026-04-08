class Solution {
    public void reverseString(char[] s) {
        if(s.length != 0){
            for(int i = 0, j = s.length - 1 ;i < s.length - 1 && j >=0 ; i++,j-- ){
                if(i < j){
                    char c = s[i];
                    s[i] = s[j];
                    s[j] = c;
                }
                else
                    break;
                
            }
        }
    }
}