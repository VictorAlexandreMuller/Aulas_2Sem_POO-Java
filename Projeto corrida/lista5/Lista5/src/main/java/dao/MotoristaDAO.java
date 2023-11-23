package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Motorista;

public class MotoristaDAO {

    private Connection conn;

    public MotoristaDAO() {
        conn = ConnectionFactory.getConnection();
    }

    public void inserir(Motorista motorista) {
        try {
            String sql = "insert into motorista(nome) values (?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, motorista.getNome());
            stmt.execute();
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(MotoristaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void editar(Motorista motorista) {
        try {
            String sql = "update motorista set nome = ? where id = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, motorista.getNome());
            stmt.setInt(2, motorista.getId());
            stmt.execute();
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(MotoristaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void excluir(int id) {
        try {
            String sql = "delete from motorista where id = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id);
            stmt.execute();
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(MotoristaDAO.class.getName()).log(Level.SEVERE,
                    null, ex);
        }
    }

    public ArrayList<Motorista> selecionar() {
        ArrayList<Motorista> listaMotorista = new ArrayList<>();
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select * from motorista");
            while (rs.next()) {
                listaMotorista.add(
                        new Motorista(
                                rs.getInt("id"),
                                rs.getString("nome")));
            }
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(MotoristaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listaMotorista;
    }

    public Motorista selecionarPorCodigo(int id) {
        Motorista motorista = null;
        try {
            PreparedStatement stmt = conn.prepareStatement("select * from motorista where id = ?");
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                motorista = new Motorista(rs.getInt("id"), rs.getString("nome"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(MotoristaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return motorista;
    }
}
