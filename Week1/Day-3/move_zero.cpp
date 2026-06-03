class Solution {
public:
    void moveZeroes(vector<int>& nums) {
        int idx=0;
        while(idx<nums.size()&&nums.at(idx))idx++;
        for (int i=idx+1; i<nums.size(); i++){
            if(nums.at(i)){
                int temp=nums.at(idx);
                nums.at(idx)=nums.at(i);
                nums.at(i)=temp;
                while(idx<nums.size()&&nums.at(idx))idx++;
                i=idx;
            }
        }
    };
};