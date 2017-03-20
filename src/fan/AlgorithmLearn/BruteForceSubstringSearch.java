package fan.AlgorithmLearn;

/**
 * Created by fanjiangqi on 2017/3/14.
 */
public class BruteForceSubstringSearch {
    public static int search(String pat, String txt){
        int M = pat.length();
        int N = txt.length();
        for (int i = 0; i <= N - M; i++){
            int j;
            for ( j = 0; j < M; j++)
                if (pat.charAt(j) != txt.charAt(i + j))
                    break;

            if (j == M) return i;
        }
        return N;
    }

    public static void main(String[] args) {
        System.out.println(BruteForceSubstringSearch.search("fan","jiangqiliufanlulu"));
    }
}
