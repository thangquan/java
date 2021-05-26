
package context;


import java.sql.Connection;
import java.sql.DriverManager;


public class DBContext {
    
    /*USE BELOW METHOD FOR YOUR DATABASE CONNECTION FOR BOTH SINGLE AND MULTILPE SQL SERVER INSTANCE(s)*/
    /*DO NOT EDIT THE BELOW METHOD, YOU MUST USE ONLY THIS ONE FOR YOUR DATABASE CONNECTION*/
     public Connection getConnection()throws Exception {
        String url = "jdbc:sqlserver://"+serverName+":"+portNumber + "\\" + instance +";databaseName="+dbName;
        if(instance == null || instance.trim().isEmpty())
            url = "jdbc:sqlserver://"+serverName+":"+portNumber +";databaseName="+dbName;
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        return DriverManager.getConnection(url);
    }   
     public static void main(String[] args) {
        try {
            System.out.println("GG");
            System.out.println(new DBContext().getConnection());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    /*Insert your other code right after this comment*/
    /*Change/update information of your database connection, DO NOT change name of instance variables in this class*/
    private final String serverName = "THANG";
    private final String dbName = "Wish";
    private final String portNumber = "1433";
    private final String instance="SQLEXPRESS";//LEAVE THIS ONE EMPTY IF YOUR SQL IS A SINGLE INSTANCE
}
 
//public class DBContext {
//    
//    /*USE BELOW METHOD FOR YOUR DATABASE CONNECTION FOR BOTH SINGLE AND MULTILPE SQL SERVER INSTANCE(s)*/
//    /*DO NOT EDIT THE BELOW METHOD, YOU MUST USE ONLY THIS ONE FOR YOUR DATABASE CONNECTION*/
//     public static Connection getConnection()throws Exception {
//        String url = "jdbc:jtds:sqlserver://thang/Wish";
//        Class.forName("net.sourceforge.jtds.jdbc.Driver");
//        
////Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
//        return DriverManager.getConnection(url);
//    }   
//    /*Insert your other code right after this comment*/
//    /*Change/update information of your database connection, DO NOT change name of instance variables in this class*/
//    public static void main(String[] args) {
//        try {
//            System.out.println("GG");
//            System.out.println(new DBContext().getConnection());
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//    }
//}