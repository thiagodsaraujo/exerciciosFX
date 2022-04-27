package basic;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class PrimeiroFX extends Application {


    @Override
    public void start(Stage stage) throws Exception {

        Button botaoA = new Button("A");
        Button botaoB = new Button("B");
        Button botaoC = new Button("C");

        botaoC.setOnAction(c -> {System.exit(0);});
        botaoA.setOnAction(a ->
            System.out.println("A"));
        botaoB.setOnAction(b ->
            System.out.println("B"));

        // Vbox organiza na vertical, Hbox na horizontal

        VBox box = new VBox();
        box.setAlignment(Pos.CENTER);
        box.setSpacing(10);
        box.getChildren().add(botaoA);
        box.getChildren().add(botaoB);
        box.getChildren().add(botaoC);

        Scene unicaCena = new Scene(box, 100, 150);
        stage.setScene(unicaCena);

        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}