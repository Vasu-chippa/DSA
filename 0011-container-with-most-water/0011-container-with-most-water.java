class Solution {
    public int maxArea(int[] h) {
        int l=0, r =h.length-1,best=0;
        while(l<r){
            int ht = Math.min(h[l],h[r]);
            best = Math.max(best,ht*(r-l));
            if(h[l]<h[r]) l++;
            else r--;
        }return best;
    }
}