import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Fabricant {
    int idFabricant;
    String nom;
    public Fabricant(int idFabricant, String nom){
        this.idFabricant=idFabricant;
        this.nom=nom;
    }

    public void sauvegarderEnBase() {
        String url = "jdbc:mysql://localhost:3306/mini_projet_java";
        String user = "root";
        String password = "";

        try (Connection con = DriverManager.getConnection(url, user, password)) {
            String sql = "INSERT INTO Fabricants (id_fabricant,nom) VALUES (?, ?)";
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setInt(1, this.idFabricant);
            pstmt.setString(2, this.nom);
            pstmt.executeUpdate();
            System.out.println(this.nom + " à été enregistré !");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}