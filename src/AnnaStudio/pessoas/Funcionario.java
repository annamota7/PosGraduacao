package AnnaStudio.pessoas;

import AnnaStudio.composicao.Cargos;

public class Funcionario extends Pessoa {
	private int matricula;
	private Cargos cargo;
	private double salario;
	private String dataAdmissao;
	
	public void cadastrar(int matricula,Cargos cargo,double salario,String dataAdmissao,String nome,String dataNascimento,String endereco,String telsContato) {
		this.matricula = matricula;
		this.setCargo(cargo);
		this.salario = salario;
		this.dataAdmissao = dataAdmissao;
		setDataNascimento(dataNascimento);
		setEndereco(getEndereco());;
		setNome(nome);
		setEndereco(getEndereco());
	}
	
	//métodos 
	public void reajustarSalario(double percentual) {
		this.salario = this.salario * percentual;
	}
	
	public void promover (Cargos novoCargo) {
		this.setCargo(novoCargo);
	}
	
	
	//criar get e set automaticos em source
	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getDataAdmissao() {
		return dataAdmissao;
	}

	public void setDataAdmissao(String dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}


	public double getSalario() {
		return salario;
	}

	public Cargos getCargo() {
		return cargo;
	}

	public void setCargo(Cargos cargo) {
		this.cargo = cargo;
	}
	
	
}
