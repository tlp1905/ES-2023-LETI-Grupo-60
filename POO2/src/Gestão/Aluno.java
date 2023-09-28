package Gestão;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Aluno {
private int numero ;
private String nome ;


public Aluno ( int numero , String nome ) {
	
	this.numero = numero ;
	
	this.nome = nome ;
	
	
}

public int getNumero() {
	
	return numero ;
	
}

public String getName() {
	
	return nome ;
	
}



	public static ArrayList<Aluno> criarListaAlunos(File file) {
		ArrayList<Aluno> alunos = new ArrayList<>();
		// TODO Auto-generated method stub
		try{
			
			Scanner sc = new Scanner ( file ) ;
			
			while ( sc.hasNextLine() ) {
				
				int numero = sc.nextInt();
				
				String nome = sc.nextLine () ;
				
				Aluno aluno = new Aluno ( numero , nome ) ;				
				
				alunos.add(aluno) ;
				
			}
			
			sc.close () ;
			
		}catch ( FileNotFoundException e ) {
			
			System.err.println(" Erro na leitura do ficheiro ") ;
			
			
		}

		return alunos ;
		
	}

	public String toString () {
		
		return " NR : " + numero + " Nome : " + nome ;
		
	}
	
}
