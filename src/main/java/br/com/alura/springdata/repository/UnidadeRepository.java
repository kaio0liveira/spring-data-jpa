package br.com.alura.springdata.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import br.com.alura.springdata.teste.Unidade;

public interface UnidadeRepository extends CrudRepository<Unidade, Long> {
	
	//Derived query
	List<Unidade> findByDescricaoAndEndereco(String descricao, String endereco);
	
	//Native Query
	@Query(value = "SELECT * FROM unidade u where u.descricao = :descricao AND u.endereco = :endereco",nativeQuery = true)
	List<Unidade> findByDescricaoComQuery(String descricao, String endereco);
	
}
