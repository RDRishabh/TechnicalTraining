class Solution {
    
    public String reverse(String S){
        //code here
        String str="";
        Stack<Character> s=new Stack<>();
        for(int i=0;i<S.length();i++){
            s.push(S.charAt(i));
        }
        while(!s.empty()){
            str+=s.pop();
        }
        return str;
    }

}

//Link to the question: https://practice.geeksforgeeks.org/problems/reverse-a-string-using-stack/1