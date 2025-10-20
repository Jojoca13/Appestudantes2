package br.unicentro.appestudantes.dao;

import java.sql.SQLException;
import br.unicentro.appestudantes.model.Login;

public interface ILogin {
    public void inserir(Login usuario) throws SQLException;
}

