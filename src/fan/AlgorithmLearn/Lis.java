package fan.AlgorithmLearn;

/**
 * Created by fanjiangqi on 2017/3/20.
 * 最长递增子序列问题，2种方法：第一种暴力搜索，复杂度N平分
 * 第二种NlogN
 * 返回子序列数组还没写
 */
public class Lis {
    public static  int findLongest1(int[] A, int n) {
        // write code here
        int dp[] = new int[n];
        for(int i = 0; i < n; ++i){
            dp[i] = 1;
            for(int j = 0; j < i; ++j){
                if(A[i] > A[j])
                    dp[i] = Math.max(dp[i], dp[j]+1);
            }
        }
        int max = dp[0];
        for(int i = 1; i < n; i++){
            if(dp[i] > max)
                max = dp[i];
        }
        return max;
    }

    public static int findLongest2(int[] A, int n) {
        // write code here
        if(A.length == 1)
            return 1;
        if(A.length == 0)
            return 0;
        int dp[] = new int[n]; //存储第i个元素结尾的最长递增子序列的长度
        int ends[] = new int[A.length];// ends[right]
        int right = 0;
        ends[0] = A[0];
        dp[0] = 1;
        int r;
        //int lo = 0;
        //int hi = 0;
        for(int i=1; i < n; ++i){
            r = binarySearch(ends,right, A[i]);
            if(ends[r] < A[i]){
                ends[++right] = A[i];
            }
            else
                ends[r] = A[i];
            dp[i] = r + 1;

        }

        int max = dp[0];
        for(int i = 1; i < n; i++){
            if(dp[i] > max)
                max = dp[i];
        }
        return max;
    }
    private static int binarySearch(int[] A, int right, int key){
        int lo = 0;
        int hi = right;
        int mid = 0;
        while(lo <= hi){
            mid = lo + (hi - lo)/2;
            if(A[mid] > key)
                hi = mid - 1;
            else if(A[mid] < key)
                lo = mid + 1;
            else
                return mid;
        }
        return lo;
    }
}
