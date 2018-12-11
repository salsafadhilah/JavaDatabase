
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;




/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Acer
 */
public class DBConnection {
    private static Connection connection;
    public static Connection getconnection(){
        //pengecekan koneksi database
        if (connection==null) {
            try{
                String username = "root";
                String password = "";
                String url = "jdbc:mysql://localhost/latihan_db";
                
                MysqlDataSource source = new MysqlDataSource();
                source.setUser(username);
                source.setPassword(password);
                source.setURL(url);
                
                
                connection = (Connection) source.getConnection();
                System.out.println("koneksi Berhasil");
            }
            catch (SQLException ex){
                 System.out.println("Erorr koneksi Database");
            }
                    
        }
        return connection;
    }

   
}
