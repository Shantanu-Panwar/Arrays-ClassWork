class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        
        int ans[]=new int[nums.length];
        for(int i=0;i<nums.length;i++)
            {   int res=0;
                for(int j=0;j<nums.length;j++)
                {
                    if(nums[j]<nums[i] && j!=i)
                    {
                        res++;
                        
                    }
                    ans[i]=res;
                }
            
        }
        return ans;
    }
}
    