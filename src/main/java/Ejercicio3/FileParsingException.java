package Ejercicio3;

/**
 * Created by lima on 2/21/16.
 */
public class FileParsingException extends Exception
{
    private String Message;
    private Throwable Reason;

    public FileParsingException(String Message, Throwable Reason)
    {
        super();
        this.Message = Message;
        this.Reason = Reason;
    }

    public FileParsingException(String Message)
    {
        super();
        this.Message = Message;
    }

    public void setMessage(String message) {
        Message = message;
    }

    public void setReason(Throwable reason) {
        Reason = reason;
    }

    public String getMessage() {
        return Message;
    }

    public Throwable getReason() {
        return Reason;
    }
}
