package br.com.vinicius.domain;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.hibernate.validator.constraints.NotEmpty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@Entity
public class Doador{

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@JsonInclude(Include.NON_NULL)
	private Long id;
	
	@JsonInclude(Include.NON_NULL)
	@NotEmpty(message="Nome e obrigatório")
	private String nome;
	
	@JsonInclude(Include.NON_NULL)
	@NotEmpty(message="Sobrenome e obrigatorio")
	private String sobrenome;
	
	@JsonInclude(Include.NON_NULL)
	@NotEmpty(message="Email e obrigatório")
	private String email;
	
	@JsonInclude(Include.NON_NULL)
	@NotEmpty(message="CPF e obrigatório")
	private String cpf;
	
	@JsonInclude(Include.NON_NULL)
	private String tipoSanguineo;
	
	@JsonInclude(Include.NON_NULL)
	private String redeSocial;
	
	@JsonInclude(Include.NON_NULL)
	@NotEmpty(message="Idade e obrigatório")
	private Integer idade;
	
	@JsonInclude(Include.NON_NULL)
	@JsonFormat(pattern="dd/MM/yyyy")
	private Date dataNascimento;
	
	@JsonInclude(Include.NON_NULL)
	@NotEmpty(message="Cep e obrigatório")
	private String cep;
	
	@JsonInclude(Include.NON_NULL)
	private String rua;
	
	@JsonInclude(Include.NON_NULL)
	private String bairro;
	
	@JsonInclude(Include.NON_NULL)
	private Integer numero;
	
	@JsonInclude(Include.NON_NULL)
	private String cidade; 
	
	@JsonInclude(Include.NON_NULL)
	private String estado;
	
	@JsonInclude(Include.NON_NULL)
	private String codigoIbge;
	
	
	public Date getDataNascimento() {return dataNascimento;}

	public void setDataNascimento(Date dataNascimento) {this.dataNascimento = dataNascimento;}

	public Long getId() {return id;}

	public void setId(Long id) {this.id = id;}

	public String getNome() {return nome;}

	public void setNome(String nome) {this.nome = nome;}

	public String getSobrenome() {return sobrenome;}

	public void setSobrenome(String sobrenome) {this.sobrenome = sobrenome;}

	public String getEmail() {return email;}

	public void setEmail(String email) {this.email = email;}

	public String getCpf() {return cpf;}

	public void setCpf(String cpf) {this.cpf = cpf;}

	public String getTipoSanguineo() {return tipoSanguineo;}

	public void setTipoSanguineo(String tipoSanguineo) {this.tipoSanguineo = tipoSanguineo;}

	public String getRedeSocial() {return redeSocial;}

	public void setRedeSocial(String redeSocial) {this.redeSocial = redeSocial;}

	public Integer getIdade() {return idade;}

	public void setIdade(Integer idade) {this.idade = idade;}

	public String getCep() {return cep;}

	public void setCep(String cep) {this.cep = cep;}

	public String getRua() {return rua;}

	public void setRua(String rua) {this.rua = rua;}

	public String getBairro() {return bairro;}

	public void setBairro(String bairro) {this.bairro = bairro;}

	public Integer getNumero() {return numero;}

	public void setNumero(Integer numero) {this.numero = numero;}

	public String getCidade() {return cidade;}

	public void setCidade(String cidade) {this.cidade = cidade;}

	public String getEstado() {return estado;}

	public void setEstado(String estado) {this.estado = estado;}

	public String getCodigoIbge() {return codigoIbge;}

	public void setCodigoIbge(String codigoIbge) {this.codigoIbge = codigoIbge;}

	
	
	public Doador() {
		super();
	}
	
	
	

}
