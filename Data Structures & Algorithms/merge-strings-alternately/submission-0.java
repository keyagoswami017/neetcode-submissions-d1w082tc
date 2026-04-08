class Solution {
    public String mergeAlternately(String word1, String word2) {
        if(word1.length() == 1)
            return word1+word2;
        int len1 = word1.length() , len2 = word2.length(), count1 = 0 , count2 = 0;
        String s = "";
        for(int i = 0 , j = 0; i < len1 && j < len2; i++ , j++){
            if(i < len1 ){
                s = s + word1.charAt(i);
                count1++;
            }
             
            if(j < len2 ){
                s = s + word2.charAt(j);
                count2++;
            }
        }
        if(count1 < len1 || count2 < len2 ){
            while(count1 < len1){
                s = s + word1.charAt(count1);
                count1++;
            }
            while(count2 < len2){
                s = s + word2.charAt(count2);
                count2++;
            }
        }

        return s;

    }
}