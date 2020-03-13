


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDAO2{
    public static boolean checkUser(String user_name,String password) 
    {
        boolean st =false;
        try {

            //loading drivers for mysql
            Class.forName("com.mysql.cj.jdbc.Driver");

            //creating connection with the database
            Connection con= java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3307/db1","root","root");
            java.sql.PreparedStatement ps = con.prepareStatement("select * from register where EMAIL=? and PASS=?");
            ps.setString(1, user_name);
            ps.setString(2, password);
            java.sql.ResultSet rs =ps.executeQuery();
            st = rs.next();
            System.out.println("helllo db1");

        }
        catch(Exception e) {
            e.printStackTrace();
        }
        return st;                 
    }   
}