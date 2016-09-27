package br.com.vinicius.exceptions;

import java.io.Serializable;

public class DoadorExisteException extends RuntimeException implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1363178371386128010L;
	
	
	public DoadorExisteException (String mensagem){super(mensagem);}
	public DoadorExisteException (String mensagem, Throwable causa){super(mensagem,causa);}

}
