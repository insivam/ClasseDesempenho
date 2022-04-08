package Classes;

import java.util.Scanner;

public class Desempenho {
	
	public static void main(String[] args) {
		
	String matrizAlunos[][] = {
                { "Alana", "1", "", "1" },
                { "Clara", "2", "", "2" },
                { "Joana", "4", "", "3" }
        };


    /*
     * IrÃ¡ passar por uma lista de alunos
     * e deixara o professor selecionar um desempenho
     * de uma lista de desempenhos (ex: Bom, Regular, Ruim)
     * O professor tambem pode adicionar uma sugestÃ£o para
     * melhora de desempenho (NÃ£o Ã© obrigatorio)
     * 
     * Vai se chamar calculaDesempenho
     * e vai receber a matrizAlunos
     */


				Scanner leia = new Scanner(System.in);
						int opcao;
							String observacao= "";

    for (int i = 0; i < matrizAlunos.length; i++) {

        do { // Tratamento de erro
            System.out.println("\nQual o Desempenho de " + matrizAlunos[i][0] + "?");
            System.out.print(" 1. Ruim\n 2. Regular\n 3. Bom\n 4. Muito Bom "+
    				"\nSelecione uma op��o: ");
            opcao = leia.nextInt();
            
            if(opcao<1||opcao>4) {
				System.out.println("Selecione um n�mero eleg�vel!");
				
				
			}
            System.out.println(); 
        } while (opcao < 1 || opcao > 4);
        
        matrizAlunos[i][1] = Integer.toString(opcao);

        do { // Tratamento de erro
            System.out.print("Deseja fazer uma observa��o?\n 1. Sim\n 2. N�o\nSelecione uma op��o: ");
            opcao = leia.nextInt();
            
            if(opcao<1||opcao>2) {
				System.out.println("Selecione um n�mero eleg�vel!");
				
				
			}
            System.out.println();
        } while (opcao < 1 || opcao > 2);

        if (opcao == 1) {
        	
        	leia.nextLine();//--> como existe muitos nextInt toda vez que a tecla enter � teclada   
        	System.out.print("Mensagem: "); //um \n � computado desalinhado o codigo... um nextLine(); a mais � necess�rio.
            observacao = leia.nextLine();
            
            //System.out.println(observacao); --> verificar se est� certo
            System.out.println("Obrigado pelo feedback :)");
            

            matrizAlunos[i][1] = observacao;
        }else if(opcao == 2) {
			System.out.println("Obrigado pelo feedback :)");
		}else {
			System.out.println("Selecione um n�mero eleg�vel!");
			
		}
    }
   leia.close();
    
	}
}