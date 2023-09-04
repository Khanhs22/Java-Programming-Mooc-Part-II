
public class Program {

    public static void main(String[] args) {
        // Test your method here
    }

    public static String arrayAsString(int[][] array) {
        
        String toString = new String();
        
        for(int row = 0; row < array.length; row++) {
            
            for(int column = 0; column < array[row].length; column++) {
                
                toString += array[row][column];
            }
            
            toString += "\n";
        }
        
        return toString;
    }
}
