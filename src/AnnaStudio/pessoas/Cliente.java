package AnnaStudio.pessoas;

public class Cliente extends Pessoa {
	private int codigo;
	private String profissao;
	
	public void cadastrar(int codigo,String profissao,String nome,String dataNascimento,String endereco,String telsContato) {
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
	public String getProfissao() {
		return profissao;
	}
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

}
