package fan.test;

import java.util.Scanner;

/**
 * Created by fanjiangqi on 2017/3/25.
 */
public class Wangyi2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] num = new int[n];
        int j = 0;
        while (sc.hasNext()){
            num[j++] = sc.nextInt();
        }
        sc.close();
        int[] num1 = num.clone();
        for (int i = 0; i<k;i++){
            for (int p = 0; p<n;p++){
                num1[p] = num[p];
            }
            for (int p = 0; p<n;p++){
                num[p] = num1[p] + num1[p +1];
                if (num[p] > 100) {
                    num[p] = num[p] % 100;
                    if (p == 0)
                        num1[p] = num[p];
                }

            }

        }
        for (int kk =0; kk < n;kk++){
            if (kk == n-1)
                System.out.print(kk);
            else
                System.out.print(kk+ " ");
        }

    }
}
