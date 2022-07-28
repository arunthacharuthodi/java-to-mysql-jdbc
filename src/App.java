import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class App {
    public static void main(String[] args) throws Exception {
        //connect to mysql database
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?allowPublicKeyRetrieval=true&useSSL=false", "eelab", "Eelab@123");
        //create statement
        Statement stmt = conn.createStatement();
        //execute query
        //stmt.executeQuery("create table test(name varchar(20), rollnumber varchar(20));");
        //stmt.executeQuery("insert into to test(name , rollnumber) values('myname', 'myname@123');");
        ResultSet rs = stmt.executeQuery("insert into to test(name , rollnumber) values('myname', 'myname@123');");
        
        
        
        //ResultSet rs = stmt.executeQuery("select * from test");
        //process result set
//         while (rs.next()) {
//             System.out.println(rs.getString(1) + " " + rs.getString(2));
//         }
        //close connection
        conn.close();
        
    }
}
