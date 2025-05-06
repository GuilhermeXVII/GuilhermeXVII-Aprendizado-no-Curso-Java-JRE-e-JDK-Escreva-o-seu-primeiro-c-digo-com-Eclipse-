package sintaxe_basica;

public class TestaSomatoria {
	public static void main(String[] args) {
		System.out.println("Somatória do Rato, olha a coluna de queijo que ele criou!");
		
		//A linha vai ser menor ou igual a 3
		//linha ++ vai acresentando de 1 em 1
		
		//coluna igual a 0 coluna menor ou igual a 10
		//coluna++ vai acresentando de 1 em 1
		
		//Sysout("*") -- o que vai ser exibido
		//Mais a quebra de linha
		
			for(int linha = 0; linha <= 3; linha++){
				for(int coluna = 0; coluna <= 10; coluna++) {
					System.out.print("*");
				}
				System.out.println(linha);
			
			}
			
			
			
			
			for(int linha = 0; linha <= 3; linha++){
				for(int coluna = 0; coluna <= linha; coluna++) {
					System.out.print("*");
				}
				System.out.println(linha);
			
			}
	}
}
