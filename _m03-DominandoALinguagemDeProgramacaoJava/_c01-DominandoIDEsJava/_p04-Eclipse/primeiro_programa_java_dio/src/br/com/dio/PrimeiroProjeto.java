package br.com.dio;

//ctrl + shift + o é o atalho para importar pacotes no código.
import br.com.dio.model.Gato;

/**
 * @author Felipe Dantas
 *
 */
public class PrimeiroProjeto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// feito no Eclipse
		/*
		int numero1 = 2;
		int numero2 = 3;
		System.out.println("Hello World " + (numero1 + numero2));
		*/
		
		//criando o objeto Gato
		Gato gato = new Gato();
		
		//classes no mesmo código não é necessário a importação
		Livros livros = new Livros();
		
		System.out.println(gato);
		System.out.println(livros);
	}

}

// nova classe
class Livros {
	private String nome;
	private String numeroDePaginas;
}
