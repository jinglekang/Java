package base.base;

import java.lang.Math;
import java.sql.*;


public class SQLTest {
    public static void main(String[] args) {
        final String DRIVER = "com.mysql.cj.jdbc.Driver";
        final String URL = "jdbc:mysql://127.0.0.1:3306/oa?useSSL=false&serverTimezone=UTC";
        final String USER = "root";
        final String PWD = "qwert,123";
        Connection con;
        try {
            Class.forName(DRIVER);
            con = DriverManager.getConnection(URL, USER, PWD);
            if (!con.isClosed()) {
                System.out.println("数据库连接成功！");
            }
            Statement statement = con.createStatement();
            final String SQLShow = "select * from student;";
            ResultSet rs = statement.executeQuery(SQLShow);
            String name;
            String number;
            System.out.println("姓名" + "\t" + "学号");
            while (rs.next()) {
                name = rs.getString("name");
                number = rs.getString("number");
                System.out.println(name + "\t" + number);
            }
            final String SQLInsert = "insert into student (name,number) value (?,?);";
            PreparedStatement ps =con.prepareStatement(SQLInsert);
            name= "随机"+Math.random()*10;
            number= "随机"+Math.random()*10;
            ps.setString(1,name);
            ps.setString(2,number);
            ps.execute();
            rs.close();
            con.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("驱动没有安装！");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("数据库连接失败！");
        }
    }
}
