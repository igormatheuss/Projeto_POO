package Prova;

public class Programador extends Profissional  {
	  private String carga_Horaria;
	     private  double Salario;
		  
		 
		
	     public String getCarga_horaria() {
			return carga_Horaria;
		}
		public void setCarga_horaria(String carga_horaria) {
			this.carga_Horaria = carga_horaria;
		}
		
		public double getSalario() {
			return Salario;
		}
		public void setSalario(double salario) {
			this.Salario = salario;
		}
		@Override
		public String toString() {
			return "Nome: " + this.Nome + ", CPF: " + this.CPF +
				   ", Data de Nascimento: " + this.Data_Nascimento + ", Matricula:" + this.Matricula + ", Cargo:" + this.Cargo + ", Carga Horaria:" + this.carga_Horaria 
				   + ", Salario:" + this.Salario;}
}