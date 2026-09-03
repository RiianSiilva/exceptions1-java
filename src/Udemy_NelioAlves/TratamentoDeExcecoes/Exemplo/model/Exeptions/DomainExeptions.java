package Exemplo.model.Exeptions;
import java.io.Serial;

public class DomainExeptions extends Exception{
    // extends RuntimeException nao obriga a delegar as exceções
    // extends Exception te obriga a delegar as exceções

    @Serial
    private static final long serialVersionUID = 1L;

    public DomainExeptions(String msg){
        super(msg);
    }
}
