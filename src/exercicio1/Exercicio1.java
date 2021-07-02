package exercicio1;

import java.util.Optional;

/*1. Exercício. Crie um programa que:
 * 
	a) Crie uma variável sem valor usando Optional. para optional vazio implemente: 
		• Teste: se o optional vazio obter a string usando orElse 
		• Mostrar resultado 
		• Teste: se o optional a vazio obter a string usando orElseGet 
		• Mostrar resultado
		
	b) Crie uma variável com valor usando Optional: uma com valor e outra vazia, para optional vazio implemente: 
		• Teste: se o optional vazio obter a string usando orElse 
		• Mostrar resultado 
		• Teste: se o optional a vazio obter a string usando orElseGet
		• Mostrar resultado
*/

public class Exercicio1 {

	public static void main(String[] args) {
		
		/***LETRA A****/
		Optional<String> var = Optional.empty();
		
		System.out.println( var.orElse("var está vazia.") );
		
		System.out.println( var.orElseGet( ()->"var está vazia.\n\n" ) );
		
		/***LETRA B****/
		Optional<String> varVazia = Optional.empty();
		Optional<String> varNaoVazia = Optional.of("Valor de varNaoVazia");
		
		System.out.println( varVazia.orElse("varVazia está vazia.") );
		System.out.println( varVazia.orElseGet( ()->"varVazia está vazia." ) );
		
		System.out.println( varNaoVazia.orElse("var está vazia.") );
		System.out.println( varNaoVazia.orElseGet( ()->"var está vazia." ) );
	}

}
