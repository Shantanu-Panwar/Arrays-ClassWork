class Solution {
public:
    vector<int> shortestToChar(string str, char c) {
        int n=str.size();
        vector<int>left(n),right(n);
        vector<int>v(n);
        int first=INT_MAX;
        int second=INT_MAX;
        for(int i=0;i<n;i++)
        {
            if(str[i]==c)
            {
                first=i;
                left[i]=first;
            }
            else{
                left[i]=first;
            }
        }
        for(int i=n-1;i>=0;i--)
        {
            if(str[i]==c)
            {
                second=i;
                right[i]=second;
                
            }
            else{
                right[i]=second;
            }
        }
        for(int i=0;i<n;i++)
        {
            v[i]=min(abs(abs(i-left[i])),abs(i-right[i]));
        }
        return v;
    }
};