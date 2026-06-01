class Solution {
public:
    int maxProfit(vector<int>& prices) {
        int profit=0,low_price= INT_MAX,a=0;
        for(int i=0; i<prices.size();i++){
            if(prices[i]<low_price) low_price=prices[i];
            a=prices[i]-low_price;
            if(profit<a)profit=a;
        }
        return profit;
    }
};