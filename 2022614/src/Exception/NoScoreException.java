package Exception;

public class NoScoreException extends RuntimeException {
    public NoScoreException() {
        super();
    }
    public NoScoreException( String massage) {
        super(massage);
    }

}
