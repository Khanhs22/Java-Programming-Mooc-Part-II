package buttonandlabel;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;


public class ButtonAndLabelApplication extends Application {


    public static void main(String[] args) {
        launch(ButtonAndLabelApplication.class);
    }

    @Override
    public void start(Stage window) {
        
        Button button = new Button("Button");
        Label label = new Label("Label");
        
        FlowPane group = new FlowPane();
        group.getChildren().add(label);
        group.getChildren().add(button);
        
        Scene view = new Scene(group);
        
        window.setScene(view);
        window.show();
    }

}
