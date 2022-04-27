package fxml;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;

import java.net.URL;

public class AppFXML extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        URL arquivoFXML = getClass().getResource("src/main/java/fxml/Login.fxml");
        FXMLLoader.load(arquivoFXML);


        stage.show();
        stage.setTitle("FXML");
    }

    public static void main(String[] args) {
        launch(args);
    }
}
