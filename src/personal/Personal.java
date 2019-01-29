package personal;

import java.sql.*;

public class Personal {
    private static String pass = "";
    private static String user = "root";
    private static String con = "mysql:jdbc://localhost/record"; 
    public static void main(String[] args) {
        Connection conn = null;
        Statement st = null;
        try{
            conn = DriverManager.getConnection(con,user,pass);
            st = conn.createStatement();
            System.out.println("Connected");
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
}
