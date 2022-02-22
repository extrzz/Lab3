package exceptions;

public class MissingNameException extends RuntimeException{
    public MissingNameException(String name){
        super(name);
    }
}
