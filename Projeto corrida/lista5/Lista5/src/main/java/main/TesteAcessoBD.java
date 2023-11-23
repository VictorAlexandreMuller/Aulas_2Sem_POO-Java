package main;

import java.sql.SQLException;
import view.principal.Principal;

public class TesteAcessoBD {

    public static void main(String[] args) throws SQLException {
        Principal telaUser = new Principal();
        telaUser.setVisible(true);
        telaUser.pack();
        telaUser.setLocationRelativeTo(null);
    }
}
