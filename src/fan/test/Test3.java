package fan.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by fanji on 2017/2/28.
 */
public class Test3 {
    public static void main(String[] args) {
        List<Double> le = new ArrayList();
        le.add((double) 3);
        le.add((double) 7);
        le.add((double) 9);
        le.add((double) 24);
        le.add((double) 39);
        for (double d : le) {
            System.out.print(d + "..." + '\n');
        }
        Collections.sort(le);
        for (double d : le) {
            System.out.print(d + "..." + '\n');
        }

    }
}
