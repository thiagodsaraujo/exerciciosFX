package layout;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class AppLayout extends Application {
    @Override
    public void start(Stage stage) throws Exception {
//        VBox temp = new VBox();
//        temp.getChildren().add(new Quadrado());
//        temp.getChildren().add(new Quadrado());
//        temp.getChildren().add(new Quadrado());
//        temp.getChildren().add(new Quadrado());
//        temp.getChildren().add(new Quadrado());
//        temp.getChildren().add(new Quadrado());
//        temp.getChildren().add(new Quadrado());

        Parent raiz = null;
//        raiz = new TesteAnchorPane();
        raiz = new TesteBorderPane();
        raiz = new TesteFlowPane();

        Scene principal = new Scene(new TesteGridPane(), 800, 600);

        stage.setScene(principal);
        stage.setTitle("Gerenciadores de Layout");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
