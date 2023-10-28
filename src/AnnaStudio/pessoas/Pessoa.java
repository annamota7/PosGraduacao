package AnnaStudio.pessoas;

import AnnaStudio.composicao.Endereco;
import AnnaStudio.composicao.TelContato;

//objetos
public class Pessoa {
	private String nome;
	private String dataNascimento;
	private Endereco endereco;
	private TelContato telsContato;

	public void cadastrar() {
	}
	
	public void cadastrar(String nome,String dataNascimento,Endereco endereco,TelContato telsContato) {
		this.nome = nome;
		this.dataNascimento = dataNascimento; 
		this.endereco = endereco;
		this.telsContato = telsContato;
	}
	
	public int obterIdade() {
		int idade = 0;
		//subtrair ano atual do ano de nascimento
		return idade;
	}

	//criar get e set automaticos em source(para conseguir acessa em outra camada as)
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public TelContato getTelsContato() {
		return telsContato;
	}

	public void setTelsContato(TelContato telsContato) {
		this.telsContato = telsContato;
	}
	
	
	
	
}


