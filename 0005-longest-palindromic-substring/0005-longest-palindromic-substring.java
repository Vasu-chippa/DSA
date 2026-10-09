class Solution {
    public String longestPalindrome(String s) {
        String ans="";
        int st=0, maxl=0;
        for(int i=0;i<s.length();i++){
           int l=i , r=i;
           while(l>=0 && r<s.length() &&s.charAt(l) ==s.charAt(r) ){
                if(r-l+1>maxl){
                    st=l;
                    maxl=r-l+1;
                }
                l--;
                r++;
             
           }

           l=i;
           r=i+1;
           while(l>=0 &&  r<s.length() && s.charAt(l)==s.charAt(r)){
                if(r-l+1>maxl){
                    st=l;
                    maxl=r-l+1;
                }
                l--;
                r++;
            
           }
        }return s.substring(st,st+maxl) ;
    }
}