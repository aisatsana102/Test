module org.example.test {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;
    requires spring.security.crypto;
    requires java.sql;
    requires mysql.connector.j;

    opens org.example.test to javafx.fxml;
    exports org.example.test;
    exports org.example.test.models;
    opens org.example.test.models to javafx.fxml;
    exports org.example.test.dao;
    opens org.example.test.dao to javafx.fxml;
    exports org.example.test.services;
    opens org.example.test.services to javafx.fxml;
    exports org.example.test.controllers;
    opens org.example.test.controllers to javafx.fxml;
}