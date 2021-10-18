package br.com.alura.springdata.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import br.com.alura.springdata.teste.Funcionario;
import br.com.alura.springdata.teste.FuncionarioProjecao;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long>, JpaSpecificationExecutor<Funcionario>{
	
	@Query(value = "SELECT f.id, f.nome, f.salario FROM funcionario f",nativeQuery = true)
	List<FuncionarioProjecao> findFuncionarioSalario();

}
