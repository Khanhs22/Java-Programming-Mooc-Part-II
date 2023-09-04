package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class JokeApplication extends Application {


    public static void main(String[] args) {
        launch(JokeApplication.class);
    }

    @Override
    public void start(Stage window) throws Exception {
        
        BorderPane layout = new BorderPane();
        
        HBox menu = new HBox();
        menu.setPadding(new Insets(20));
        menu.setSpacing(10);
        
        Button first = new Button("Joke");
        Button second = new Button("Answer");
        Button third = new Button("Explanation");
        
        menu.getChildren().addAll(first, second, third);
        
        layout.setTop(menu);
        
        StackPane firstLayout = createView("What do you call a bear with no teeth?");
        StackPane secondLayout = createView("A gummy bear.");
        StackPane thirdLayout = createView("Bc ...");
        
        layout.setCenter(firstLayout);
        
        first.setOnAction((event) -> {
            layout.setCenter(firstLayout);
        });
        
        second.setOnAction((event) -> {
            layout.setCenter(secondLayout);
        });
        
        third.setOnAction((event) -> {
            layout.setCenter(thirdLayout);
        });
        
        Scene view = new Scene(layout);
        
        window.setScene(view);
        window.show();
    }
    
    private StackPane createView(String text) {

        StackPane layout = new StackPane();
        layout.setPrefSize(300, 180);
        layout.getChildren().add(new Label(text));
        layout.setAlignment(Pos.CENTER);

        return layout;
    }
}
