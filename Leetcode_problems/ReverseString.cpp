// problem link
// https://leetcode.com/problems/reverse-prefix-of-word/submissions/1246698339/?envType=daily-question&envId=2024-05-01

class Solution {
public:
    string reversePrefix(string word, char ch) {
        queue<char> q;
        int flag = 0;
        string res = "";

        for(char i : word){
            if(flag == 0){
                q.push(i);
                if(i == ch){
                    flag = 1;
                }
            }else{
                res += i;
            }
        }

        while(q.size() > 0){
            res = q.front() + res;
            q.pop();
        }

        if(flag == 0){
            string res2 = "";
            for(char i : word){
                res2 = res2 + i;
            }

            return res2;
        }else{
            return res;
        }
    }
};
