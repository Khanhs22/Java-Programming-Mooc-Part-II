package title;

import java.util.Scanner;
import javafx.application.Application;


public class Main {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        String user = scanner.nextLine();
        user = "--title=" + user;
        
        Application.launch(UserTitle.class, user);
    }

}
