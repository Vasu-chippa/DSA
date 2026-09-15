class Solution {
    public int maxProfit(int[] pr) {
        int maxpro =0, minp=pr[0];
        for(int i=1;i<pr.length;i++){
            maxpro = Math.max(maxpro,pr[i]-minp);
            minp=Math.min(pr[i],minp);
        }
        return maxpro;
    }
}