package dao;

import entity.Usuario;

public class UsuarioDAO extends GenericDAO<Usuario> {

    public boolean autenticar(String usuario, String senha) {
        try {
            return getEntityManager()
                    .createNamedQuery("Usuario.autenticacao")
                    .setParameter("usuario", usuario)
                    .setParameter("senha", senha)
                    .getSingleResult() != null ? true : false;
        } catch (Exception ex) {
            return false;
        }
    }
}
