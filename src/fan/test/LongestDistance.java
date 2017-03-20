package fan.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by fanji on 2017/2/28.
 */

    public class LongestDistance {
        public int getDis(int[] A, int n) {
            String s  = Arrays.toString(A);
            System.out.println(s);
            System.out.println(s.length());
            Arrays.sort(A);
       /*
       for(int x:A){
           System.out.println(x);
       }
       */
            int max = A[n-1];
            int index = s.indexOf('5');
            System.out.println(max);
            System.out.println(index);
            return n;
        }
        public static void main(String[] args){
            int[] x = {1,5,3,9,34,22,7,19};
            LongestDistance gd = new LongestDistance();
            gd.getDis(x,x.length);
          //  Arrays.sort();
        }
    }


