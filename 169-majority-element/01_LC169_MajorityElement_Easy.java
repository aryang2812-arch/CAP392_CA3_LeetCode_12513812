class Solution {
    public int majorityElement(int[] nums) {
        int cnt=0;
        int el =0;
        int len=nums.length;
        for(int i=0;i<len;i++){
            if(cnt==0){
                cnt=1;
                el=nums[i];
            }
            else if (nums[i]==el) {
                cnt++;
            }
            else{
                cnt--;
            }
        }
        return el;
    }
}
