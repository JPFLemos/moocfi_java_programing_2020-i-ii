package smiley;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.ColorPicker;
import javafx.scene.paint.Color;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class SmileyApplication extends Application {

    @Override
    public void start(Stage window) {

        Canvas smileyCanvas = new Canvas(400, 400);
        GraphicsContext painter = smileyCanvas.getGraphicsContext2D();

        BorderPane layout = new BorderPane();
        layout.setCenter(smileyCanvas);

        painter.setFill(Color.BLACK);
        painter.fillRect(100, 50, 50, 50);
        painter.fillRect(250, 50, 50, 50);
        painter.fillRect(50, 200, 50, 50);
        painter.fillRect(300, 200, 50, 50);
        painter.fillRect(100, 250, 200, 50);

        Scene view = new Scene(layout);

        window.setScene(view);
        window.show();

    }

    public static void main(String[] args) {
        launch(SmileyApplication.class);
        System.out.println("Hello world!");
    }

}
