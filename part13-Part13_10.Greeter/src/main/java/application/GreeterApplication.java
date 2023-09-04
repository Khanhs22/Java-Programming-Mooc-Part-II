package application;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class GreeterApplication extends Application {


    public static void main(String[] args) {
        launch(GreeterApplication.class);
    }

    @Override
    public void start(Stage window) throws Exception {
        
        Label label = new Label("Welcome name!");
        TextField text = new TextField();
        Button button = new Button("Start");
        String name = new String();
        
        GridPane layout = new GridPane();
        
        layout.add(label, 0, 0);
        layout.add(text, 0, 1);
        layout.add(button, 0, 2);
        
        layout.setPrefSize(300, 180);
        layout.setAlignment(Pos.CENTER);
        
        Scene view1 = new Scene(layout);
        
        Label welcome = new Label();
        
        StackPane welcomeLayout = new StackPane();
        welcomeLayout.setPrefSize(300, 180);
        welcomeLayout.getChildren().add(welcome);
        welcomeLayout.setAlignment(Pos.CENTER);
        
        Scene view2 = new Scene(welcomeLayout);
        
        button.setOnAction((event) -> {
            
            welcome.setText("Welcome " + text.getText() + "!");
            window.setScene(view2);
        });
        
        window.setScene(view1);
        window.show();
    }
    
    
}
