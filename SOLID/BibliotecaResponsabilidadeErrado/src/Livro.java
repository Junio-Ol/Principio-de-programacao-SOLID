import java.util.ArrayList;

public class Livro {
	private String nome;
	private String categoria;

	public Livro(String nome, String categoria) {
		this.nome = nome;
		this.categoria = categoria; 
	}

	public ArrayList<String> buscarLivros(ArrayList<Livro> listaLivros){
		ArrayList<String> resultado = new ArrayList<>();
	        for (Livro livro: listaLivros) {
	        	if(livro.getCategoria() == this.categoria) {
	        		resultado.add(livro.getNome());
	        	}
	        }
	   return resultado;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
		
	
}
