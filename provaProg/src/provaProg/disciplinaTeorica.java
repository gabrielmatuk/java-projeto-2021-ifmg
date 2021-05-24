package provaProg;

public class disciplinaTeorica extends disciplina{
	
	public disciplinaTeorica(int codigoDisciplina, String nomeDisciplina, int cargaDisciplina, String bibliografiaPrincipal) {
		super(codigoDisciplina, nomeDisciplina, cargaDisciplina);
		this.bibliografiaPrincipal = bibliografiaPrincipal;
	}
	public disciplinaTeorica() {
		super(0, "", 0);
		this.bibliografiaPrincipal = "";
	}
	public String bibliografiaPrincipal;

	public String getBibliografiaPrincipal() {
		return bibliografiaPrincipal;
	}

	public void setBibliografiaPrincipal(String bibliografiaPrincipal) {
		this.bibliografiaPrincipal = bibliografiaPrincipal;
	}
}
