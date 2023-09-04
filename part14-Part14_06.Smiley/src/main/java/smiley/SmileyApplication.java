package smiley;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.ColorPicker;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


public class SmileyApplication extends Application {


    public static void main(String[] args) {
        launch(SmileyApplication.class);
    }

    @Override
    public void start(Stage window) throws Exception {
        Canvas paintingCanvas = new Canvas(640, 480);
        GraphicsContext painter = paintingCanvas.getGraphicsContext2D();

        ColorPicker colorPalette = new ColorPicker(Color.BLACK);

        BorderPane paintingLayout = new BorderPane();
        paintingLayout.setCenter(paintingCanvas);
        Color color = Color.BLACK;

        painter.setFill(Color.BLACK);
        painter.fillRect(70, 60, 25, 25);//left eye
        
        painter.fillRect(200, 60, 25, 25);//right eye
        
        painter.fillRect(75, 200, 150, 25); //mouth line
        
        painter.fillRect(75, 175, 25, 25); //leeft mouth corner
        
        painter.fillRect(200, 175, 25, 25);//right mouth courner

        Scene view = new Scene(paintingLayout);

        window.setScene(view);
        window.show();
    }

}
