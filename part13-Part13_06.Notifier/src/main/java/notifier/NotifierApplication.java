package notifier;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class NotifierApplication extends Application {


    public static void main(String[] args) {
        launch(NotifierApplication.class);
    }

    @Override
    public void start(Stage window) {
        
        TextField topText = new TextField();
        Label label = new Label();
        Button button = new Button("Update");
        
        button.setOnAction((event) -> {
            
            label.setText(topText.getText());
        });
        
        VBox group = new VBox();
        group.getChildren().addAll(topText,button, label);
        
        Scene scene = new Scene(group);
        
        window.setScene(scene);
        window.show();
    }

}
