class StockSpanner {
    Stack<Pair<Integer,Integer>> st;
    int count;
    public StockSpanner() {
        st = new Stack<>();
        count = 0;
    }
    
    public int next(int price) {
        count = 1;
        while(!st.isEmpty() && st.peek().getKey() <= price)
            count += st.pop().getValue();

        st.push(new Pair<>(price,count));

        return count;

    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */