class Solution {
    public int maxDepth(String s) {
        int ans = 0;
        int counter = 0;
        int close = 0;
        int open = 0;
        int n = s.length();

        for(int i = 0; i < n; i++){
            if(s.charAt(i) == '('){
                counter++;
                open++;
                if(counter > ans){
                    ans = counter;
                }
            }else if(s.charAt(i) == ')'){
                close++;
                counter = counter-1;
                if(close >= open){
                    counter = 0;
                }
            }
        }
        return ans;
    }
}