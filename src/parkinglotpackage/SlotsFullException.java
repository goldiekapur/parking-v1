package parkinglotpackage;

public class SlotsFullException extends Exception{
    private static final long serialVersionUID = 1L;

    public SlotsFullException(String msg) {
        super(msg);
        
    }
}