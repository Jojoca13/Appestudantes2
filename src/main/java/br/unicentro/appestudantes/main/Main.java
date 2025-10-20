package br.unicentro.appestudantes.main;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        // Cria um objeto responsável por carregar e analisar sintaticamente um arquivo .fxml
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("/br/unicentro/appestudantes/view/menus.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        stage.setTitle("Login");
        stage.setScene(scene);
        // define que stage não pode ser redimensionado pelo usuário
        stage.setResizable(false);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
