package basic;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.Objects;


public class Contador extends Application {

    private  int contador = 0;

    private void atualizarLabelNumero(Label label){
        label.setText(Integer.toString(contador));

        label.getStyleClass().remove("verde");
        label.getStyleClass().remove("vermelho");

        if (contador > 0 ){
            label.getStyleClass().add("verde");
        }else if(contador < 0){
            label.getStyleClass().add("vermelho");
        }

    }

    @Override
    public void start(Stage stage) throws Exception {
        Label labelTitulo = new Label("Contador");
        //        labelTitulo.getStyleClass("titulo");


        Label labelNumero = new Label("0");
//        labelNumero.getStyleClass("numero");

        stage.show();


        Button botaoIncremento = new Button("+");
//        botaoIncremento.getStyleClass().add("botoes");
        botaoIncremento.setOnAction(actionEvent -> {
            contador++;
            atualizarLabelNumero(labelNumero);
        });
        Button botaoDecremento = new Button("-");
//        botaoDecremento.getStyleClass().add("botoes");

        botaoDecremento.setOnAction(actionEvent ->{
            contador--;
            atualizarLabelNumero(labelNumero);
        } );

        HBox boxBotoes = new HBox();

        boxBotoes.setAlignment(Pos.CENTER);
        boxBotoes.setSpacing(10);
        boxBotoes.getChildren().add(botaoDecremento);
        boxBotoes.getChildren().add(botaoIncremento);

        VBox boxConteudo = new VBox();
//        boxConteudo.getStyleClass("basic");
        boxBotoes.setSpacing(10);
        boxConteudo.setAlignment(Pos.CENTER);
        boxConteudo.getChildren().add(labelTitulo);
        boxConteudo.getChildren().add(labelNumero);
        boxConteudo.getChildren().add(boxBotoes);


//        String caminhoCss = getClass().getResource("/basic/Contador.css").toExternalForm();

        Scene cenaPrincipal = new Scene(boxConteudo, 400, 400);
        cenaPrincipal.getStylesheets().add("https://fonts.googleapis.com/css2?family=Poppins");
//        cenaPrincipal.getStylesheets().add(caminhoCss);



        stage.setScene(cenaPrincipal);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
