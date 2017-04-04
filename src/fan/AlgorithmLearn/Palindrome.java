package fan.AlgorithmLearn;

/**
 * Created by fanjiangqi on 2017/4/2.
 * 一个字符串，删除最小的字符数，使其成为回文串
 */
public class Palindrome {
    public static int deleteMinCharOfPalindrome(String str){
        int[][] dp = new int[str.length()][str.length()];
        for (int j = 0; j < str.length(); j++){
            for (int i = j; i >= 0; i--){
                if (i == j)
                    dp[i][j] = 0;
                else if (j - i == 1){
                    if (str.charAt(i) == str.charAt(j))
                        dp[i][j] = 0;
                    else
                        dp[i][j] = 1;
                }
                else {
                    if (str.charAt(i) == str.charAt(j))
                        dp[i][j] = dp[i+1][j-1];
                    else
                        dp[i][j] = Math.min(dp[i+1][j],dp[i][j-1]) + 1;
                }
            }
        }
        return dp[0][str.length()-1];
    }

    public static void main(String[] args) {
        String str = "abcda";
        System.out.println(deleteMinCharOfPalindrome(str));
    }
}
