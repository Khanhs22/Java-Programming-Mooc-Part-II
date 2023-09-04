package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MultipleViews extends Application {

    public static void main(String[] args) {
        launch(MultipleViews.class);
    }

    @Override
    public void start(Stage window) {
        
        Label text1 = new Label("First view!");
        Button button1 = new Button("To the second view!");
        
        BorderPane firstView = new BorderPane();
        firstView.setTop(text1);
        firstView.setCenter(button1);
        
        Button button2 = new Button("To the third view");
        Label text2 = new Label("Second view!");
        
        VBox secondView = new VBox();
        secondView.getChildren().add(button2);
        secondView.getChildren().add(text2);
        
        Label text3 = new Label("Third view!");
        Button button3 = new Button("To the first view!");
        
        GridPane thirdView = new GridPane();
        thirdView.add(text3, 0, 0);
        thirdView.add(button3, 1, 1);
        
        Scene first = new Scene(firstView);
        Scene second = new Scene(secondView);
        Scene third = new Scene(thirdView);
        
        button1.setOnAction((event) -> {
            window.setScene(second);
        });
        
        button2.setOnAction((event) -> {
            window.setScene(third);
        });
        
        button3.setOnAction((event) -> {
            window.setScene(first);
        });
        
        window.setScene(first);
        window.show();
    }

}
