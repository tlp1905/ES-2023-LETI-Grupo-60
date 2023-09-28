package Gestão;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter ;
import java.util.ArrayList;
import Gestão.Aluno ;  
import Gestão.Inscricao ; 


public class Disciplina {

	private String nome ; 
	private String sigla ; 
	private int capacidade ; 
	private ArrayList<Inscricao> inscricoes ; 
	
	public Disciplina ( String nome , String sigla , int capacidade ) {
		
		this.nome = nome ;
		this.sigla = sigla ;
		this.capacidade = capacidade ;
		inscricoes = new ArrayList<>() ;
		
		
	}
	
	public String getNome() {
		return nome;
	}

	public void inscrever (Aluno aluno) {
		if(inscricoes.size()< capacidade) {
			inscricoes.add(new Inscricao(aluno));
		}else{
			System.err.println("Capacidade excedida em " + sigla + " Impossível i" ); 
	}
	}
	
	public Inscricao procuraInscricao (int numero_aluno) {
		Inscricao result = null ;
	for(Inscricao ins : inscricoes) {
		if(ins.getAluno().getNumero() == numero_aluno) {
			return ins;
		
	}
	
	}
	System.err.println("Aluno numero" + numero_aluno + "nao encontrado");
	return null;
	}
	
	public void desinscrever (int numero_aluno) {
		Inscricao ins = procuraInscricao(numero_aluno);
		if(ins != null)
		inscricoes.remove(ins);
	}
	
	public void lancarNota (int numero_aluno , int nota) {
		Inscricao ins = procuraInscricao(numero_aluno);
		if (ins != null){
			ins.setNota(nota);
		}
	}
	
	public void escreveDisciplina (File file) {
	try{
	
		PrintWriter writer = new PrintWriter(file);
		writer.println(nome);
		writer.println(capacidade);
		for(Inscricao i : inscricoes) {
			Aluno aluno = i.getAluno() ;
			writer.print(aluno.getNumero());
			if(i.temNota()){
				writer.println("" + i.getNota());
			}else{
				writer.println("NA ");
			}	
			}
	}
	catch(FileNotFoundException e){
		System.err.println("Erro na leitura do ficheiro");
		
	}
		
	
	}
	
	public String toString() {
		String result = "Disciplina [ nome =" + nome + ", sigla" + sigla + ", capacidade" + capacidade ;
		for (Inscricao ins : inscricoes) {
			result += ins.toString();
		}
		return result ;
		
		// TODO Auto-generated method stub

	}

}
