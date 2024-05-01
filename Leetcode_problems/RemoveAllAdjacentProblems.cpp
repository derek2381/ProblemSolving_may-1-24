// problem link
// https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/

class Solution {
public:
    string removeDuplicates(string s) {
        stack<char> stk;

        for(char i : s){
            if(stk.size() > 0 && stk.top() == i){
                stk.pop();
            }else{
                stk.push(i);
            }
        }

        string res = "";
        while(stk.size() > 0){
            res = stk.top()+res;
            stk.pop();
        }

        return res;
    }
};
