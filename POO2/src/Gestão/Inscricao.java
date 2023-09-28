package Gestão;

public class Inscricao {
	
	private int nota ;
	
	private Aluno aluno ;
	
	

	public static final int NA = -1 ;
	
	public Inscricao ( Aluno aluno ) {
		
		this.aluno = aluno ;
		
		nota = NA ;
		
	}
	
	public int getNota() {
		
		return nota ;
		
	}
	
	public Aluno getAluno() {
		
		return aluno ;
		
	} 
	
	public boolean temNota() {
		
		if ( nota == NA ) {
			
			return false ;
			
		}else{
			
			return true ;
			
		}
		
	}
		
		public void setNota ( int nota ) {
			
			if ( nota >= 0 && nota <= 20 ) {
this.nota = nota ;				
			}else{
				
				System.err.println( " Nota inválida " );
				
			}
			
		}
		
		public String toString () {
			
			String result = aluno.toString() + " - " ;
			if ( nota == NA ) {
			
				result += "NA" ;
				
			}else{
				
				result += nota + " valores " ;
				
				
			}
			
			return result ;
			
		}
		
	}
	
		// TODO Auto-generated method stub

	


