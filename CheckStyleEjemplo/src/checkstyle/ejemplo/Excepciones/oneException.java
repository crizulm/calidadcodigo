package checkstyle.ejemplo.Excepciones;

public class oneException extends Exception {
    int count = 0;

    /**
     * Creates a new instance of <code>CurrencyConverterException</code> without
     * detail message.
     */
    public oneException() {
    }

    /**
     * Constructs an instance of <code>CurrencyConverterException</code> with
     * the specified detail message.
     */
    public oneException(String msg) {
        super(msg);
    }
    
    public oneException(int count) {
        count = count;
    }
}
