package fan.test;

import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by fanjiangqi on 2017/3/30.
 */
public class TestConcurrentHashMap {
    public static void main(String[] args) {
        ConcurrentHashMap<String,Integer> conc = new ConcurrentHashMap<String,Integer>();
        conc.put("a",1);
        conc.put("b",2);
        conc.put("fan",3);
        System.out.println(conc.get("fan"));
    }
}
