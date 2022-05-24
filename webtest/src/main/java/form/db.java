package form;

import java.sql.Connection;
import java.sql.DriverManager;



public class db {
    static Connection con;

    public static Connection createC() {
        try {


            //loading the drivers
            Class.forName("com.mysql.cj.jdbc.Driver");

            //create connection
            String user = "trainee";
            String password = "trainee#22";
            String url = "jdbc:mysql://192.168.1.137/trainee22?allowPublicKeyRetrieval=true&autoReconnect=true&useSSL=false";

            con = DriverManager.getConnection(url, user, password);

            System.out.println("connect to db " + con);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return con;
    }


}
