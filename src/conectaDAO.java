import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conectaDAO {

    public Connection connectDB() {

        Connection conn = null;

        try {
          String url = "jdbc:mysql://localhost:3306/uc11?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC";
            String user = "root";
            String password = "Robinvermelho@10";

            conn = DriverManager.getConnection(url, user, password);

        } catch (SQLException erro) {
            System.out.println("Erro de conexão: " + erro.getMessage());
        }

        return conn;
    }
}