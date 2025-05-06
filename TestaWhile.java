package sintaxe_basica;

public class TestaWhile {
	public static void main(String[] args) {
		System.out.println("Laçõs de repetição.");
		
		//Agora vamos para o outro laço ou loop chamdo while.
		/*Laços ou estruturas de repetição.
		 * Para o que serve?
		 * Ele executa uma condição verdadeira ou até que um certo número seja colocado como limite.
		 * Exemplo, vamos ver a tabuada de 5.
		 * A gente teria que ficar fazendo manualmente: 5 * 1; 5 * 2; 5 * 3; 5 * 4; 5 * 5;....(até o 10)
		 * Em java temos o for é o while para fazer isso. Mas vamos falar primeiro do while
		 * O while, ele recebe true or false
		 *
		 **/
		
		
		//No while, a gente cria a variável fora de seu escopo é colocamos a condição dentro do while. No exemplo abaixo colocamos que multiplicador e menor ou igual a 10
		//Isso está falando que ele vai continuar enquanto ele é menor ou igual a 10
		//Quando ele chegar até 10, ele para sozinho.
		//Mas a pergunta é! Qual dos dois usar?
		//A resposta é mais simples do que parece. Use de acordo com a sua necessidade
		
		int multiplicador = 1;
		
		while(multiplicador <= 10) {
			System.out.println("Saia com a tabuada do 9: " + multiplicador * 9);
			multiplicador++;
			
		}
		
		/*Falando sobre incrementadores. Ele são o quanto a gente quer após isso, no exemplo da tabuada, vamos querer
		 * que ele adicione +1 a cada multiplicação assim ficando 9 * 1; 9 * 2; 9 * 3....(até o seu limite que é 10)
		 * Também temos os tipos de incrementadores
		 * ++ adiciona de 1 em 1 
		 * +=1; +=2; +=3; +=4; +=5.... é segue adiante
		 * */
		
		
	}
}
