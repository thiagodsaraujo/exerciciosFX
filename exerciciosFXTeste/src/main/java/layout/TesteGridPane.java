package layout;

import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;

public class TesteGridPane extends GridPane {

    public TesteGridPane() {

        Caixa c1 = (Caixa) new Caixa().comTexto("1");
        Caixa c2 = (Caixa) new Caixa().comTexto("2");
        Caixa c3 = (Caixa) new Caixa().comTexto("3");
        Caixa c4 = (Caixa) new Caixa().comTexto("4");
        Caixa c5 = (Caixa) new Caixa().comTexto("5");
        Caixa c6 = (Caixa) new Caixa().comTexto("6");

        setGridLinesVisible(true);

        getColumnConstraints().addAll(cc(),cc(),cc(),cc(),cc());
        getRowConstraints().addAll(rc(),rc(),rc(),rc(),rc());

        setVgap(10);
        setHgap(10);

        add(c1, 0,0,2, 2);
        add(c2,1,1,2,2);
        add(c3,4,2,1,3);
        add(c4,3,1);
        add(c5, 0,4,2,1);
        add(c6, 3,3);
    }

    public ColumnConstraints cc(){
        ColumnConstraints cc = new ColumnConstraints();
        cc.setPercentWidth(20); // cada coluna vai ter 20% da tela, mesmo tamanho
        cc.setFillWidth(true);
        return cc;
    }

    private RowConstraints rc(){
        RowConstraints rc = new RowConstraints();
        rc.setPercentHeight(20); // pode setar por percentual ou por pixel e etc, várias funções...
        rc.setFillHeight(true);
        return rc;
    }
}
