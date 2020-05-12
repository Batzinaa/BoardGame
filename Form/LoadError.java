
package Form;



public class LoadError extends Exception {

	private static final long serialVersionUID = -6830267290758491047L;

    public LoadError () {
        super();
    }

    public LoadError (String message) {
        super(message);
    }

    public LoadError (Throwable cause) {
        super(cause);
    }

    public LoadError (String message, Throwable cause) {
        super(message, cause);
    }

    public LoadError (String message,
                               Throwable cause,
                               boolean enableSuppression,
                               boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}