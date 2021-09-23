import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Test {
    public static void main(String[] args) {
        String driverClassName = "com.mysql.cj.jdbc.Driver";	//启动驱动
        String url = "jdbc:mysql://localhost:3306/mysql";	//设置连接路径
        String username = "root";	//数据库用户名
        String password = "root";	//数据库连接密码
        Connection con = null;		//连接
        PreparedStatement pstmt = null;	//使用预编译语句
        ResultSet rs = null;	//获取的结果集
        try {
            Class.forName(driverClassName); //执行驱动
            con = DriverManager.getConnection(url, username, password); //获取连接


            String sql = "INSERT INTO MESSAGE VALUES(?,?,?,?)"; //设置的预编译语句格式
            pstmt = con.prepareStatement(sql);
            pstmt.setInt(1,11);
            pstmt.setString(2, "java");
            pstmt.setString(3, "test");
            pstmt.setString(4, "测试");
            pstmt.executeUpdate();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }finally {
            //关闭资源,倒关
            try {
                if(rs != null) rs.close();
                if(pstmt != null) pstmt.close();
                if(con != null) con.close();  //必须要关
            } catch (Exception e) {
            }
        }
    }
}
