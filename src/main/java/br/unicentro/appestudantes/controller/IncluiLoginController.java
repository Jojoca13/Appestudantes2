package br.unicentro.appestudantes.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.stage.Stage;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;
import br.unicentro.appestudantes.model.Login;
import br.unicentro.appestudantes.dao.LoginDAO;

public class IncluiLoginController {

    @FXML
    private Button btnConf;

    @FXML
    private TextField txtNomEst;

    @FXML
    public void initialize() {
    }

    @FXML
    private void btnConfOnAction(ActionEvent event) {
        String nome = txtNomEst.getText().trim();

        if (nome.isEmpty()) {
            new Alert(AlertType.WARNING, "Informe o nome do usuario!", ButtonType.OK).showAndWait();
            return;
        }

        Login usuario = new Login();
        usuario.setNome(nome);

        LoginDAO loginDAO = new LoginDAO();
        try {
            loginDAO.inserir(usuario);
            new Alert(AlertType.INFORMATION, "Usuariocadastrado com sucesso!", ButtonType.OK).showAndWait();
            txtNomEst.clear();
        } catch (Exception e) {
            new Alert(AlertType.ERROR, "Erro ao cadastrar usuario!", ButtonType.OK).showAndWait();
            e.printStackTrace();
        }
    }

    @FXML
    private void btnVoltarOnAction(ActionEvent event) {
        // Obtém o stageAtual, janela que será fechada,
        // que contém a Scene que acionou o evento.
        Stage stageAtual = (Stage) ((Node) event.getSource()).getScene().getWindow();
        // Fecha o Stage atual
        stageAtual.close();
    }
}
