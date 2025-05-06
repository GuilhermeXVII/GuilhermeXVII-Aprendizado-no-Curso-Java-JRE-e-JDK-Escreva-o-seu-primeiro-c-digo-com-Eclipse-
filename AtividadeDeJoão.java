package sintaxe_basica;

//Nessa atividade, vamos calcular o imposto de renda e sua alíquota:

public class AtividadeDeJoão {
	public static void main(String[] args) {
		System.out.println("Imposto de renda é sua alíquota");

		// Aqui está o salário--->>

		double salario = 3300.0;

		/*
		 * Logo abaixo, fazemos o nosso casting, mas o que é isso? Casting, é o processo
		 * de converter um valor para outro tipo de dado. Nesse exemplo abaixo, veja que
		 * eu estou forçando a variável 'salario' que é do tipo double dentro de um int
		 * com um novo nome.
		 * 
		 **/

		int arredondandoOSalario = (int) salario;
		System.out.println("Seu salário é " + arredondandoOSalario + " reais.");

		/*
		 * Aqui criei uma condicional que é o seguinte: se a variável 'salario' for
		 * menor ou igual a 3751.0 vamos jogar a seguinte fórmula para calcular:
		 * 				15 * arredondandoOSalario/ 100
		 * 
		 * Ao exibir os valores também podemos colocar o
		 * (int)nomedaVariavel Para mostrar o número mais redondo.
		 * 
		 **/

		if (arredondandoOSalario <= 3751.0) {
			double calculandoAliquoata = 15 * arredondandoOSalario/ 100;

			double deducaoFinal = calculandoAliquoata - 350;
			System.out.println("Vamos descontar " + (int) deducaoFinal + " de imposto, assim ficando " + (int) calculandoAliquoata + " - " + " 350 " + " = " + (int) deducaoFinal + " reais de imposto!");

		}

	}
}
