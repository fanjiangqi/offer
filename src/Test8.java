import java.util.ArrayList;
/**
 * Created by fanjiangqi on 2017/3/25.
 * 面试题8：旋转数组的最小数字
 * ps: 还没有做好，感觉题目有点问题
 */

public class Test8 {
    public static int minNumberInRotateArray(int [] array) {
        /*
        if(array.length == 1)
            return array[0];
        if(array.length == 2)
            return array[1];
            */
        int lo = 0;
        int hi = array.length - 1;
        int mid;
        while( lo <= hi){
            mid = lo + (hi - lo)/2;
            if(array[mid] >= array[0])
                lo = mid + 1;
            else if(array[mid] < array[0])
                hi = mid - 1;

        }
        return array[lo];

    }

    public static void main(String[] args) {
        int[] a = new int[]{1,1,1,1,1,1,1,1,1};
        int[] b = new int[]{1,2,3,4};
        System.out.println(minNumberInRotateArray(a));
    }
}
