package buttonandtextfield;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;


public class ButtonAndTextFieldApplication extends Application {


    public static void main(String[] args) {
        launch(ButtonAndTextFieldApplication.class);
    }

    @Override
    public void start(Stage window) {
        
        Button button = new Button("Button");
        TextField text = new TextField("Text");
        
        FlowPane group = new FlowPane();
        
        group.getChildren().add(button);
        group.getChildren().add(text);
        
        Scene view = new Scene(group);
        
        window.setScene(view);
        window.show();
    }

}
