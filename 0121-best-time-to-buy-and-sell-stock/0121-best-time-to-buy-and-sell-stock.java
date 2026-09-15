class Solution {
    public int maxProfit(int[] pr) {
        int maxcur =0, maxf=0;
        for(int i=1;i<pr.length;i++){
            maxcur = Math.max(0,maxcur+=pr[i]-pr[i-1]);
            maxf=Math.max(maxcur,maxf);
        }
        return maxf;
    }
}