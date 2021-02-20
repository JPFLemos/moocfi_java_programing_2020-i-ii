
public class MagicSquareFactory {

    public MagicSquare createMagicSquare(int size) {

        MagicSquare square = new MagicSquare(size);
        int x = (size - 1) / 2;
        int y = 0;
        int value = 1;
        
        while(true) {
            square.placeValue(x, y, value);
            value++;
            int nextValueX = x + 1;
            int nextValueY = y - 1;
            
            if (nextValueX >= size) {
                nextValueX = 0;
            } 
            
            if (nextValueY < 0) {
                nextValueY = size - 1;
            }
            
            if (square.readValue(nextValueX, nextValueY) != 0) {
                y++;
                
                if(square.readValue(x, y) != 0) {
                    break;
                }
                
                continue;
            }
            
            y = nextValueY;
            x = nextValueX;
        }


        return square;
    }

}
