import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Database {
    public static void main(String[] args) {
        final String driver = "com.mysql.jdbc.Driver";
        final String url = "jdbc:mysql://localhost/db_pegawai";
        final String username = "root";
        final String password = "";
        Connection conn = null;
        Statement stmt = null;
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, username, password);

            stmt = conn.createStatement();
            String sql = "SELECT * from pegawai";
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                String nip = rs.getString("NIP");
                String nama = rs.getString("Nama");
                String jk = rs.getString("JenisKelamin");
                int tinggi = rs.getInt("Tinggi");

                System.out.println(
                        "Nip : " + nip + ", Nama :" + nama + ", Tinggi :" + tinggi + ", Jenis kelamin : " + jk);
            }
            rs.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            try {
                stmt.close();
            } catch (Exception e) {

                try {
                    conn.close();
                } catch (Exception se) {

                }
            }
            System.out.println("Aplikasi selesai");
        }
    }
}
