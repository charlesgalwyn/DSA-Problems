class Solution {
    public boolean isMatch(String s, String p) {
        char[] str=s.toCharArray();
        char[] pattern=p.toCharArray();
        boolean[][]dp=new boolean[str.length+1][pattern.length+1];
        dp[0][0]=true;
        for (int i=1;i<dp[0].length;i++){
            if (pattern[i-1]=='*'){
                dp[0][i]=dp[0][i-2];
            }
        }
        for (int i=1;i<dp.length;i++){
            for (int j=1;j<dp[0].length;j++){
                if (pattern[j-1]=='.'|| pattern[j-1]==str[i-1]){
                    dp[i][j]=dp[i-1][j-1];
                }
                else if (pattern[j-1]=='*'){
                    dp[i][j]=dp[i][j-2];
                    if (pattern[j-2]==str[i-1] || pattern[j-2]=='.'){
                        if(dp[i-1][j]==true){
                            dp[i][j]=true;
                        }
                    }
                    
                }
                else {
                    dp[i][j]=false;
                }
            }
        }
        return dp[str.length][pattern.length];
    }
}