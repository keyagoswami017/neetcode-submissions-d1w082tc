class Solution {
    public String decodeString(String s) {
        Stack<String> stringSt = new Stack<>();
        Stack<Integer> countSt = new Stack<>();
        int k = 0;
        StringBuilder cur = new StringBuilder();

        for(Character c : s.toCharArray()){
            if(Character.isDigit(c))
                k = k * 10 +(c - '0');
            else if(c == '['){
                stringSt.push(cur.toString());
                countSt.push(k);
                cur = new StringBuilder();
                k = 0;
            }
            else if(c == ']'){
                String temp = cur.toString();
                cur = new StringBuilder(stringSt.pop());
                int count = countSt.pop();
                for(int i = 0 ; i<count ; i++)
                    cur.append(temp);
            }
            else
                cur.append(c);
        }
        return cur.toString();
    }
}