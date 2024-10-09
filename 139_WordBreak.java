class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        //storing the previous
        boolean[] dp = new boolean[s.length() + 1];
        dp[0] =true;

        for(int i = 0; i<=s.length();i++){
            for(String word:wordDict){
                int start = i-word.length();
                if(start>=0 && dp[start] && s.substring(start, i).equals(word)){
                    dp[i] = true; //to symbolize that this index is good to start on
                    break;
                }
            }
        }

        return dp[s.length()];
    }
}
