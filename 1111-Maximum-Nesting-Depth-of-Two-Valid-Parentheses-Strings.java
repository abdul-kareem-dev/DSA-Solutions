class Solution {
    public int[] maxDepthAfterSplit(String seq) {
        int depth = 0;
        int n = seq.length();
        int[] ans = new int[n];
        
        for (int i = 0; i < n; i++){
            if(seq.charAt(i) == '('){
                depth++;
                ans[i] = depth % 2 ;
            }else if(seq.charAt(i) == ')'){
                ans[i] = depth % 2;
                depth--;
            }
        }
        
        return ans;
    }
}