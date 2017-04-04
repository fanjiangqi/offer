package lulu;

/**
 * Created by fanjiangqi on 2017/3/31.
 */
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class SetNumber {
    public List<List<Double>> getNumber() throws ClassNotFoundException, SQLException{
        Connection con1 = LuluUtil.connectDatabase();
        //String sql = " SELECT "+ "'?'"+ "FROM sheet20 order by "+"'?'"+" desc limit 1";
       // PreparedStatement sm = con1.prepareStatement(sql);
        Statement sm = con1.createStatement();
        List<List<Double>> listA = new ArrayList<>();
        List<Double> list = new ArrayList<>();
        //char[] c = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O'};
        String[] c = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O"};
        for(int i=0;i<15;i++){

          // ResultSet rs = sm.executeQuery(" SELECT"+'"'+c[i]+'"'+"FROM sheet20 order by"+'"'+c[i]+'"'+"desc limit 1");
           // String k = c[i];
            ResultSet rs = sm.executeQuery(" SELECT "+ c[i] + " FROM sheet20 order by "+ c[i] +" desc limit 1");

           //sm.setString(1,c[i]);
          // sm.setString(2,c[i]);

            //sm.setInt(1,1);
          // sm.setInt(2,1);
           //ResultSet rs = sm.executeQuery();
            while(rs.next()){
                list.add(rs.getDouble(c[i]));
            }
            listA.add(list);
            list = new ArrayList<Double>();
        }
        System.out.println(listA.size());
        con1.close();
        return listA;
    }
    /*
    public List<Double> getMinAndMax(List<List<Double>> lld){
        //List<List<Double>> listB = new ArrayList<>();
        List<Double> list1 = new ArrayList<>();
        //List<Double> list2 = new ArrayList<>();
        double min = 0;
        double max = 0;
        for(int i = 0;i<15;i++){
            for(int j=1;j<2923;j++){
                min = lld.get(i).get(0);
                max = lld.get(i).get(0);
                if(min>lld.get(i).get(j)){
                    min = lld.get(i).get(j);
                }
                if(max<lld.get(i).get(j)){
                    max = lld.get(i).get(j);
                }
            }
            list1.add(min);
            list1.add(max);
        }
        return list1;
    }
    */
    public static void main(String[] args) throws ClassNotFoundException, SQLException{
        SetNumber sn = new SetNumber();
        List<List<Double>> lista = sn.getNumber();
        //List<Double> listb = sn.getMinAndMax(lista);
        System.out.println(lista.toString());
    }

}

