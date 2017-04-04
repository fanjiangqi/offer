package fan.test;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by fanjiangqi on 2017/3/25.
 */
public class wangyi1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int n = sc.nextInt();
        int n = Integer.parseInt(sc.nextLine());
        int[] tX = new int[n];
        int[] tY = new int[n];
        //String taxiX = sc.nextLine();
        //String taxiY = sc.nextLine();
        String[] taxiX = sc.nextLine().split(" ");
        String[] taxiY = sc.nextLine().split(" ");
        for (int i=0; i<taxiX.length;i++){
            tX[i] = Integer.parseInt(taxiX[i]);
        }
        for (int i=0; i<taxiY.length;i++){
            tY[i] = Integer.parseInt(taxiY[i]);
        }
        int gx = sc.nextInt();
        int gy = sc.nextInt();
        int walkTime = sc.nextInt();
        int taxiTime = sc.nextInt();
        sc.close();
        int walkTimeSum, taxiTimeSum;
        walkTimeSum = walkTime * (Math.abs(gx) + Math.abs(gy));
        int walkToTaxi;
        int[] wT = new int[n];//到taxi时间
        for (int i = 0; i < n; i++){
            wT[i] = (Math.abs(tX[i]) + Math.abs(tY[i]))*walkTime ;
        }
        int[] gT = new int[n];//taxi到公司时间
        for (int i = 0; i < n; i++){
            gT[i] = (Math.abs(gx - tX[i])+ Math.abs(gy - tY[i]))*taxiTime;
        }
        for (int i = 0; i < n; i++){
            wT[i] +=gT[i];
        }
        Arrays.sort(wT);
        //taxiTimeSum = wT[0]*walkTime + taxiTime;
        taxiTimeSum = wT[0];
        if (taxiTimeSum < walkTimeSum)
            System.out.println(taxiTimeSum);
        else
            System.out.println(walkTimeSum);




        /*for (int a : tX)
            System.out.println(a);

        System.out.println(gx);
        //System.out.println(ans);*/
    }
}
