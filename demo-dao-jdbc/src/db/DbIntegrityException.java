package db;

public class DbIntegrityException extends RuntimeException{

	//Como � subclasse de RuntimeException, ent�o � obrigado ter o serial
	private static final long serialVersionUID = 1L;
	
	//For�ar a passar a mensagem para a superclasse
	public DbIntegrityException(String msg) {
		super(msg);
	}

}
