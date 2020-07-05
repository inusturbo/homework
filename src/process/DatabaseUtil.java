package process;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DatabaseUtil {

    private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    private static String url = "jdbc:mysql://39.98.73.113:3306/bigdata"; //获取协议、 IP和端口等信息
    private static String user = "mashanpeng";//数据库用户名
    private static String password = "mashanpeng";//数据库用户密码

/*    public static void main(String[] args) throws SQLException {
        addNewStudent("2017013235");
        updateGrade("2017013235","CLanguage","99");

    }*/
    //在数据库中增加一列
    public static boolean addCol(String ColName, String type) {

        Connection conn = null;
        Statement stmt = null;

        try {
            //加载驱动
            Class.forName(JDBC_DRIVER);
            //创建连接
            System.out.println("DatabaseUtil:addCol()  >>>正在初始化连接...");
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("DatabaseUtil:addCol()  >>>正在实例化Statement对象...");
            stmt = conn.createStatement();
            String sql;
            sql = "alter table studentgrade add `"+ColName+"`"+" "+type;
            System.out.println("DatabaseUtil:addCol()  >>>正在增加"+type+"类型的列"+ColName);
            stmt.executeUpdate(sql);
            System.out.println("DatabaseUtil:addCol()  ###执行成功！");
            System.out.println("DatabaseUtil:addCol()  >>>正在关闭连接");
            stmt.close();
            conn.close();
            System.out.println("DatabaseUtil:addCol()  ###关闭成功！");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            System.out.println("DatabaseUtil:addCol()  ###执行失败！");
            return false;
        }
        return true;
    }

    public static boolean isAvailable(String stuNo){
        Connection conn = null;
        Statement stmt = null;

        try {
            //加载驱动
            Class.forName(JDBC_DRIVER);
            //创建连接
            System.out.println("DatabaseUtil:isAvailable()  >>>正在初始化连接...");
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("DatabaseUtil:isAvailable()  >>>正在实例化Statement对象...");
            stmt = conn.createStatement();
            String sql;
            sql = "select * from bigdata.studentgrade where stuNo='"+stuNo+"'";
            System.out.println("DatabaseUtil:isAvailable()  ###正在查找！");
            ResultSet rs = stmt.executeQuery(sql);
            boolean i= rs.next();
            if (i==false){
                System.out.println("DatabaseUtil:isAvailable()  ###没有查找到学号"+stuNo+"！");
                return false;

            }
            stmt.close();
            conn.close();
            System.out.println("DatabaseUtil:isAvailable()  ###关闭连接成功！");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            System.out.println("DatabaseUtil:isAvailable()  ###执行错误！");
            return false;
        }
        System.out.println("DatabaseUtil:isAvailable()  ###成功查找到学号"+stuNo+"！");
        return true;
    }

    public static boolean updateGrade(String stuNo,String lessonName,String grade){
        Connection conn = null;
        Statement stmt = null;

        try {
            if (grade.equals(""))
                return false;
            //加载驱动
            Class.forName(JDBC_DRIVER);
            //创建连接
            System.out.println("DatabaseUtil:updateGrade()  >>>正在初始化连接...");
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("DatabaseUtil:updateGrade()  >>>正在实例化Statement对象...");
            stmt = conn.createStatement();
            String sql;
            sql = "UPDATE bigdata.studentgrade SET " + lessonName + " = "+grade+" WHERE stuNo = '"+stuNo+"'";
            System.out.println("DatabaseUtil:updateGrade()  >>>学号"+stuNo+"的"+lessonName+"成绩为："+grade);
            System.out.println("DatabaseUtil:updateGrade()  >>>正在执行更新...");
            stmt.executeUpdate(sql);
            System.out.println("DatabaseUtil:updateGrade()  ###执行成功！");
            System.out.println("DatabaseUtil:updateGrade()  >>>正在关闭连接");
            stmt.close();
            conn.close();
            System.out.println("DatabaseUtil:updateGrade()  ###关闭成功！");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            System.out.println("DatabaseUtil:updateGrade()  ###执行失败！");
            return false;
        }
        return true;
    }

    public static boolean addNewStudent(String stuNo) {

        Connection conn = null;
        Statement stmt = null;

        try {
            //加载驱动
            Class.forName(JDBC_DRIVER);
            //创建连接
            System.out.println("DatabaseUtil:addNewStudent()  >>>正在初始化连接...");
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("DatabaseUtil:addNewStudent()  >>>正在实例化Statement对象...");
            stmt = conn.createStatement();
            String sql;
            sql = "INSERT INTO bigdata.studentgrade (stuNo) VALUES ('"+stuNo+"')";
            System.out.println("DatabaseUtil:addNewStudent()  >>>正在增加新学生，学号为"+stuNo);
            stmt.executeUpdate(sql);
            System.out.println("DatabaseUtil:addNewStudent()  ###执行成功！");
            System.out.println("DatabaseUtil:addNewStudent()  >>>正在关闭连接");
            stmt.close();
            conn.close();
            System.out.println("DatabaseUtil:addNewStudent()  ###关闭成功！");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            System.out.println("DatabaseUtil:addNewStudent()  ###执行失败！");
            return false;
        }
        return true;
    }
}
