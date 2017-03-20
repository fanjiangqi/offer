package fan.AlgorithmLearn;

/**
 * Created by fanjiangqi on 2017/2/28.
 * 二分查找，递归和迭代的分别实现
 * 经常思考，可以加深理解
 */
public class BinarySearch {
    public static int recursiveBinarySearch(int[] array, int key, int lo, int hi){
        if(lo > hi) return lo; //这一句很关键，当key不在数组中，保证正确性
        int mid = (hi - lo) / 2 + lo;
        if(key < array[mid]) return recursiveBinarySearch(array, key, lo, mid-1);
        else if (key > array[mid]) return recursiveBinarySearch(array, key, mid+1, hi);
        else return mid;
    }
    public static int IterationBinarySearch(int[] array, int key, int lo, int hi){
        int mid;
        while (lo <= hi){ //这一句特别重要，等价于 递归中 lo > hi
            mid = (hi - lo) / 2 + lo;
            if(key < array[mid]) hi = mid -1;
            else if (key > array[mid]) lo = mid + 1;
            else return mid;
        }
        return lo;
    }
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 7, 8};
       // int result = BinarySearch.recursiveBinarySearch(array, 6 , 0, array.length-1);
        //System.out.println(result);
        int result2 = BinarySearch.IterationBinarySearch(array, 6 , 0, array.length-1);
        System.out.println(result2);
    }
}
