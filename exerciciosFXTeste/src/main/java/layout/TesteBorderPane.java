package layout;

import javafx.scene.layout.BorderPane;

public class TesteBorderPane extends BorderPane {

    public TesteBorderPane() {

        Caixa c1 = (Caixa) new Caixa().comTexto("TOPO");
        setTop(c1);
        Caixa c2 = (Caixa) new Caixa().comTexto("ESQUERDA");
        setLeft(c2);
        Caixa c3 = (Caixa) new Caixa().comTexto("DIRETA");
        setRight(c3);
        Caixa c4 = (Caixa) new Caixa().comTexto("FUNDO");
        setBottom(c4);
        Caixa c5 = (Caixa) new Caixa().comTexto("CENTRO");
        setCenter(c5);



    }
}
