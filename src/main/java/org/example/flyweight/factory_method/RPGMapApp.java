package org.example.flyweight.factory_method;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class RPGMapApp extends Application {

    @Override
    public void start(Stage stage) {
        int width = 5, height = 5, tileSize = 64;
        Canvas canvas = new Canvas(width * tileSize, height * tileSize);
        Pane root = new Pane(canvas);

        Map cityMap = new CityMap(width, height);
        cityMap.render(canvas, tileSize);

        Scene scene = new Scene(root);
        stage.setTitle("RPG Map");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
