package dao;

import java.sql.*;

/**
 * @Author:Michelle
 * @Description:
 * @Date:Created in 2020/2/18 10:04
 * @Modified By:
 */
public class BaseDao {
    //连接数据库的4个字符串
    //连接地址
    //MySql数据库的java驱动
    //用户名
    //密码
    static final String URL="jdbc:mysql://localhost:3306/rain?useUnicode=True&characterEncoding=UTF-8";
    static final String DRIVER="com.mysql.jdbc.Driver";
    static final String USERNAME="root";
    static final String PASSQORD="123456";

    //数据库连接对象
    //static  Connection conn = null;
    //prep
    //static PreparedStatement pstmt = null;
    //结果集对象
    //static ResultSet rs = null;

    public static Connection getConn(){
        Connection connection = null;

        if (connection==null){
            //加载驱动
            try {
                Class.forName(DRIVER);
                connection= DriverManager.getConnection(URL,USERNAME,PASSQORD);
                System.out.println("连接成功");
            }catch (ClassNotFoundException e){
                e.printStackTrace();
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }

        return connection;
    }
    public static void closeAll(Connection conn,PreparedStatement pstmt,ResultSet rs){
       if (rs != null){
           try {
               rs.close();
           }catch (SQLException e){
               e.getErrorCode();
           }
       }
       if (conn != null){
           try {
               conn.close();
           }catch (SQLException e){
               e.getErrorCode();
           }
       }
       if (pstmt != null){
           try {
               pstmt.close();
           }catch (SQLException e){
               e.getErrorCode();
           }
       }
    }
}
