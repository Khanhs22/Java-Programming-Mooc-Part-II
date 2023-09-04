
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        TodoList list = new TodoList();
        Scanner scanner = new Scanner(System.in);
        
        UserInterface user = new UserInterface(list, scanner);
        
        user.start();
    }
}
