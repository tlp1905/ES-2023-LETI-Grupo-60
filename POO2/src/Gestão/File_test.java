package Gest�o;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

import Gest�o.Aluno;
import Gest�o.Disciplina;

public class File_test {


	public static void main(String[] args) {
		Aluno aluno1 = new Aluno( 104999, "Jo�o" ) ;
		File file = new File("Exemplo/exemplo.txt");
		try{
			Scanner scanner = new Scanner(file);
			
			while(scanner.hasNext()){
				System.out.println(scanner.next());
			}
			scanner.close();
		}catch(FileNotFoundException e){
			
			System.err.println("Erro na leitura do ficheiro");
		
		}
		
			File file_estudantes = new File("Exemplo/estudantes.txt");
			ArrayList<Aluno> alunos = Aluno.criarListaAlunos(file_estudantes);
			for(Aluno aluno : alunos){
			System.out.println(aluno.toString());
		// TODO Auto-generated method stub

	}

			File file_disciplina = new File ("Exemplo/Disciplina.txt") ;
					Disciplina d = new Disciplina (" Programa��o Orientada a Objetos", "POO", 100);
			d.inscrever(aluno1);
			d.lancarNota(69130, 20);
			
			d.escreveDisciplina(file_disciplina);
			
	}
			
}
