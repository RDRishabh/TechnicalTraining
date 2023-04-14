class Solution {
    public int scoreOfParentheses(String s) {
        int n = s.length(), d = 0, R = 0;
        
        for(int i=0;i<n;i++) {
            char ch = s.charAt(i);
            if(ch == '(')
                d++;
            else {
                --d;
                if(s.charAt(i-1) == '(')
                    R += Math.pow(2, d);
            }
        }
        return R;
    }
}

//Link:-https://leetcode.com/problems/score-of-parentheses/