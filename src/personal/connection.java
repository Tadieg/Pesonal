
package personal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class connection {
   private Connection conn;
   private Statement st;
   private ResultSet rs;
   public Connection getConnection() throws ClassNotFoundException{
       try{
           String url="jdbc;mysql://localhost/record";
           String user="root";
           String pass="";
           Class.forName("com.mysql.jdbc.Driver");
           conn=DriverManager.getConnection(url,user,pass);
           
       }catch(SQLException ex ){
           System.out.println("error with the connection" +ex.getMessage());
           
       }catch(ClassNotFoundException ex){
          System.out.println("error with the connection" +ex.getMessage()); 
       }finally{
           return conn;
       }
   }
public ResultSet searchQuery( String sql) throws ClassNotFoundException{
    try{
        getConnection();
        st=conn.createStatement();
        rs=st.executeQuery(sql);
        
        
    }catch(SQLException ex){
      System.out.println("error with the connection" +ex.getMessage());   
    }
    return rs;
}   
}
