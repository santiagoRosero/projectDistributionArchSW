package Exception;

public class PaqueteException extends Exception {
    /**
     *
     */
    private static final long serialVersionUID = 6118842990877256446L;
    public String message;

    public PaqueteException (String message){
        this.message = message;
    }

    public String getMessage(){
        return message;
    }
    
}
