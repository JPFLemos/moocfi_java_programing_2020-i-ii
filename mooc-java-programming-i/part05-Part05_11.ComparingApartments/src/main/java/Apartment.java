
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }

    public int getRooms() {
        return rooms;
    }

    public int getSquares() {
        return squares;
    }

    public int getPrincePerSquare() {
        return princePerSquare;
    }
    
    public boolean largerThan(Apartment compared) {
        return (this.squares > compared.squares);
    }
    
    public int priceDifference(Apartment compared) {
        return Math.abs(this.squares * this.princePerSquare - compared.squares * compared.princePerSquare);
    }
    
    public boolean moreExpensiveThan(Apartment compared) {
        return (this.squares * this.princePerSquare > compared.squares * compared.princePerSquare);
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
    

}
