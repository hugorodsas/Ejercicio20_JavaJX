package org.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) {

        Button button = new Button("Mostrar alerta");

        button.setOnAction(e -> {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Mensaje");
            alert.setHeaderText("Alerta JavaFX");
            alert.setContentText("Has pulsado el boton");
            alert.showAndWait();
        });
        StackPane root = new StackPane();
        root.getChildren().add(button);

        Scene scene = new Scene(root,300,200);

        stage.setTitle("Alerta JavaFX");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
