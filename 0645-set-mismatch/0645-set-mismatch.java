class Solution {
    public int[] findErrorNums(int[] nums) {
        int n=nums.length;
        int xor=0;
       for(int i=0;i<n;i++){
           xor=xor^nums[i];
       }
       for(int i=1;i<=n;i++){
           xor=xor^i;
       }
        int rightMostSetBit= xor & ~(xor-1);
        int x=0,y=0;
        for(int val:nums){
            if((val&rightMostSetBit)==0)
                x=x^val;
            else
                y=y^val;
        }
        for(int i=1;i<=n;i++){
            if((i&rightMostSetBit)==0)
                x=x^i;
            else
                y=y^i;
        }
        int rep=0,miss=0;
        for(int val:nums){
            if(val==x){
                rep=x;
                miss=y;
                break;
            }
            else if(val==y){
                rep=y;
                miss=x;
                break;
                
            }
        }
        
        return new int []{rep,miss};
    }
}