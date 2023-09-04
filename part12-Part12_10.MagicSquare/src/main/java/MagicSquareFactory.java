
public class MagicSquareFactory {

    public MagicSquare createMagicSquare(int size) {

        MagicSquare square = new MagicSquare(size);

        // implement the creation of a magic square with the Siamese method algorithm here
        
        int y = 0;
        int x = size / 2;
        
        for (int i = 1; i <= size * size; i++) {
            
            square.placeValue(x, y, i);
            
            int newX = x + 1;
            int newY = y - 1;
            
            if (newX >= size) {
                newX = 0;
            }
            
            if (newY < 0) {
                newY = size - 1;
            }
            
            if (square.readValue(newX, newY) != 0) {
                
                y++;
            } else {
                
                x = newX;
                y = newY;
            }
        }
        
        return square;
    }

}
