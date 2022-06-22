package TestConnect;

import java.sql.*;

/**
 * @ClassName MySqlConnect
 * @Author caodz
 * @Date 2022/6/20
 **/
public class JDBCConnect {

    public static void main(String[] args) throws SQLException {
        Connection connection = null;
        String driver = "com.mysql.jdbc.Driver";
        //URL指向要访问的数据库
        String url = "jdbc:mysql://192.168.181.201:9030/test";
        //MySQL配置时的用户名
        String user = "root";
        //MySQL配置时的密码
        String password = "";

        try {
            Class.forName(driver);
            System.out.println("数据库驱动加载成功");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            connection = DriverManager.getConnection(url, user, password);
            System.out.println("数据库连接成功");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        Statement statement = connection.createStatement();
        String sql = "select * from users";

        ResultSet res = statement.executeQuery(sql);
        while (res.next()) {
            int age = res.getInt("user_id");
            System.out.println(age);
        }

    }
}
