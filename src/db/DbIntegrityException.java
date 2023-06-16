package db;

public class DbIntegrityException extends RuntimeException {

    //Exceção para tratar eventual falha de integridade referencial;

    public DbIntegrityException(String msg){
        super(msg);
    }

}
