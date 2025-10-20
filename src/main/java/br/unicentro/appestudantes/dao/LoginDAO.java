package br.unicentro.appestudantes.dao;

import java.sql.*;
import br.unicentro.appestudantes.model.Login;

public class LoginDAO implements ILogin, IConst {
    private String sql;

    public void inserir(Login usuario) throws SQLException {
        sql = "INSERT INTO usuario(nome) VALUES (?)";

        try (Connection conexao = Conexao.getConexao(Conexao.stringDeConexao, Conexao.usuario, Conexao.senha);
             PreparedStatement pstmt = conexao.prepareStatement(sql)) {
            pstmt.setString(1, usuario.getNome());
            pstmt.executeUpdate();
        }
    }
}
