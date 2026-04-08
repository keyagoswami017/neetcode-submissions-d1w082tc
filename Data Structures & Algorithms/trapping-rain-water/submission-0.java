class Solution {
    public int trap(int[] height) {
        if(height.length == 0 || height == null)
            return 0;
        int i = 0, j = height.length - 1;
        int iMax = height[i] , jMax = height[j];
        int count = 0;
        while(i < j){
            if(iMax < jMax){
                i++;
                iMax = Math.max(iMax,height[i]);
                count += iMax - height[i];
            }
            else{
                j--;
                jMax = Math.max(jMax, height[j]);
                count += jMax - height[j];
            }
        }
        return count;
    }
}
