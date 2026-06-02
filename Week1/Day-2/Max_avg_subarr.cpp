class Solution {
public:
    double findMaxAverage(vector<int>& nums, int k) {
        int wSum=0;
        for(int i=0;i<k;i++) {
            wSum+=nums[i];
        }
        int maxSum=wSum;
        for(int i=k;i<nums.size();i++) {
            wSum+=nums[i];
            wSum-=nums[i-k];
            maxSum=max(maxSum,wSum);
        }
        return (double)maxSum/k;
    }
};