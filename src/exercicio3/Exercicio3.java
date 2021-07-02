package exercicio3;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
 * 3. Utilizando os conceitos de optional da videoaula, use os métodos abordados para fazer este exercício. 
		• crie uma lista (streams) contendo as informações da tabela abaixo: 
			Nomes: 
				Paulo 
				Camila 
				Ana Maria 
				Patrick 
				Ana Clara 
				Pedro 
				Alfredo 
		• Pesquise nomes que começam com “W”
		• Caso não existam, mostre a mensagem “Nomes com esta letra não consta na lista” – use .findAny() e .isPresent()
*/

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> nomes = Stream.of(
				"Paulo","Camila","Ana Maria","Patrick",
				"Ana Clara", "Pedro", "Alfredo")
				.collect(Collectors.toList());
		
		Optional<String> resultado = nomes.stream().filter(e -> e.startsWith("W")).findAny();
		
		if(resultado.isPresent())
			System.out.println( resultado );
		else
			System.out.println( "Nomes com esta letra não consta na lista" );
	}

}
