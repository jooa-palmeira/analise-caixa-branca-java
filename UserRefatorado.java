package login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * Classe responsável pela autenticação de usuários
 * Refatorada após análise de caixa branca estática
 */
public class UserRefatorado {

    /**
     * Método responsável por criar a conexão com o banco de dados
     * @return Connection
     */
    public Connection conectarBD() {
        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://127.0.0.1/test?user=lopes&password=123";
            conn = DriverManager.getConnection(url);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }

    /**
     * Verifica se o usuário existe no banco de dados
     * @param login
     * @param senha
     * @return boolean
     */
    public boolean verificarUsuario(String login, String senha) {

        boolean usuarioValido = false;

        String sql = "SELECT nome FROM usuarios WHERE login = ? AND senha = ?";

        try (
            Connection conn = conectarBD();
            PreparedStatement ps = conn.prepareStatement(sql)
        ) {
            ps.setString(1, login);
            ps.setString(2, senha);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                usuarioValido = true;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return usuarioValido;
    }
}
