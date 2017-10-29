package mediaplayertest;

import java.sql.*;

public class MediaPlayerTest {
    
    public Connection data(){
        String url = "jdbc:sqlite:C:\\Users\\LPG\\Documents\\MediaPlayerTest";
        
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url); 
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
    }
    
}
