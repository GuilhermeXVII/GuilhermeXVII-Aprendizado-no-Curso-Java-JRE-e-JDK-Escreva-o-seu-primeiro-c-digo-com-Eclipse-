package sintaxeBasica;

public class testaChar {
	public static void main(String[] args) {
		System.out.println("Olá");
		
		/*O que é char?
		 * É um armazenamento de caracters baseado na tabela da unicode.
		 * Cada número representa um caracters sendo ele  qualquer tipo de símbolo.
		 * 
		 */
		
		char letra_B = 66;
		System.out.println(letra_B);
		
		
		 /*Aqui eu fiz um casting em um char
		  *Quando fazemos isso, ele arredonda o número da tabela e 
		  *Não o caracter que ele representa 
		 */
		
		int arredondandoChar = (int)letra_B;
		System.out.println(arredondandoChar);
		
		
	}
}
