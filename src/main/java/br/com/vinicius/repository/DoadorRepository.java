package br.com.vinicius.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.vinicius.domain.Doador;

@Repository
public interface DoadorRepository extends JpaRepository<Doador, Long>{

	/*
	 * interface para realizar as transações do CRUD junto ao banco de dados os recursos
	 * serão aplicados na classe DoadorServices 
	 */
	
}
