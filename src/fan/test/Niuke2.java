package fan.test;

import java.util.*;

/**
 * Created by fanjiangqi on 2017/3/23.
 */
public class Niuke2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> list = new LinkedList<>();
        boolean flag = false;
        int n = sc.nextInt();
        while (sc.hasNext()){
            list.add(sc.next());
        }
        sc.close();
        if (n == 0 || n==1){
            flag = true;
        }
        if (!flag) {
            int num = 0;
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (isStringEqual(list.get(i), list.get(j))) {
                        list.remove(j);
                        n--;
                    }

                }
            }

        }
        System.out.println(n);
    }
    public static boolean isStringEqual(String a, String b){
        if (a.length() != b.length())
            return false;
        char[] aChars = a.toCharArray();
        char[] bChars = b.toCharArray();
        Arrays.sort(aChars);
        Arrays.sort(bChars);
        for (int i = 0; i < a.length(); i++){
            if (aChars[i] != bChars[i])
                return false;
        }
        return true;

    }
}
