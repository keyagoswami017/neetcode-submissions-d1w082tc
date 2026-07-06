class Solution {
    public int splitArray(int[] nums, int k) {
        int l = 0, r = 0, res = 0;
        for(int n : nums){
            l = Math.max(l, n);
            r += n;
        }
        res = r;

        while( l <= r){
            int mid = l + (r - l) / 2;
            if(canSplit(nums, k, mid)){
                res = mid;
                r = mid - 1;
            }
            else{
                l = mid + 1;
            }
        }
        return res;
    }

    private boolean canSplit(int[] nums, int k, int largest){
        int subarray = 1, curSum = 0;
        for(int n : nums){
            curSum += n;
            if(curSum > largest){
                subarray++;
                if(subarray > k)
                    return false;
                curSum = n;
            }
        }
        return true;
    }
}