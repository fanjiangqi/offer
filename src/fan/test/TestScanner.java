package fan.test;

import java.util.Scanner;

/**
 * Created by fanjiangqi on 2017/3/20.
 */
public class TestScanner {
    public static void main(String[] args) {
       /* Scanner sc = new Scanner(System.in);
        while (sc.hasNext())
            System.out.println(sc.next());*/
            Scanner sc = new Scanner(System.in);
            String k;
            while(sc.hasNext()){
                k = sc.next();
                System.out.println(k.length());
                k = switchNumber(k);
                // System.out.println(String.format("%s",k));
                System.out.println(k);
            }
            sc.close();
        }
    private static String switchNumber(String sb){
        Double sum = 0.0;
        for(int i = 2; i < sb.length(); i++ ){

            sum += (sb.charAt(i) - 48)*Math.pow(16,i-2);
        }

        return sum.toString();
    }

}
