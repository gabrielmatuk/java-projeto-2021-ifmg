package provaProg;

public class matricula {
	public int anoLetivo;
	public int serie;
	public aluno aluno;
	public disciplina disciplina;
	public float notaBi1 = 0;
	public float notaBi2 = 0;
	public float notaBi3 = 0;
	public float notaBi4 = 0;
	public float media;
	

	public int getAnoLetivo() {
		return anoLetivo;
	}
	public void setAnoLetivo(int anoLetivo) {
		this.anoLetivo = anoLetivo;
	}
	public int getSerie() {
		return serie;
	}
	public void setSerie(int serie) {
		this.serie = serie;
	}
	public aluno getAluno() {
		return aluno;
	}
	public void setAluno(aluno aluno) {
		this.aluno = aluno;
	}
	public disciplina getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(disciplina disciplina) {
		this.disciplina = disciplina;
	}
	public float getNotaBi1() {
		return notaBi1;
	}
	public void setNotaBi1(float notaBi1) {
		if(notaBi1 >= 0 && notaBi1<=25)
		this.notaBi1 = notaBi1;
		else
			System.out.println("Nota inválida");
	}
	public float getNotaBi2() {
		return notaBi2;
	}
	public void setNotaBi2(float notaBi2) {
		if(notaBi2 >= 0 && notaBi2<=25)
		this.notaBi2 = notaBi2;
		else
			System.out.println("Nota inválida");
	}
	public float getNotaBi3() {
		return notaBi3;
	}
	public void setNotaBi3(float notaBi3) {
		if(notaBi3 >= 0 && notaBi3<=25)
		this.notaBi3 = notaBi3;
		else
			System.out.println("Nota inválida");
	}
	public float getNotaBi4() {
		return notaBi4;
	}
	public void setNotaBi4(float notaBi4) {
		if(notaBi4 >= 0 && notaBi4<=25)
		this.notaBi4 = notaBi4;
		else
			System.out.println("Nota inválida");
	}
	public float getMedia() {
		return media;
	}
	public void setMedia() {
		if(this.disciplina instanceof disciplinaPratica)
		this.media = (this.notaBi1 + this.notaBi2*2 + this.notaBi3 + this.notaBi4*2)/6;
		else if(this.disciplina instanceof disciplinaTeorica)
		this.media = (this.notaBi1 + this.notaBi2 + this.notaBi3 + this.notaBi4)/4;
	}
	
	public matricula(int anoLetivo, int serie, provaProg.aluno aluno, provaProg.disciplina disciplina, float notaBi1,
			float notaBi2, float notaBi3, float notaBi4) {
		super();
		this.anoLetivo = anoLetivo;
		this.serie = serie;
		this.aluno = aluno;
		this.disciplina = disciplina;
		this.notaBi1 = notaBi1;
		this.notaBi2 = notaBi2;
		this.notaBi3 = notaBi3;
		this.notaBi4 = notaBi4;
		this.setMedia();
	}
	public matricula() {
		this.anoLetivo = 0;
		this.serie = 0;
		this.aluno = new aluno();
		this.disciplina = new disciplinaPratica();
	}
	public void setNotas(float notaBi1, float notaBi2, float notaBi3, float notaBi4) {
		this.notaBi1 = notaBi1;
		this.notaBi2 = notaBi2;
		this.notaBi3 = notaBi3;
		this.notaBi4 = notaBi4;
	}
}
