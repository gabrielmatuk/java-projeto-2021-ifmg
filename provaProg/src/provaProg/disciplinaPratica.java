package provaProg;

public class disciplinaPratica extends disciplina {
	
	public disciplinaPratica(int codigoDisciplina, String nomeDisciplina, int cargaDisciplina, int cargaHorariaPratica) {
		super(codigoDisciplina, nomeDisciplina, cargaDisciplina);
		this.cargaHorariaPratica = cargaHorariaPratica;
	}
	public disciplinaPratica() {
		super(0, "", 0);
		this.cargaHorariaPratica = 0;
	}
	
	public int cargaHorariaPratica;

	public int getCargaHorariaPratica() {
		return cargaHorariaPratica;
	}

	public void setCargaHorariaPratica(int cargaHorariaPratica) {
		this.cargaHorariaPratica = cargaHorariaPratica;
	}
}
