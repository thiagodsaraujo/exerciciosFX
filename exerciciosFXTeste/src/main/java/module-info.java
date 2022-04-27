module com.example.exerciciosfxteste {
        requires javafx.controls;
        requires javafx.fxml;
        requires javafx.web;

        requires org.controlsfx.controls;
        requires com.dlsc.formsfx;
        requires validatorfx;
        requires org.kordamp.ikonli.javafx;
        requires org.kordamp.bootstrapfx.core;
        requires eu.hansolo.tilesfx;

        opens basic;
        opens layout;
        opens fxml;
        opens com.example.exerciciosfxteste to javafx.fxml;
        exports com.example.exerciciosfxteste;
    }