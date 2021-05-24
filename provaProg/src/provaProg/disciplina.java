package provaProg;

public class disciplina {
	public int codigoDisciplina;
	public String nomeDisciplina;
	public int cargaDisciplina;
	
	public disciplina() {
		this.codigoDisciplina = 0;
		this.nomeDisciplina = "";
		this.cargaDisciplina = 0;
	}
	
	public disciplina(int codigoDisciplina, String nomeDisciplina, int cargaDisciplina) {
		super();
		this.codigoDisciplina = codigoDisciplina;
		this.nomeDisciplina = nomeDisciplina;
		this.cargaDisciplina = cargaDisciplina;
	}
	public int getCodigoDisciplina() {
		return codigoDisciplina;
	}
	public void setCodigoDisciplina(int codigoDisciplina) {
		this.codigoDisciplina = codigoDisciplina;
	}
	public String getNomeDisciplina() {
		return nomeDisciplina;
	}
	public void setNomeDisciplina(String nomeDisciplina) {
		this.nomeDisciplina = nomeDisciplina;
	}
	public int getCargaDisciplina() {
		return cargaDisciplina;
	}
	public void setCargaDisciplina(int cargaDisciplina) {
		this.cargaDisciplina = cargaDisciplina;
	}
}
