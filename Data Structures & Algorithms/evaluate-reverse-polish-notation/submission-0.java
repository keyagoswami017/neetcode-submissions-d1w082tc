class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> s = new Stack<>();
        for(String str : tokens){
                if(str.equals("+")){
                    int top = s.pop();
                    int newTop = s.pop();
                    s.push(top + newTop);
                }
                else if (str.equals("*")){
                    int top = s.pop();
                    int newTop = s.pop();
                    s.push(top * newTop);
                }
                else if (str.equals("/")){
                    int top = s.pop();
                    int newTop = s.pop();
                    s.push(newTop / top);
                }
                else if (str.equals("-")){
                    int top = s.pop();
                    int newTop = s.pop();
                    s.push(newTop - top);
                }
                else
                    s.push(Integer.parseInt(str)); 
        }
        if(!s.isEmpty())
            return s.peek();
        else
            return 0;
    }
}
