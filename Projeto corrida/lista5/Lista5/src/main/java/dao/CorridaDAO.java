package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Corrida;
import model.Motorista;
import model.Usuario;

public class CorridaDAO {

    private static Connection conn;

    public CorridaDAO() {
        conn = ConnectionFactory.getConnection();
    }

    public void inserir(Corrida corrida) {
        try {
            String sql = "insert into corrida(user_id,motorista_id,origem,destino) values (?,?,?,?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, corrida.getUser().getId());
            stmt.setInt(2, corrida.getMotorista().getId());
            stmt.setString(3, corrida.getOrigem());
            stmt.setString(4, corrida.getDestino());
            stmt.execute();
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(CorridaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void editar(Corrida corrida) {
        try {
            String sql = "UPDATE corrida SET user_id = ?, motorista_id = ?, origem = ?, destino = ? WHERE id = ?";

            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setObject(1, corrida.getUser().getId());
            stmt.setObject(2, corrida.getMotorista().getId());
            stmt.setString(3, corrida.getOrigem());
            stmt.setString(4, corrida.getDestino());

            stmt.setInt(5, corrida.getId());

            stmt.execute();
            stmt.close();

        } catch (SQLException ex) {
            Logger.getLogger(CorridaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void excluir(int id) {
        try {
            String sql = "DELETE FROM corrida where id = ?";

            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setInt(1, id);
            stmt.execute();
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(CorridaDAO.class.getName()).log(Level.SEVERE,
                    null, ex);
        }
    }

    public static ArrayList<Corrida> selecionar() {
        ArrayList<Corrida> listaCorrida = new ArrayList<>();
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select  m.nome as NOME_MOTORISTA, c.id as ID_CORRIDA, u.nome as NOME_USUARIO, origem, destino "
                    + "from corrida c join usuario u on c.user_id = u.id\n"
                    + "					       join motorista m on c.motorista_id = m.id;");
            while (rs.next()) {

                int id = rs.getInt("ID_CORRIDA");
                Usuario user = new Usuario();
                user.setNome(rs.getString("NOME_USUARIO"));

                Motorista motorista = new Motorista();
                motorista.setNome(rs.getString("NOME_MOTORISTA"));

                String origem = rs.getString("origem");
                String destino = rs.getString("destino");

                listaCorrida.add(new Corrida(id, user, origem, destino, motorista));
            }
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(CorridaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listaCorrida;
    }

    private static Usuario obterUsuarioPorId(int userId) {
        Usuario usuario = null;

        try {
            String sql = "SELECT * FROM usuario WHERE id = ?";
            try (PreparedStatement stmt = conn.prepareStatement(sql)) {
                stmt.setInt(1, userId);
                try (ResultSet rs = stmt.executeQuery()) {
                    if (rs.next()) {
                        usuario = new Usuario(rs.getInt("id"),
                                rs.getString("login"),
                                rs.getString("senha"),
                                rs.getInt("codigo"),
                                rs.getString("nome"));
                    }
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return usuario;
    }

    private static Motorista obterMotoristaPorId(int MotoId) {
        Motorista motorista = null;

        try {
            String sql = "SELECT * FROM motorista WHERE id = ?";
            try (PreparedStatement stmt = conn.prepareStatement(sql)) {
                stmt.setInt(1, MotoId);
                try (ResultSet rs = stmt.executeQuery()) {
                    if (rs.next()) {
                        motorista = new Motorista(rs.getInt("id"),
                                rs.getString("nome"));
                    }
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return motorista;
    }

    public Corrida selecionarPorCodigo(int id) {
        Corrida corrida = null;
        try {
            PreparedStatement stmt = conn.prepareStatement("select * from corrida where id = ?");
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {

                Usuario user = obterUsuarioPorId(id);
                Motorista motorista = obterMotoristaPorId(id);
                String origem = rs.getString("origem");
                String destino = rs.getString("destino");

                corrida = new Corrida(id, user, origem, destino, motorista);
            }
        } catch (SQLException ex) {
            Logger.getLogger(MotoristaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return corrida;
    }
}
