package provaProg;


public class aluno {
	
	public int codigoAluno;
	public String nomeAluno;
	
	
	public aluno() {
		this.codigoAluno = 0;
		this.nomeAluno = "";
	}
	
	public aluno(int codigoAluno, String nomeAluno) {
		super();
		this.codigoAluno = codigoAluno;
		this.nomeAluno = nomeAluno;
	}
	public int getCodigoAluno() {
		return codigoAluno;
	}
	public void setCodigoAluno(int codigoAluno) {
		this.codigoAluno = codigoAluno;
	}
	public String getNomeAluno() {
		return nomeAluno;
	}
	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}
	
}
