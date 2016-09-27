package br.com.vinicius.domain;

public class DetalhesErros {

	private String titulo;
	private Long status;
	private Long timesTamp;
	private String mensagemDensevolvedor;
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public Long getStatus() {
		return status;
	}
	public void setStatus(Long status) {
		this.status = status;
	}
	public Long getTimesTamp() {
		return timesTamp;
	}
	public void setTimesTamp(Long timesTamp) {
		this.timesTamp = timesTamp;
	}
	public String getMensagemDensevolvedor() {
		return mensagemDensevolvedor;
	}
	public void setMensagemDensevolvedor(String mensagemDensevolvedor) {
		this.mensagemDensevolvedor = mensagemDensevolvedor;
	}
	public DetalhesErros() {
		super();
	}
	
	
	
	
}
