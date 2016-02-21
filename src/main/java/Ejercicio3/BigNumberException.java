package Ejercicio3;

/**
 * Created by lima on 2/21/16.
 */
public class BigNumberException extends Exception
{
    private String Message;
    private Throwable Reason;

    public BigNumberException(String Message, Throwable Reason)
    {
        super();
        this.Message = Message;
        this.Reason = Reason;
    }

    public BigNumberException(String Message)
    {
        super();
        this.Message = Message;
    }

    public Throwable getReason() {
        return Reason;
    }

    public String getMessage() {
        return Message;
    }

    public void setMessage(String message) {
        Message = message;
    }

    public void setReason(Throwable reason) {
        Reason = reason;
    }
}


