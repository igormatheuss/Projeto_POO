package Prova;

public class Profissional extends Pessoa {
	 protected String Matricula;
	 protected String Cargo;
	  private String carga_Horaria;
	     private  double Salario;
   
   
   public String getMatricula() {
		return Matricula;
	}
	public void setMatricula(String matricula) {
		Matricula = matricula;
	}
	
	public String getCargo() {
		return Cargo;
	}
	public void setCargo(String cargo) {
		Cargo = cargo;
	}

	
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
		
	
}