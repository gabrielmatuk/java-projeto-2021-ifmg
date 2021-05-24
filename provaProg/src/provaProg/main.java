package provaProg;
import java.util.*;

public class main {
	public static void main(String [] args) {
		
		Stack<aluno>arrayAluno = new Stack<aluno>();
		aluno alunoTemp = new aluno();
		Stack<disciplinaPratica> arrayDisciplinaPratica = new Stack<disciplinaPratica>();
		disciplinaPratica disciplinaPraticaTemp = new disciplinaPratica();
		Stack<disciplinaTeorica> arrayDisciplinaTeorica = new Stack<disciplinaTeorica>();
		disciplinaTeorica disciplinaTeoricaTemp = new disciplinaTeorica();
		Stack<matricula> arrayMatricula = new Stack<matricula>();
		matricula matriculaTemp = new matricula();
		int menu = 0; 
		boolean verificador = true;
		int codigoAluno = 0, codigoDisciplina = 0, ano = 0, bimestre = 0, index = -1, nota = 0;

		Scanner teclado = new Scanner(System.in);
	do { 
		System.out.println("1. Cadastrar as disciplinas oferecidas na escola");
		System.out.println("2. Cadastrar alunos");
		System.out.println("3. Matricular aluno em uma disciplina qualquer");
		System.out.println("4. Lançar notas de um aluno");
		System.out.println("5. Mostrar Boletim do aluno");
		System.out.println("6. Sair do programa");
		menu = teclado.nextInt();
		switch(menu) {
		case 1:
			System.out.println("Entrou no: Cadastro de disciplina");
			
			break;
		case 2:
			System.out.println("Entrou no: Cadastro de aluno");
			codigoAluno = 0;
			do {
				if(!verificador)
					System.out.println("Código de aluno já existente");
			
				verificador = true;
				System.out.println("Digite o código do aluno: ");
				codigoAluno = teclado.nextInt();
				for(int i = 0; i<arrayAluno.size(); i++) {
					if(arrayAluno.get(i).codigoAluno == codigoAluno)
					verificador = false;
				}
			}while(!verificador);
			
			System.out.println("Digite o nome do aluno: ");
			String nomeAluno = teclado.next();
			alunoTemp = new aluno(codigoAluno, nomeAluno);
			arrayAluno.push(alunoTemp);
			break;
		case 3: 
			//matricula
			break;
		case 4: 
			System.out.println("Entrou no: Lançar notas de um aluno");
			codigoAluno = 0;
			codigoDisciplina = 0;
			ano = 0;
			bimestre = 0;
			index = -1;
			do {
				if(index == -1)
					System.out.println("Matrícula inválida");
			
				verificador = true;
				System.out.println("Digite o código do aluno: ");
				codigoAluno = teclado.nextInt();
				System.out.println("Digite o código da disciplina: ");
				codigoDisciplina = teclado.nextInt();
				System.out.println("Digite o ano: ");
				ano = teclado.nextInt();
				System.out.println("Digite o bimestre: ");
				bimestre = teclado.nextInt();
				for(int i = 0; i<arrayMatricula.size(); i++) {
					if(arrayMatricula.get(i).aluno.codigoAluno == codigoAluno && arrayMatricula.get(i).disciplina.codigoDisciplina == codigoDisciplina && arrayMatricula.get(i).anoLetivo == ano && arrayMatricula.get(i).serie == bimestre)
					index = i;
				}
			}while(index == -1);
			
			nota = 0;
			
			do {
				if(!(nota>=0 && nota<=25))
				System.out.println("Valor de nota inválida");
				
				System.out.println("Digite a nota do primeiro bimestre: ");
				
				nota = teclado.nextInt();
			}while(!(nota>=0 && nota<=25));
			arrayMatricula.get(index).setNotaBi1(nota);
			
			do {
				if(!(nota>=0 && nota<=25))
				System.out.println("Valor de nota inválida");
				
				System.out.println("Digite a nota do segundo bimestre: ");
				
				nota = teclado.nextInt();
			}while(!(nota>=0 && nota<=25));
			arrayMatricula.get(index).setNotaBi2(nota);
			
			do {
				if(!(nota>=0 && nota<=25))
				System.out.println("Valor de nota inválida");
				
				System.out.println("Digite a nota do terceiro bimestre: ");
				
				nota = teclado.nextInt();
			}while(!(nota>=0 && nota<=25));
			arrayMatricula.get(index).setNotaBi3(nota);
			
			do {
				if(!(nota>=0 && nota<=25))
				System.out.println("Valor de nota inválida");
				
				System.out.println("Digite a nota do quarto bimestre: ");
				
				nota = teclado.nextInt();
			}while(!(nota>=0 && nota<=25));
			arrayMatricula.get(index).setNotaBi4(nota);
			
			break;
		case 5:
			System.out.println("Entrou no: Lançar notas de um aluno");
			codigoAluno = 0;
			ano = 0;
			bimestre = 0;
			index = -1;
			do {
				if(index == -1) {
					System.out.println("Não foram encontradas disciplinas para esse boletim");
					break;
				}
				verificador = true;
				System.out.println("Digite o código do aluno: ");
				codigoAluno = teclado.nextInt();
				System.out.println("Digite o ano: ");
				ano = teclado.nextInt();
				System.out.println("Digite o bimestre: ");
				bimestre = teclado.nextInt();
				for(int i = 0; i<arrayMatricula.size(); i++) {
					if(arrayMatricula.get(i).aluno.codigoAluno == codigoAluno && arrayMatricula.get(i).anoLetivo == ano && arrayMatricula.get(i).serie == bimestre) {
					arrayMatricula.get(i).setMedia();
					System.out.println("Disciplina: " + arrayMatricula.get(i).disciplina.nomeDisciplina + "Nota 1: " + arrayMatricula.get(i).notaBi1 + "Nota 2:" + arrayMatricula.get(i).notaBi2 + "Nota 3:" + arrayMatricula.get(i).notaBi3 + "Nota 4: " + arrayMatricula.get(i).notaBi4 + "Média: " + arrayMatricula.get(i).media);
					index = i;
					}
					
				}
			}while(index == -1);
			
			break;
		case 6:	
		break;
		
		default: 
			System.out.println("Opção de menu inválida");
			break;
			}

		
		}while(menu != 6);
		
		teclado.close();
	}
	
}