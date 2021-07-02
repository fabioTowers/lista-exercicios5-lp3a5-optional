package exercicio4;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*4. Reescreva o c�digo do exerc�cio anterior lan�ando direto uma exce��o caso o nome com �W� n�o exista (sem usar isPresent(), 
 * usando orElseThrow.*/

public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> nomes = Stream.of(
				"Paulo","Camila","Ana Maria","Patrick",
				"Ana Clara", "Pedro", "Alfredo")
				.collect(Collectors.toList());
		
		Optional<String> resultado = nomes.stream().filter(e -> e.startsWith("W")).findAny();
		
		
		System.out.println( resultado.orElseThrow( () -> new NullPointerException("Vazio") ) );
	}

}
