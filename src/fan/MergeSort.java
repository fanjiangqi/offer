package fan;

/**
 * Created by fanjiangqi on 2016/12/28.
 */
public class MergeSort {
    private static Comparable[] arr;
    //原地归并的抽象方法
    private static void merge(Comparable[] a, int lo, int mid,int hi){
       // Comparable[] arr = new Comparable[a.length];
        for(int k=lo; k<= hi; k++)
            arr[k] = a[k];
        int i = lo, j = mid+1;
        for(int k=lo; k<=hi;k++){
            if(i > mid) a[k] = arr[j++];//左半边取完
            else if(j > hi) a[k] = arr[i++];//右半边取完
            else if(less(arr[i],arr[j])) a[k] = arr[i++];
            else a[k] = arr[j++];
        }
    }
    private static void mergeSort(Comparable[] a){
         arr = new Comparable[a.length];
        int lo = 0, hi = a.length -1;
        mergeSort(a,lo,hi);
    }
    private static void mergeSort(Comparable[] a, int lo, int hi){
        if(lo >= hi) return;
        int mid = lo + (hi - lo)/2;
        mergeSort(a,lo,mid);
        mergeSort(a,mid+1,hi);
        merge(a,lo,mid,hi);
    }

    public static boolean less(Comparable v,Comparable w){
        return v.compareTo(w)<0;
    }

    public static void main(String[] args) {
       Integer[] a = {8,4,45,6,88,91,100,78};

        MergeSort.mergeSort(a);
        for (int j : a) {
            System.out.print(j + " ");
        }
        /*Integer[] ab = {4,5,6,7,8,9,7,8,9,10,11,12};
        MergeSort.merge(ab,0,5,11);
          for (int j : ab) {
            System.out.print(j + " ");
        }*/
    }
}
