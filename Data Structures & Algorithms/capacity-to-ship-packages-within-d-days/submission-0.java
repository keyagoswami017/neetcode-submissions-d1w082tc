class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int left = 0, right = 0;
        for(int w : weights){
            left = Math.max(left, w);
            right += w;
        }

        int res = right;

        while(left <= right){
            int cap = (left + right) / 2;
            if(canShip(weights, days, cap)){
                res = Math.min(res, cap);
                right = cap - 1; 
            }
            else
                left = cap + 1;
        }
        return res;
    }

    private boolean canShip(int[] weights, int days, int cap){
        int ships = 1, currCap = cap;
        for(int w : weights){
            if(currCap - w < 0){
                ships++;
                if(ships > days)
                    return false;
                currCap = cap;
            }
            currCap -= w;
        }
        return true;
    }


}