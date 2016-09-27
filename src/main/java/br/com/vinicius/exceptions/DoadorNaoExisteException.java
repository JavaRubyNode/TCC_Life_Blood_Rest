package br.com.vinicius.exceptions;

import java.io.Serializable;

public class DoadorNaoExisteException extends RuntimeException implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1129580480782921925L;

	private DoadorNaoExisteException (String mensagem ){super(mensagem);}
	private DoadorNaoExisteException (String mensagem , Throwable causa){super(mensagem,causa);}
	
	
}
