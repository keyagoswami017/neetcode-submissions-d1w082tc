class Solution {
    public int maxArea(int[] heights) {
        int i = 0 , j = heights.length - 1, res = 0;
        while(i < j){
            int area = Math.min(heights[i],heights[j]) * (j - i);
            res = Math.max(area,res);
            if( heights[i] <= heights[j] )
                i++;
            else
                j--;
        }
        return res;
    }
}
