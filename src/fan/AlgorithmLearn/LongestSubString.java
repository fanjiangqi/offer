package fan.AlgorithmLearn;

/**
 * Created by fanjiangqi on 2017/4/3.
 * 最长公共子串
 */
public class LongestSubString {
    public static int longestSubString(String str1, String str2){
        int[][] dp = new int[str1.length()][str2.length()];
        for (int j = 0; j < str2.length(); j++){
            for (int i = 0; i < str1.length(); i++){
                if (i == 0 && j == 0){
                    if(str1.charAt(i) == str2.charAt(j))
                        dp[0][0] = 1;
                    else
                        dp[0][0] = 0;
                }
                else {
                    if(str1.charAt(i) == str2.charAt(j)){
                        if (str1.charAt(i-1<0? 0:i-1) == str2.charAt(j-1<0? 0:j-1))
                            dp[i][j] = dp[i-1<0? 0:i-1][j-1<0? 0:j-1] + 1;
                        else{
                            int temp;
                            temp = Math.max(dp[i-1<0? 0:i-1][j], dp[i][j-1<0? 0:j-1]);
                            dp[i][j] = temp > 1? temp : 1;
                        }
                    }
                    else {
                        dp[i][j] = Math.max(dp[i-1<0? 0:i-1][j], dp[i][j-1<0? 0:j-1]);

                    }
                }

            }
        }
        return dp[str1.length()-1][str2.length()-1];
    }

    public static void main(String[] args) {
        System.out.println(longestSubString("1AB2345","12345"));
        System.out.println(longestSubString("1A2","12"));
    }
}
