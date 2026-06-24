class Solution {
public:
    unordered_map<int,int> mp;
    int idx = 0;
    TreeNode* build(vector<int>& preorder, int l, int r) {
        if(l > r) return nullptr;
        int val = preorder[idx++];
        TreeNode* root = new TreeNode(val);
        int pos = mp[val];
        root->left = build(preorder, l, pos - 1);
        root->right = build(preorder, pos + 1, r);
        return root;
    }
    TreeNode* buildTree(vector<int>& preorder, vector<int>& inorder) {
        for(int i = 0; i < inorder.size(); i++) {
            mp[inorder[i]] = i;
        }
        return build(preorder, 0, inorder.size() - 1);
    }
};