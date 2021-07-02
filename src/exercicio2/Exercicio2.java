package exercicio2;

import java.util.Optional;

/*
 * 2. Utilizando os conceitos de optional da videoaula, use os m�todos abordados para fazer este exerc�cio. Crie um programa que: 
	a) Crie uma vari�vel sem valor usando Optional 
	b) Crie uma vari�vel com valor usando Optional 
		� Testar as duas vari�veis. 
		� Usar orElseThrow para lan�ar a exce��o no caso da vari�vel vazia 
		� Usar orElseThrow para mostrar conte�do da vari�vel n�o vazia 
		� Mostre o resultado das duas situa��es
*/

public class Exercicio2 {

	public static void main(String[] args) {
		
		// a) Crie uma vari�vel sem valor usando Optional
		Optional<String> var = Optional.empty();
		
		// b) Crie uma vari�vel com valor usando Optional
		Optional<String> varNaoVazia = Optional.of("Valor de varNaoVazia");
		
		System.out.println( varNaoVazia.orElseThrow( () -> new NullPointerException("var est� vazia.") ) );
		System.out.println( var.orElseThrow( () -> new NullPointerException("var est� vazia.") ) );
	}

}
