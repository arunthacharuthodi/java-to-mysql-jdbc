## Getting Started



#### STEP 1:
```
sudo apt install git -y
```

#### STEP 2:
open terminal in a new folder ``projects``
 ```
 git clone https://github.com/arunthacharuthodi/java-to-mysql-jdbc.git
 ```
 
#### STEP 3:

open the code in vs code or Eclipse

[install vscoode]()
[install eclipse]()

```open folder in Eclipse ```

or open terminal and enter
``` 
code .
```
#### STEP 4:

run the program using your IDE



## CODE EXPLANATION



FULL CODE 
```
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class App {
    public static void main(String[] args) throws Exception {
        //connect to mysql database
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/arun?allowPublicKeyRetrieval=true&useSSL=false", "aruntest", "Test@123");
        //create statement
        Statement stmt = conn.createStatement();
        //execute query
        ResultSet rs = stmt.executeQuery("select * from class");
        //process result set
        while (rs.next()) {
            System.out.println(rs.getString(1) + " " + rs.getString(2)+ " " + rs.getString(3)+ " " + rs.getString(4));
        }
        //close connection
        conn.close();
        
    }
}
```


CONNECT TO DATABASE USING JDBC DRIVER
```
//connect to mysql database
Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/arun?allowPublicKeyRetrieval=true&useSSL=false", "eelab", "Eelab@123");
```


GIVE YOUR DATABASE USERNAME PASSWORD AND DATABASE NAME THROUGH URLAND THAT FUNCTION .getConnection()
```
"jdbc:mysql://localhost:3306/arun?allowPublicKeyRetrieval=true&useSSL=false", "eelab", "Eelab@123"

// jdbc:mysql://localhost:3306/<DATABASE NAME>?allowPublicKeyRetrieval=true&useSSL=false" , <DATABASE USERNAME>, <DATABASE PASSWORD>
```
 


