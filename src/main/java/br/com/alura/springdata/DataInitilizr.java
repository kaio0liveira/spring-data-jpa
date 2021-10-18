package br.com.alura.springdata;

import java.util.Scanner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
import br.com.alura.springdata.service.CrudCargoService;
import br.com.alura.springdata.service.CrudFuncionarioService;
import br.com.alura.springdata.service.CrudUnidadeTrabalhoService;

@Component
public class DataInitilizr implements ApplicationListener<ContextRefreshedEvent>  {
	
	
	
	CrudCargoService cargoService;
	
	
	CrudUnidadeTrabalhoService unidadeTrabalhoService;
	

	CrudFuncionarioService funcionarioService;
	
	@Autowired
	public DataInitilizr(CrudCargoService cargoService,CrudUnidadeTrabalhoService unidadeTrabalhoService,CrudFuncionarioService funcionarioService ) {
		this.cargoService = cargoService;
		this.unidadeTrabalhoService = unidadeTrabalhoService;
		this.funcionarioService = funcionarioService;
	}
	
	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		
	Scanner scanner = new Scanner(System.in);

		boolean system = true;
		while (system) {
			System.out.println("Qual função deseja executar?");
			System.out.println("0 - Sair");
			System.out.println("1 - Funcionario");
			System.out.println("2 - Cargo");
			System.out.println("3 - Unidade");
			Integer function = scanner.nextInt();
			

			switch (function) {
				case 1:
					funcionarioService.inicial(scanner);
					break;
				case 2:
					cargoService.inicial(scanner);
					break;
				case 3:
					unidadeTrabalhoService.inicial(scanner);
					break;
				default:
					System.out.println("Finalizando");
					system = false;
					break;
			}
		}
		

	
		
	}


}
