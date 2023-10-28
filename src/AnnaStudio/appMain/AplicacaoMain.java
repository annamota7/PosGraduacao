package AnnaStudio.appMain;

import AnnaStudio.pessoas.*;

public class AplicacaoMain {

	public static void main(String[] args) {
		//classe - nome(referencia) - construtor
		
		
		Funcionario objNovoFunc01 = new Funcionario();
		Cliente objNovoCliente01 = new Cliente();
		
		//objNovoFunc01.cadastrar(01, "Arquiteta", 4000, "15/12/2020", "ANNA", "07/10/1997", "Aqui", "83988318105");
		//objNovoCliente01.cadastrar(02, "Medica","Josy","12/05/1975", "ali", "8366559944");
		
		objNovoCliente01.getNome();
		objNovoCliente01.getCodigo();
		objNovoCliente01.getEndereco().getCep();

	}

	
	
	
	
	
	
}
