/**
 * Exceção personalizada (checked) lançada quando a idade não atende
 * à regra de negócio do cadastro.
 */
public class IdadeInvalidaException extends Exception {

    public IdadeInvalidaException(String mensagem) {
        super(mensagem);
    }
}