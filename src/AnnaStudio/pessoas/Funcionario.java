package AnnaStudio.pessoas;

public class Funcionario extends Pessoa {
	private int matricula;
	private String Cargo;
	private double salario;
	private String dataAdmissao;
	
	public void cadastrar(int matricula,String Cargo,double salario,String dataAdmissao,String nome,String dataNascimento,String endereco,String telsContato) {
		this.matricula = matricula;
		this.Cargo = Cargo;
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
	
	public void promover (String novoCargo) {
		this.Cargo = novoCargo;
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

	public String getCargo() {
		return Cargo;
	}

	public double getSalario() {
		return salario;
	}
	
	
}
