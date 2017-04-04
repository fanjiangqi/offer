package lulu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by fanjiangqi on 2017/3/31.
 */
public class LuluUtil {
    private static final String forname = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/lulu?useUnicode=true&characterEncoding=UTF-8";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "123456";

    List<List<Double>> lld = new ArrayList<>();
    List<Double> list = new ArrayList<Double>();

    //List<Double> ld2 = new ArrayList<Double>();
    //List<Double> ld3 = new ArrayList<Double>();

    //连接数据库
    public static Connection connectDatabase() throws ClassNotFoundException, SQLException {

        Class.forName(forname);
        Connection con = DriverManager.getConnection(URL,USERNAME,PASSWORD);
        return con;
    }

}
