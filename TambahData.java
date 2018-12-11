
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Anisha
 */
public class TambahData {
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
            stm.executeUpdate("INSERT INTO biodata_mhs"
                + "(nim, nama, jenis_kelamin, tanggal_lahir, alamat, fakultas, jurusan, angkatan)"
                + "VALUES ('111310004', 'Rahmat Santoso', 'Laki - Laki', '1988-10-21','Bekasi utara',"
                + "'Teknik', 'Teknik Informatika', '2011' )");
            System.out.println("Koneksi berhasil");
        }
        catch (SQLException ex){
              System.out.println("Error koneksi database");  
            } 
    }
}
