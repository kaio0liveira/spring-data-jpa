package br.com.alura.springdata.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.alura.springdata.teste.Cargo;

public interface CargoRepository extends CrudRepository<Cargo, Long> {
	
	

}
