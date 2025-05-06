package sintaxe_basica;

public class ComandoSwitch {
	public static void main(String[] args) {
		System.out.println("Aqui eu vou usar o comando Switch!");
		String nome = "Guilherme";
		System.out.println(nome + " é um cara legal.");
		
		/*Aqui eu vou apresentar uma solução para os if's encadeados.
		 * Sabe quando a gente fica naquele monte de if's e else's encadeados?
		 * Temos a solução para isso, o comando chamado Switch.
		 * Como ele funciona?
		 * Ele permite a gente executar vários blocos de códigos com base no valor de uma única váriavel.
		 * Ele usa cada case e vai verificando até o final ou até o break
		 * Vejamos abaixo:
		 * */
		
		//Frase de negação
		String negacao = "Esse não é o mês do aniversário dele";
		
		//Várialvel que eu utilizo dentro do switch
		int mesDoAniversarioDoGuilherme = 7;

		//Aqui está ela
		switch (mesDoAniversarioDoGuilherme) {
		
		/*Aqui está as cases que vão verificando se esse é o mês de seu aniversário ou não.
		 * Caso ele encontre o mês certo antes de acabar de verificar, todos os programas, aí entra o break, que significa quebra.
		 * Mais a frase de negacao dizendo que esse mês não é o seu aniversário. Ela está guardada em uma String.
		 * Por exemplo, se o mês do meu aniversário for 37, ele não vai encontrar esse mês, porque vai até o mês 12.
		 * Então ele vai retorna, falando que não existe esse mês
		 **/
	
		case 1:
			System.out.println(negacao);
			break;
		case 2:
			System.out.println(negacao);
			break;
		case 3:
			System.out.println(negacao);
			break;
		case 4:
			System.out.println(negacao);
			break;
		case 5:
			System.out.println(negacao);
			break;
		case 6:
			System.out.println(negacao);
			break;
		case 7:
			System.out.println("Esse é o mês do aniversário dele!");
			break;
		case 8:
			System.out.println(negacao);
			break;
		case 9:
			System.out.println(negacao);
			break;
		case 10:
			System.out.println(negacao);
			break;
		case 11:
			System.out.println(negacao);
			break;
		case 12:
			System.out.println(negacao);
			break;
		default:
			System.out.println("Não existe esse mês.");
		}

	}
}
