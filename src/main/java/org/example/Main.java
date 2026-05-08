package org.example;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        TextField field = new TextField();
        field.setPromptText("Introduce una dirección");

        Label label = new Label("Introduce los datos arriba");

        Button buttonSubmit = new Button("Confirmar entrada");
        Button buttonTrue = new Button("Sí, es correcta");
        Button buttonFalse = new Button("No, borrar");

        buttonTrue.setDisable(true);
        buttonFalse.setDisable(true);

        buttonSubmit.setOnAction(event -> {
            if (!field.getText().isEmpty()) {
                label.setText("¿Es esta la dirección?: " + field.getText());
                buttonTrue.setDisable(false);
                buttonFalse.setDisable(false);
            }
        });

        buttonTrue.setOnAction(event -> {
            label.setText("Dirección confirmada");
            buttonTrue.setDisable(true);
            buttonFalse.setDisable(true);
        });

        buttonFalse.setOnAction(event -> {
            label.setText("Dirección falsa. Introduzca otra.");
            field.clear();
            buttonTrue.setDisable(true);
            buttonFalse.setDisable(true);
        });

        VBox layout = new VBox(10, field, buttonSubmit, buttonTrue, buttonFalse, label);
        layout.setAlignment(Pos.CENTER);

        Scene scene = new Scene(layout, 400, 300);

        primaryStage.setTitle("Validador de Direcciones JavaFX");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}