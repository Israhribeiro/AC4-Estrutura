package exceptions;

public class BoundaryViolationException extends RuntimeException {
    public BoundaryViolationException(String err) { super(err); }
}
