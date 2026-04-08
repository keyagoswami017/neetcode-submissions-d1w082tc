class Solution {
    public int calPoints(String[] operations) {
        Stack <Integer> st = new Stack<>();
        for(String op : operations){
            if(op.equals("+")){
                int top = st.pop();
                int newTop = top + st.peek();
                st.push(top);
                st.push(newTop);
            }
            else if(op.equals("C"))
                st.pop();
            else if(op.equals("D"))
                st.push(st.peek() * 2);
            else
                st.push(Integer.parseInt(op));
        }
        int sum = 0;
        for(int s : st)
            sum += s;
        return sum;
    }
}