public class DiasNoValidoException extends  RuntimeException{

public DiasNoValidoException(int dias){
    super("solo entre 2 dias y 32 dias");
}

}
