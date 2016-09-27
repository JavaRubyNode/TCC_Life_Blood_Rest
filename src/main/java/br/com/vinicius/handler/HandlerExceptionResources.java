package br.com.vinicius.handler;


import javax.servlet.http.HttpServletRequest;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;



import br.com.vinicius.domain.DetalhesErros;
import br.com.vinicius.exceptions.DoadorExisteException;
import br.com.vinicius.exceptions.DoadorNaoExisteException;

@ControllerAdvice
public class HandlerExceptionResources {


	//-----------------------------------------------Doador não existe Exception--------------------------------------------------------
	
	@ExceptionHandler(DoadorNaoExisteException.class)
	public ResponseEntity<DetalhesErros> handleDoadorNaoEncontrado(DoadorNaoExisteException e,HttpServletRequest request){
		
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(criarError(404L, "Doador não pode ser encontrado"));
		
	}
	
	//-----------------------------------------------------------------------------------------------------------------------------------
	
	
	
	//----------------------------------------Data invalida Exception--------------------------------------------------------------------
	
	@ExceptionHandler(DataIntegrityViolationException.class)
	public ResponseEntity<DetalhesErros> handleDataIntegrityViolation(DataIntegrityViolationException e, HttpServletRequest request){
		
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(criarError(400L, "Requisição Inválida"));
	} 
	
	//-----------------------------------------------------------------------------------------------------------------------------------
	
	
	// ---------------------------- Doador existente Exeception-------------------------------------------------------------------------
	
	@ExceptionHandler(DoadorExisteException.class)
	public ResponseEntity<DetalhesErros> handleDoadorExiste(DoadorExisteException e, HttpServletRequest request){
		
		return ResponseEntity.status(HttpStatus.CONFLICT).body(criarError(409L, "Doador já existe"));
	}
	//-----------------------------------------------------------------------------------------------------------------------------------
	
	
	
	//------------------------ Instanciar o Objeto Detalhes_Erros passando o status e mensagem-------------------------------------------
	
	public DetalhesErros criarError(Long status,String mensagem){
		DetalhesErros erros = new DetalhesErros();
		erros.setStatus(status);
		erros.setTitulo(mensagem);
		erros.setMensagemDensevolvedor("http://erros.lifeblood.com/"+status);
		erros.setTimesTamp(System.currentTimeMillis());
		return erros;
	}
	
	//-----------------------------------------------------------------------------------------------------------------------------------
	
	
}
