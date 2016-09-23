package br.com.vinicius.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.vinicius.domain.Doador;
import br.com.vinicius.repository.DoadorRepository;

@Service
public class DoadorServices  {

	@Autowired
	private Doador doadores;
	
	@Autowired
	private DoadorRepository dao;
	
	// metodo para listar os doadores 
	public List<Doador> listar(){return dao.findAll();}
	
	// metodo para salvar o doador no banco de dados 
	public Doador salvar(Doador doador){doador.setId(null); return dao.save(doador);}
	
	// metodo para apagar dos registros o doador
	public void deletar(Long id ){dao.delete(id);}
	
	// metodo para buscar o doador passando por parametro o id
	public Doador buscar(Long id){doadores = dao.findOne(id); return doadores;}
	
	// metodo para atualizar o doador 
	public void atualizar (Doador doador){verificarExistencia(doador);dao.save(doador);}
	
	// metodo para checar se o doador existe 
	private void verificarExistencia(Doador doador){buscar(doador.getId());}
}
