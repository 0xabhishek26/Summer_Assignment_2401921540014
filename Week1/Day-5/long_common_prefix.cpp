class Solution {
public:
    string longestCommonPrefix(vector<string>& strs) {
        string ans="";
        int j=0;
        while(1){
            if(j>=strs[0].size()) {
                return ans;
            }
            char t=strs[0][j];
            for(int i=1;i<strs.size();i++) {
                if(j>=strs[i].size()||t!=strs[i][j]) {
                    return ans;
                }
            }
            ans+=t;
            j++;
        }
        return ans;
    }
};