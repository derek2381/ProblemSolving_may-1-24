// problem link
// https://leetcode.com/problems/minimum-string-length-after-removing-substrings/description/

class Solution {
public:
    int minLength(string s) {
        stack<char> stk;

        for(char i : s){
            if(stk.size()  > 0 && i == 'B'){
                if(stk.top() == 'A'){
                    stk.pop();
                }else{
                    stk.push(i);
                }
            }else if(stk.size() > 0 && i == 'D'){
                if(stk.top() == 'C'){
                    stk.pop();
                }else{
                    stk.push(i);
                }
            }else{
                stk.push(i);
            }
        }

        return stk.size();

    }
};
