package Prova;

public class Empresa implements Modos {
	
	public void Bem_vindo() {
		System.out.println("Sejam, Bem Vindos!");
	}
	public void Desejos1() {
		System.out.println("Tenham um Otimo Dia!");
	}
	
	
	private String Nome_empresa ;
    private String CNPJ ;
	private String Endereco;
	//
	
	
	public String getNome_empresa() {
		return Nome_empresa;
	}

	public void setNome_empresa(String nome_empresa) {
		Nome_empresa = nome_empresa;
	}
    //
	public String getCNPJ() {
		return CNPJ;
	}

	public void setCNPJ(String cNPJ) {
		CNPJ = cNPJ;
	}
    //
	public String getEndereco() {
		return Endereco;
	}

	public void setEndereco(String endereco) {
		Endereco = endereco;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	@Override
	public String toString() {
		return "Nome da Empresa: " + this.Nome_empresa + ", CNPJ: " + this.CNPJ +
			   ", Endereço Corporativo: " + this.Endereco;}

	@Override
	public void Bem_Vindos() {
		
		
	}

	@Override
	public void Desejos() {
		
		
	}
}
