package br.com.vinicius.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.vinicius.domain.Doador;

public interface DoadorRepository extends JpaRepository<Doador, Long>{

}
