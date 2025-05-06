package sintaxe_basica;

public class TestaFor {
	public static void main(String[] args) {
		
		/*Laços ou estruturas de repetição.
		 * Para o que serve?
		 * Ele executa uma condição verdadeira ou até que um certo número seja colocado como limite.
		 * Exemplo, vamos ver a tabuada de 5.
		 * A gente teria que ficar fazendo manualmente: 5 * 1; 5 * 2; 5 * 3; 5 * 4; 5 * 5;....(até o 10)
		 *Em java temos o for é o while para fazer isso. Mas vamos falar primeiro do for
		 *O for, ele recebe o seguinte:
		 *
		 *			for(tipo da variável = x; x <= 10; x++)
		 *
		 *			for(tipodaVariável mais o número; condicional; incrementador){
		 *				System.out.println(x * 2);
		 *			}
		 *
		 *Esqueci de dizer que ele também pode receber true ou false
		 *Veja o exemplo abaixo:
		 * */
		
		for (int multiplicador = 1; multiplicador <= 10; multiplicador++) {
			System.out.println(multiplicador * 2);

		}

		//Se reparar nesse eu coloquei o limite até o 10, é o meu incrementador eu fiz de uma forma diferente
		//Coloquei +=1 é não ++
		//Ele vai multiplicando adiciona +1 a cada vez 3*1 = 3 3*2 = 6 é segue até o seu limite que é o 10
		
		for(int multiplicador = 1; multiplicador <= 10; multiplicador+=1) {
			System.out.println("Aqui está a tabuada do 3: " + multiplicador * 3);
			
		}

	
	}
}
