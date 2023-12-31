

public class Checker {

    
    public boolean isDayOfWeek(String string) {
        return string.matches("mon|tue|wed|thu|fri|sat|sun");
    }
    
    public boolean allVowels(String string) {
        return string.matches("(o|e|u|a|i)*");
    }
    
    public boolean timeOfDay(String string) {
        return string.matches("[0-1][0-9]:[0-5][0-9]:[0-5][0-9]|"
                + "2[0-3]:[0-5][0-9]:[0-5][0-9]|"
                + "24:00:00");
    }
}
