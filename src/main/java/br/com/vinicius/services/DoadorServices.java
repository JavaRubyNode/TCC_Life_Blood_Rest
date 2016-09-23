package br.com.vinicius.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.vinicius.domain.Doador;
import br.com.vinicius.repository.DoadorRepository;

@Service
public class DoadorServices  {

	@Autowired
	private DoadorRepository dao;
	
	// metodo para listar os doadores 
	public List<Doador> listar(){return dao.findAll();}
	
	// metodo para salvar o doador no banco de dados 
	public Doador salvar(Doador doador){doador.setId(null); return dao.save(doador);}
	
	
	public void deletar(Long id ){dao.delete(id);}
}
