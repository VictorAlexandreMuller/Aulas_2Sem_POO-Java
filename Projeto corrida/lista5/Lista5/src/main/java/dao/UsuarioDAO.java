package dao;

import model.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UsuarioDAO {

    private Connection conn;

    public UsuarioDAO() {
        conn = ConnectionFactory.getConnection();
    }

    public void inserir(Usuario usuario) {
        try {
            String sql = "insert into usuario(login,senha,codigo,nome) values (?,?,?,?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, usuario.getLogin());
            stmt.setString(2, usuario.getSenha());
            stmt.setInt(3, usuario.getCodigo());
            stmt.setString(4, usuario.getNome());
            stmt.execute();
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void editar(Usuario usuario) {
        try {
            String sql = "update usuario set login = ?, senha = ?, nome = ? where codigo = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, usuario.getLogin());
            stmt.setString(2, usuario.getSenha());
            stmt.setString(3, usuario.getNome());
            stmt.setInt(4, usuario.getCodigo());
            stmt.execute();
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void excluir(int codigo) {
        try {
            String sql = "delete from usuario where codigo = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, codigo);
            stmt.execute();
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE,
                    null, ex);
        }
    }

    public ArrayList<Usuario> selecionar() {
        ArrayList<Usuario> listaUsuario = new ArrayList<>();
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select * from Usuario");
            while (rs.next()) {
                listaUsuario.add(
                        new Usuario(
                                rs.getInt("id"),
                                rs.getString("login"),
                                rs.getString("senha"),
                                rs.getInt("codigo"),
                                rs.getString("nome")));
            }
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listaUsuario;
    }

    public Usuario selecionarPorCodigo(int codigo) {
        Usuario usuario = null;
        try {
            PreparedStatement stmt = conn.prepareStatement("select * from Usuario where Codigo = ?");
            stmt.setInt(1, codigo);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                usuario = new Usuario(rs.getInt("id"), rs.getString("login"), rs.getString("senha"), rs.getInt("codigo"), rs.getString("nome"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return usuario;
    }

    public boolean autenticar(String login, String senha) {
        Usuario usuario = null;
        try {
            PreparedStatement stmt = conn.prepareStatement(
                    "select * from Usuario where login = ? and senha = ?");
            stmt.setString(1, login);
            stmt.setString(2, senha);
            ResultSet rs = stmt.executeQuery();
            return rs.next();
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public boolean consultarCodigo(int codigo) {
        Usuario usuario = null;
        try {
            PreparedStatement stmt = conn.prepareStatement(
                    "select * from Usuario where codigo = ?");
            stmt.setInt(1, codigo);

            ResultSet rs = stmt.executeQuery();
            return rs.next();
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

}
