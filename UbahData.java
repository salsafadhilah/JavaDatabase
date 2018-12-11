
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Anisha
 */
public class UbahData {
    public static Connection con;
    public static Statement stm;
    public static void main(String args[]) throws ClassNotFoundException, SQLException {
        try{
            String url = "jdbc:mysql://localhost/latihan_db";
            String username = "root";
            String password = "";
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, username, password);
            stm = con.createStatement();
            stm.executeUpdate("UPDATE biodata_mhs SET "
                + "alamat= 'Cikarang Utara' , jurusan= 'Teknik Lingkungan'"
                + "WHERE nim= '111310004'");
            System.out.println("Koneksi berhasil");
        }
        catch (SQLException ex){
              System.out.println("Error koneksi database");  
            }
    }
}
