package sintaxe_basica;

public class AtividadesParaFixar {
	public static void main(String[] args) {
		
		//Idade mínima da pessoa
		double idadeMinima = 18.5;
		
		/*Logo abaixo, fazemos o nosso casting, mas o que é isso? Casting, é o processo
		 * de converter um valor para outro tipo de dado. Nesse exemplo abaixo, veja que
		 * eu estou forçando a variável 'salario' que é do tipo double dentro de um int
		 * com um novo nome.
		 */
		int idadeMinimaMelhor = (int)idadeMinima;
		
		//Quantidade de acompanhantes
		int acompanhates = 1;

		//Expressão booleana:
		/*A expressão booleana, só recebe true or false.
		 *Serve para controlar o fluxo de execução do programa
		 *Assim como condicionais e loops
		 *Que nem eu fiz logo abaixo:
		 * */
		boolean pessoas = acompanhates >= 1;		

		/*Aqui é uma condicional que verifica a idade e as pessoas
		 * Se a idadeMinima for maior ou igual a 18 e pessoas maior igual a 1. Acesso liberado!
		 * Se não. Acesso negado!
		 * */
		if(idadeMinimaMelhor >= 18 && pessoas ){
			System.out.println("Sejam bem vindos!");
		} else {
			System.out.println("Lamento, mas você não pode entar pois não cumpre alguns requisitos!");
		}


		
	}
}
