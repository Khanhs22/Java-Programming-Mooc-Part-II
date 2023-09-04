package textstatistics;

import java.util.Arrays;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;


public class TextStatisticsApplication extends Application {

    public static void main(String[] args) {
        launch(TextStatisticsApplication.class);
    }

    @Override
    public void start(Stage window) {
        
        BorderPane layout = new BorderPane();     
        
        TextArea text = new TextArea();
        
        HBox hbox = new HBox();
        Label letters = new Label("Letters: 0");
        Label words = new Label("Words: 0");
        Label longest = new Label("The longest word is:");
        
        hbox.setSpacing(20);
        hbox.getChildren().add(letters);
        hbox.getChildren().add(words);
        hbox.getChildren().add(longest);
        
        text.textProperty().addListener((change, oldValue, newValue) -> {
            
            int length = newValue.length();
            String[] parts = newValue.split(" ");
            int numberOfWords = parts.length;
            String longestWord = Arrays.stream(parts)
                    .sorted((s1, s2) -> s2.length() - s1.length())
                    .findFirst()
                    .get();
            
            letters.setText("Letters: " + length);
            words.setText("Words: " + numberOfWords);
            longest.setText("The longest word is: " + longestWord);
            
//            hbox.getChildren().addAll(letters, words, longest);
        });
        
        layout.setCenter(text);
        layout.setBottom(hbox);
        
        Scene view = new Scene(layout);
        
        window.setScene(view);
        window.show();
    }

}
