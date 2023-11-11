package AnnaStudio.pessoas;

import AnnaStudio.composicao.Profissoes;

public class Cliente extends Pessoa {
	private int codigo;
	private Profissoes profissao;
	
	public void cadastrar(int codigo,Profissoes profissao,String nome,String dataNascimento,String endereco,String telsContato) {
		this.codigo = codigo;
		this.profissao = profissao;
		setDataNascimento(dataNascimento);
		setEndereco(getEndereco());
		setNome(nome);
		setEndereco(getEndereco());
	}
	
	//criar get e set automaticos em source
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Profissoes getProfissao() {
		return profissao;
	}

	public void setProfissao(Profissoes profissao) {
		this.profissao = profissao;
	}
	

}
