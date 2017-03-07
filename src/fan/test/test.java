package fan.test;

import java.util.*;

/**
 * Created by fanji on 2017/3/2.
 */
public class test {
    public static Map<Integer, Double> sortMapByValue(Map<Integer, Double> oriMap) {
        if (oriMap == null || oriMap.isEmpty()) {
            return null;
        }
        Map<Integer, Double> sortedMap = new LinkedHashMap<Integer, Double>();
        List<Map.Entry<Integer, Double>> entryList = new ArrayList<Map.Entry<Integer, Double>>(
                oriMap.entrySet());
       // Collections.sort(entryList, new MapValueComparator());

        Iterator<Map.Entry<Integer, Double>> iter = entryList.iterator();
        Map.Entry<Integer, Double> tmpEntry = null;
        while (iter.hasNext()) {
            tmpEntry = iter.next();
            sortedMap.put(tmpEntry.getKey(), tmpEntry.getValue());
        }
        return sortedMap;
    }

    public static void main(String[] args) {
        Map<Integer, Double> map = new TreeMap<Integer, Double>();
        map.put(1, 0.445);
        map.put(2, 0.367);
        map.put(3, 0.634);
        map.put(4, 1.25);
        map.put(5, 0.16);
        System.out.println(map.toString());//map存储数据是按key值得某个排序存储数据的

        // 通过ArrayList构造函数把map.entrySet()转换成list
        Map<Integer, Double> resultMap = sortMapByValue(map);
        int a = 0;
    /*

        	for (Map.Entry<String, Double> entry : resultMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
            a++;
            if(a==1)
            	break;

        	}
      */
        Set<Map.Entry<Integer, Double>> set2 = resultMap.entrySet();
        for (Iterator<Map.Entry<Integer, Double>> iterator = set2.iterator(); iterator.hasNext(); ) {
            Map.Entry<Integer, Double> entry = (Map.Entry<Integer, Double>) iterator.next();
            int key = entry.getKey();
            Double valueString = entry.getValue();
            System.out.println(key + "...." + valueString);
            a++;
            if (a == 4) {
                break;
            }
        }

    }
    public List<Map> getten(List<Map> lee){
        List<Map> lu = new ArrayList<>();
        Map<Integer,Double> map = new TreeMap<Integer,Double>();

        for(int i=0;i<2913;i++){
            int a=0;
            Set<Map.Entry<Integer, Double>> set2=lee.get(i).entrySet();
            for (Iterator <Map.Entry<Integer, Double>> iterator = set2.iterator(); iterator.hasNext();) {
                Map.Entry<Integer, Double> entry = (Map.Entry<Integer, Double>) iterator .next();
                map.put(entry.getKey(), entry.getValue());
                a++;
                if(a==10){
                    break;
                }
            }
            lu.add(map);
            map = new TreeMap();
        }
        for(Map m:lu){
            System.out.println(m.toString());
        }
        //System.out.println(ld.size());
        return lu;
    }

}
