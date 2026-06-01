class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
        int k=0,a=nums.at(0);
        for(int i=1; i<nums.size(); i++){
            if(a==nums.at(i)) continue;
            else{
                a=nums.at(i);
                nums.at(k+1)=a;
                k++;
            }
        }
        return k+1;
    }
};