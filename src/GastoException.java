import java.io.Serial;

public class GastoException extends Exception {

    @Serial
    private static final long serialVersionUID = 1L;

    public GastoException() {
        super("Saldo insuficiente\n");
    }

}
