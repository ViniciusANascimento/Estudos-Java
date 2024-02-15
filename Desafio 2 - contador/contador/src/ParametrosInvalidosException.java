public class ParametrosInvalidosException extends Exception
{
    private static final long serialVersionUID = 4928599035264976611L;
 
    public ParametrosInvalidosException(String message) 
    {
        super(message);
    }
 
    public ParametrosInvalidosException(Throwable t) 
    {
        super(t);
    }    
}
