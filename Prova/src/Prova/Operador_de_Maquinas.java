package Prova;

public class Operador_de_Maquinas extends Profissional {
	 private String carga_horaria;
    private double salario;
    
 
  
  public String getCarga_horaria() {
		return carga_horaria;
	}
	public void setCarga_horaria(String carga_horaria) {
		this.carga_horaria = carga_horaria;
	}
	
	public double getSalario() {
		return salario;
	}
	public void setSalario(double d) {
		this.salario = d;
	}
	@Override
	public String toString() {
		return "Nome: " + this.Nome + ", CPF: " + this.CPF +
			   ", Data de Nascimento: " + this.Data_Nascimento + ", Matreicula:" + this.Matricula + ", Cargo:" + this.Cargo + ", Carga Horaria:" + this.carga_horaria 
			   + ", Salario:" + this.salario;
	}
	
}