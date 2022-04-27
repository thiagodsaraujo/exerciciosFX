package basic;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Wizard extends Application {

    private  Stage window;
    private Scene step1;
    private Scene step2;
    private Scene step3;

    @Override
    public void start(Stage stage) throws Exception {
        createStep1();
        createStep2();
        createStep3();
        window = stage;

        window.setScene(step1);
        window.setTitle("Wizard: Passo 01");
        window.show();
    }

    private void createStep1(){
        Button nextStep = new Button("Ir para passo 2 >>");
        nextStep.setOnAction(actionEvent -> {
            window.setScene(step2);
            window.setTitle("Wizard: Passo 2");
        });

        HBox box = new HBox();
        box.setAlignment(Pos.CENTER);
        box.getChildren().add(nextStep);

        step1 = new Scene(box, 400, 400);

    }

        private void createStep2(){
            Button previousStep = new Button("<<< Voltar passo 1");
            previousStep.setOnAction(actionEvent -> {
                window.setScene(step1);
                window.setTitle("Wizard: Passo 1");

            });
            Button nextStep = new Button("Ir para passo 3 >>");
            nextStep.setOnAction(actionEvent -> {
                window.setScene(step3);
                window.setTitle("Wizard: Passo 3");

            });
        HBox box = new HBox();
        box.setAlignment(Pos.CENTER);
        box.getChildren().add(previousStep);
        box.getChildren().add(nextStep);

        step2 = new Scene(box, 400, 400);

    }

    private void createStep3(){
        Button previousStep = new Button("<<< Voltar passo 2");
        previousStep.setOnAction(actionEvent -> {
            window.setScene(step2);
            window.setTitle("Wizard: Passo 2");

        });
        Button nextStep = new Button("Finalizar");
        nextStep.setOnAction(actionEvent -> {
            System.exit(0);
        });
        HBox box = new HBox();
        box.setAlignment(Pos.CENTER);
        box.getChildren().add(previousStep);
        box.getChildren().add(nextStep);

        step3 = new Scene(box, 400, 400);

    }


    public static void main(String[] args) {
        launch(args);
    }
}
