
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Anisha
 */
public class TampilData {
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
            ResultSet resultSet = stm.executeQuery("SELECT * FROM biodata_mhs");
            
            //mengisi tabel dgn data hasil query
            while (resultSet.next()){
                final String nim = resultSet.getString("nim");
                final String nama = resultSet.getString("nama");
                final String jenis_kelamin = resultSet.getString("jenis_kelamin");
                final String tanggal_lahir = resultSet.getString("tanggal_lahir");
                final String alamat = resultSet.getString("alamat");
                final String fakultas = resultSet.getString("fakultas");
                final String jurusan = resultSet.getString("jurusan");
                final String angkatan = resultSet.getString("angkatan");
                System.out.println("NIM\t\t: " + nim);
                System.out.println("Nama\t\t: " + nama);
                System.out.println("Jenis Kelamin\t: " + jenis_kelamin);
                System.out.println("Tanggal Lahir\t: " + tanggal_lahir);
                System.out.println("Alamat\t\t: " + alamat);
                System.out.println("Fakultas\t: " + fakultas);
                System.out.println("Jurusan\t\t: " + jurusan);
                System.out.println("Angkatan\t: " + angkatan);
                System.out.println("-----------------------------------------");
            }
        }
        catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
