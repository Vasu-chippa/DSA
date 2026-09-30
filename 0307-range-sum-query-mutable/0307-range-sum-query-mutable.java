class NumArray {
    static int[] tree;
    static int[] nums;
    static void build(int i, int st, int end ,int[] arr){
        if(st==end){
            tree[i] =arr[st];
            return;
        }
        int mid = (st+end)/2;
        build(2*i+1,st,mid,arr);
        build(2*i+2,mid+1,end,arr);
        tree[i]= tree[2*i+1]+tree[2*i+2];
    }
    static void updates(int i, int st, int end , int x, int val, int[] arr){
        if(st==end){
            arr[st]=val;
            tree[i]=val;
            return;
        }
        int mid =(st+end)/2;
        if(x<=mid) updates(2*i+1,st,mid,x,val,arr);
        else updates(2*i+2,mid+1,end,x,val,arr);
        tree[i] =  tree[2*i+1]+ tree[2*i+2];
    }
    static int query(int i, int st, int end , int l, int r){
        if( l> end  || r <st ) return 0;
        if(l<=st && end<=r) return tree[i];
        int mid =(st+end)/2;
        return query(2*i+1,st,mid,l,r) +query(2*i+2,mid+1,end,l,r);
    }


    public NumArray(int[] nums) {
        this.nums =nums;
        tree = new int[4*nums.length];
        build(0,0,nums.length-1,nums);
    }
    
    public void update(int index, int val) {
        updates(0,0,nums.length-1,index,val,nums); 
    }
    
    public int sumRange(int left, int right) {
        return query(0,0,nums.length-1,left,right);
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * obj.update(index,val);
 * int param_2 = obj.sumRange(left,right);
 */