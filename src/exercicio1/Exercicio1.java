package exercicio1;

import java.util.Optional;

/*1. Exerc�cio. Crie um programa que:
 * 
	a) Crie uma vari�vel sem valor usando Optional. para optional vazio implemente: 
		� Teste: se o optional vazio obter a string usando orElse 
		� Mostrar resultado 
		� Teste: se o optional a vazio obter a string usando orElseGet 
		� Mostrar resultado
		
	b) Crie uma vari�vel com valor usando Optional: uma com valor e outra vazia, para optional vazio implemente: 
		� Teste: se o optional vazio obter a string usando orElse 
		� Mostrar resultado 
		� Teste: se o optional a vazio obter a string usando orElseGet
		� Mostrar resultado
*/

public class Exercicio1 {

	public static void main(String[] args) {
		
		/***LETRA A****/
		Optional<String> var = Optional.empty();
		
		System.out.println( var.orElse("var est� vazia.") );
		
		System.out.println( var.orElseGet( ()->"var est� vazia.\n\n" ) );
		
		/***LETRA B****/
		Optional<String> varVazia = Optional.empty();
		Optional<String> varNaoVazia = Optional.of("Valor de varNaoVazia");
		
		System.out.println( varVazia.orElse("varVazia est� vazia.") );
		System.out.println( varVazia.orElseGet( ()->"varVazia est� vazia." ) );
		
		System.out.println( varNaoVazia.orElse("var est� vazia.") );
		System.out.println( varNaoVazia.orElseGet( ()->"var est� vazia." ) );
	}

}
