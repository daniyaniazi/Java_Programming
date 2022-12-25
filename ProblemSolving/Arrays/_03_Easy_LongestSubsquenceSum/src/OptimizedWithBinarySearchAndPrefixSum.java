class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        Arrays.sort(nums);

        int[] ans= new int[queries.length];

        for(int i=1;i<nums.length;i++){
            nums[i]= nums[i]+nums[i-1];
        }
        for(int i=0;i<queries.length;i++){
            int count = binarySearch(nums,nums.length,queries[i]);
            ans[i]=count;
        }

        return ans;
    }
    public int  binarySearch(int[] nums, int n , int item){
        int s=0;
        int e=n-1;

        int res=-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(nums[mid]<=item){
                res=mid;
                s=mid+1;
            }else{
                e=mid-1;
            }
        }
        return res+1;
    }
}