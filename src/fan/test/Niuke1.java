package fan.test;

import com.sun.org.apache.xpath.internal.SourceTree;
import fan.difficulty.TestClone;
import fan.difficulty.TestProtected;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by fanjiangqi on 2017/3/21.
 */
public class Niuke1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag2 = true;
        int n = sc.nextInt();
        sc.close();
        if (n <= 0 )
            throw new IllegalArgumentException();
        if (n <= 10 && n > 0){
            System.out.println("NO");
            flag2 = false;
        }
        if ( flag2) {
            List<Integer> list = new ArrayList<>();
            while (n / 10 != 0) {
                list.add(n % 10);
                n = n / 10;
            }
            list.add(n % 10);
            int length = list.size();
            boolean flag = false;
            //int[]list.toArray()
            for (int i = 0; i < length - 1; i++) {
                for (int j = i + 1; j < length; j++) {
                    if (multiply(list,0,i) == multiply(list,j,length - 1)){
                        flag = true;
                        break;
                    }

                }
            }
            if (flag)
                System.out.println("YES");
            else
                System.out.println("NO");

        }


    }
   /* public static int multiply(List<Integer> list, int lo, int hi){
        int result = 1;
        while (hi >= lo){
            result *= list.get(lo++) ;

        }
        return result;
    }*/
    public static long multiply(List<Integer> list, int lo, int hi){
        long result = 1;
        while (hi >= lo){
            result *= list.get(lo++) ;

        }
        return result;
    }
}
