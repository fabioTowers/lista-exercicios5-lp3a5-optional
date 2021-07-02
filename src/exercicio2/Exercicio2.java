package exercicio2;

import java.util.Optional;

/*
 * 2. Utilizando os conceitos de optional da videoaula, use os métodos abordados para fazer este exercício. Crie um programa que: 
	a) Crie uma variável sem valor usando Optional 
	b) Crie uma variável com valor usando Optional 
		• Testar as duas variáveis. 
		• Usar orElseThrow para lançar a exceção no caso da variável vazia 
		• Usar orElseThrow para mostrar conteúdo da variável não vazia 
		• Mostre o resultado das duas situações
*/

public class Exercicio2 {

	public static void main(String[] args) {
		
		// a) Crie uma variável sem valor usando Optional
		Optional<String> var = Optional.empty();
		
		// b) Crie uma variável com valor usando Optional
		Optional<String> varNaoVazia = Optional.of("Valor de varNaoVazia");
		
		System.out.println( varNaoVazia.orElseThrow( () -> new NullPointerException("var está vazia.") ) );
		System.out.println( var.orElseThrow( () -> new NullPointerException("var está vazia.") ) );
	}

}
