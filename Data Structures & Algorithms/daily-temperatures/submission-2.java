class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] output = new int[temperatures.length];
        Stack<Integer> st = new Stack<>();

        st.push(temperatures.length - 1);
        output[temperatures.length - 1] = 0;

        for(int i = temperatures.length - 2 ; i >= 0 ;i--){
            while(!st.isEmpty() && temperatures[st.peek()] <= temperatures[i])
                st.pop();
            
            output[i] = st.isEmpty() ? 0 : Math.abs(st.peek() - i);
            st.push(i);    

        }

        return output;

        
    }
}
