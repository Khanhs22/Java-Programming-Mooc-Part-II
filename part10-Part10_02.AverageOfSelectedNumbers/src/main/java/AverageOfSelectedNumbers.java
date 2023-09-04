
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // toteuta ohjelmasi tänne
        ArrayList<String> list = new ArrayList<>();

        System.out.println("Input numbers, type \"end\" to stop.");
        
        while (true) {
            
            String input = scanner.nextLine();
            
            if (input.equals("end")) {
                break;
            }
            
            list.add(input);
        }
        
        double averageOfPositive = list.stream()
                .mapToInt(s -> Integer.valueOf(s))
                .filter(number -> number > 0)
                .average()
                .getAsDouble();
        
        double averageOfNegative = list.stream()
                .mapToInt(s -> Integer.valueOf(s))
                .filter(number -> number < 0)
                .average()
                .getAsDouble();
        
        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        
        String select = scanner.nextLine();
        
        if (select.equals("n")) {
            System.out.println("Average of the negative numbers: " + averageOfNegative);
        }
        
        if (select.equals("p")) {
            System.out.println("Average of the positive numbers: " + averageOfPositive);
        }
    }
}
