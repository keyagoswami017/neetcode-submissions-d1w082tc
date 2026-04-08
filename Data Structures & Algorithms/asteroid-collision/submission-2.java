class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> s = new Stack<>();

        for(int i : asteroids){
           while(!s.isEmpty() && i < 0 && s.peek() > 0){
                int diff = i + s.peek();
                if(diff < 0)
                    s.pop();
                else if( diff > 0)
                    i = 0;
                else {
                    i = 0;
                    s.pop();
                }
           }
           if( i != 0)
                s.push(i);
        }

        return s.stream()
                .mapToInt(Integer::intValue)
                .toArray();

    }
}