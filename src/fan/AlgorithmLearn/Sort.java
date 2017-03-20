package fan.AlgorithmLearn;

/**
 * Created by fanjiangqi on 2017/3/9.
 * 常见排序算法练习
 */
public class Sort {
    public static void insertSort(int[] a){
        for (int i = 1; i < a.length; i++){
            for (int j = i -1; j >= 0; j--){
                if (a[j + 1] < a[j]) exch(a,j, j + 1);
                else break;
            }
        }
    }

    public static void shellSort(int[] a ) {
        int length = a.length;
        int h = 1;
        while (h < length/3) h = 3 * h + 1;
        while (h >= 1){
            for (int i = h; i < length; i++){
                for (int j = i - h; j >= 0; j -= h){
                    if (a[j + h] < a[j]) exch(a, j, j + h);
                    else break;
                }
            }
            h = h / 3;
        }

    }
    public static void exch(int[] a, int lo, int hi){
      int temp = a[lo];
        a[lo] = a[hi];
        a[hi] = temp;
    }

    public static void main(String[] args) {
        int[] arr1 = {6, 5, 3, 1, 8, 7, 2, 4};
        int[] arr2 = {1,3,5,2,5,6,7,3,4,66};
        Sort.shellSort(arr2);
        for (int a: arr2) {
            System.out.println(a);
        }
    }
}
