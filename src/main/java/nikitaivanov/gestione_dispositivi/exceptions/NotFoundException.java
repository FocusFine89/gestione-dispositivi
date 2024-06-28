package nikitaivanov.gestione_dispositivi.exceptions;

import org.aspectj.weaver.ast.Not;

public class NotFoundException extends RuntimeException{
    public NotFoundException(long id){
        super("Record con id " + id + " non trovato");
    }
}
