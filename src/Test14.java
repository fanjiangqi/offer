/**
 * Created by fanjiangqi on 2017/3/30.
 * 调整数组顺序使奇数位于偶数前 面
 * 学习到的：1.求奇偶用 & 操作
 * 2. 可以跟面试官讨论位置可以变化的情况和辅助空间的问题
 */
public class Test14 {
    /**
     * 如果要求不改变要来偶数和奇数直接的顺序，时间复杂度是O(n),空间复杂也是O(n)
     * 如果可以改变顺序，时间复杂度是O(n),空间复杂也是O(1)
     * @param arr 需要调整的数组
     */
    public static void changeOddAndEven(int[] arr){
        if (arr.length == 1)
            return;
        int lo = 0;
        int hi = arr.length - 1;
        while (true){
            //通过位运算表示奇偶性
            while ((arr[lo] & 0x01) == 1 ){
                lo++;
            }
            while ((arr[hi] & 0x01) != 1){
                hi--;
            }
            if (hi < lo)
                break;
            int temp = arr[lo];
            arr[lo] = arr[hi];
            arr[hi] = temp;
        }

    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,9};
        changeOddAndEven(a);
        for (int i :a){
            System.out.print(i +" ");
        }
    }
}
